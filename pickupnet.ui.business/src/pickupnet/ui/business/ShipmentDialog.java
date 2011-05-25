/*******************************************************************************
 * Copyright (c) EclipseSource (2011). All Rights Reserved.
 * 
 * Contributors:
 *      Holger Staudacher - initial API and Implementation
 ******************************************************************************/
package pickupnet.ui.business;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

import pickupnet.Address;
import pickupnet.Customer;
import pickupnet.GeoLocation;
import pickupnet.Pickupnet;
import pickupnet.PickupnetFactory;
import pickupnet.Shipment;
import pickupnet.util.GeoCoder;


public class ShipmentDialog extends Dialog {

  private Text toGeo;
  private Text toAddress;
  private Text fromGeo;
  private Text fromAddress;
  private String userId;

  protected ShipmentDialog( Shell parentShell, String userId ) {
    super( parentShell );
    this.userId = userId;
  }
  
  @Override
  protected Control createContents( Composite parent ) {
    parent.getShell().setText( "Place Shipment" );
    parent.getShell().setData( "org.eclipse.rwt.themeVariant", "dialog" );
    parent.setLayout( new FillLayout() );
    Composite contentArea = new Composite( parent, SWT.NONE );
    contentArea.setLayout( new GridLayout( 4, true ) );
    
    Label from = new Label( contentArea, SWT.NONE );
    from.setData( "org.eclipse.rwt.themeVariant", "id" );
    GridData fromLabelLayoutData = new GridData( SWT.FILL, SWT.FILL, true, false );
    fromLabelLayoutData.horizontalSpan = 4;
    from.setLayoutData( fromLabelLayoutData );
    from.setText( "From:" );
    
    Label fromAddressLabel = new Label( contentArea, SWT.NONE );
    fromAddressLabel.setData( "org.eclipse.rwt.themeVariant", "location" );
    fromAddressLabel.setLayoutData( new GridData( SWT.BEGINNING, SWT.CENTER, false, false ) );
    fromAddressLabel.setText( "Address" );
    
    fromAddress = new Text( contentArea, SWT.SINGLE | SWT.LEAD | SWT.BORDER );
    fromAddress.setData( "org.eclipse.rwt.themeVariant", "big" );
    GridData fromAddressLayoutData = new GridData( SWT.FILL, SWT.CENTER, true, false );
    fromAddressLayoutData.horizontalSpan = 3;
    fromAddressLayoutData.widthHint = 300;
    fromAddress.setLayoutData( fromAddressLayoutData );
    
    Label fromGeoLabel = new Label( contentArea, SWT.NONE );
    fromGeoLabel.setData( "org.eclipse.rwt.themeVariant", "location" );
    fromGeoLabel.setLayoutData( new GridData( SWT.BEGINNING, SWT.CENTER, false, false ) );
    fromGeoLabel.setText( "Lat/Lon" );
    
    fromGeo = new Text( contentArea, SWT.SINGLE | SWT.LEAD | SWT.BORDER );
    fromGeo.setData( "org.eclipse.rwt.themeVariant", "big" );
    fromGeo.setLayoutData( fromAddressLayoutData );
    
    Label to = new Label( contentArea, SWT.NONE );
    to.setData( "org.eclipse.rwt.themeVariant", "id" );
    to.setLayoutData( fromLabelLayoutData );
    to.setText( "To:" );
    
    Label toAddressLabel = new Label( contentArea, SWT.NONE );
    toAddressLabel.setData( "org.eclipse.rwt.themeVariant", "location" );
    toAddressLabel.setLayoutData( new GridData( SWT.BEGINNING, SWT.CENTER, false, false ) );
    toAddressLabel.setText( "Address" );
    
    toAddress = new Text( contentArea, SWT.SINGLE | SWT.LEAD | SWT.BORDER );
    toAddress.setData( "org.eclipse.rwt.themeVariant", "big" );
    GridData toAddressLayoutData = new GridData( SWT.FILL, SWT.CENTER, true, false );
    toAddressLayoutData.horizontalSpan = 3;
    toAddress.setLayoutData( toAddressLayoutData );
    
    Label toGeoLabel = new Label( contentArea, SWT.NONE );
    toGeoLabel.setData( "org.eclipse.rwt.themeVariant", "location" );
    toGeoLabel.setLayoutData( new GridData( SWT.BEGINNING, SWT.CENTER, false, false ) );
    toGeoLabel.setText( "Lat/Lon" );
    
    toGeo = new Text( contentArea, SWT.SINGLE | SWT.LEAD | SWT.BORDER );
    toGeo.setData( "org.eclipse.rwt.themeVariant", "big" );
    toGeo.setLayoutData( toAddressLayoutData );
    
    Button addShipmentButton = new Button( contentArea, SWT.PUSH );
    addShipmentButton.setData( "org.eclipse.rwt.themeVariant", "menu" );
    GridData addButtonLayoutData = new GridData( SWT.RIGHT, SWT.CENTER, true, false );
    addButtonLayoutData.horizontalSpan = 3;
    addShipmentButton.setLayoutData( addButtonLayoutData );
    addShipmentButton.setText( "Place Shipment" );
    addShipmentButton.addSelectionListener( new SelectionAdapter() {
      public void widgetSelected( SelectionEvent e ) {
        handlePlaceShipment();
      };
    } );
    
    Button cancelButton = new Button( contentArea, SWT.PUSH );
    cancelButton.setData( "org.eclipse.rwt.themeVariant", "menu" );
    cancelButton.setLayoutData( new GridData( SWT.FILL, SWT.CENTER, true, false ) );
    cancelButton.setText( "Cancel" );
    cancelButton.addSelectionListener( new SelectionAdapter() {
      public void widgetSelected( SelectionEvent e ) {
        close();
      };
    } );
    return contentArea;
  }
  
  private void handlePlaceShipment() {
    PickupnetFactory factory = PickupnetFactory.eINSTANCE;
    Shipment shipment = factory.createShipment();
    Address from = factory.createAddress();
    from.setText( fromAddress.getText() );
    from.setGeoLocation( extractGeoLocation( fromGeo.getText(), fromAddress.getText() ) );
    shipment.setPickUpAddress( from );
    Address to = factory.createAddress();
    to.setText( toAddress.getText() );
    to.setGeoLocation( extractGeoLocation( toGeo.getText(), toAddress.getText() ) );
    shipment.setShipToAddress( to );
    shipment.setOrderer( getCustomer() );
    Pickupnet.STATION_1.acceptShipment( shipment );
    close();
  }
  
  private GeoLocation extractGeoLocation( String location, String addressText ) {
    GeoLocation geoLocation = null;
    if( location != null && !location.equals( "" ) ) {
      int indexOfSlash = location.indexOf( '/' );
      float lat = new Float( location.substring( 0, indexOfSlash ) );
      float lon = new Float( location.substring( indexOfSlash + 1, location.length() ) );
      geoLocation = PickupnetFactory.eINSTANCE.createGeoLocation();
      geoLocation.setLat( lat );
      geoLocation.setLon( lon );
    } else {
      geoLocation = callGeoCoder( addressText );
    }
    return geoLocation;
  }
  
  private GeoLocation callGeoCoder( String addressText ) {
    GeoLocation geoLocation = null;
    BundleContext context = FrameworkUtil.getBundle( getClass() ).getBundleContext();
    ServiceTracker<GeoCoder, GeoCoder> tracker 
      = new ServiceTracker<GeoCoder, GeoCoder>( context, GeoCoder.class.getName(), null );
    tracker.open();
    GeoCoder geoCoder = tracker.getService();
    tracker.close();
    if( geoCoder != null ) {
      geoLocation = geoCoder.decodeGeoLocation( addressText );
    }
    return geoLocation;
  }
  
  private Customer getCustomer() {
    EList<Customer> customers = Pickupnet.STATION_1.getCustomers();
    Customer result = null;
    for( Customer customer : customers ) {
      if( customer.getId().equals( userId ) ) {
        result = customer;
      }
    }
    return result;
  }
}
