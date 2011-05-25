/*******************************************************************************
 * Copyright (c) EclipseSource (2011). All Rights Reserved.
 * 
 * Contributors:
 *      Holger Staudacher - initial API and Implementation
 ******************************************************************************/
package pickupnet.ui.business;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

import pickupnet.Address;
import pickupnet.GeoLocation;
import pickupnet.Shipment;

import com.eclipsesource.widgets.gmaps.GMap;
import com.eclipsesource.widgets.gmaps.LatLng;


public class ContentPart {

  private static final String ID_VARIANT = "id";
  private static final String LOCATION_VARIANT = "location";
  private Label idLabel;
  private Label fromCoordinates;
  private Label fromAddress;
  private Label toAddress;
  private Label toCoordinates;
  private Composite parent;
  private GMap map;

  public void createControl( Composite content ) {
    parent = content;
    content.setLayout( new FormLayout() );
    Label title = createIdControls( content );
    Label from = createFromControls( content, title );
    Label to = createToControls( content, from );
    createMap( content, to );
  }

  private Label createIdControls( Composite content ) {
    Label title = new Label( content, SWT.NONE );
    title.setData( "org.eclipse.rwt.themeVariant", ID_VARIANT );
    title.setText( "Id:" );
    FormData formDataTitle = new FormData();
    title.setLayoutData( formDataTitle );
    formDataTitle.top = new FormAttachment( 0, 5 );
    formDataTitle.left = new FormAttachment( 0, 5 );
    
    idLabel = new Label( content, SWT.NONE );
    idLabel.setData( "org.eclipse.rwt.themeVariant", ID_VARIANT );
    FormData formDataIdLabel = new FormData();
    idLabel.setLayoutData( formDataIdLabel );
    formDataIdLabel.left = new FormAttachment( title, 5 );
    formDataIdLabel.top = new FormAttachment( 0, 5 );
    idLabel.setText( "" );
    return title;
  }

  private Label createFromControls( Composite content, Label title ) {
    Label from = new Label( content, SWT.NONE );
    from.setData( "org.eclipse.rwt.themeVariant", LOCATION_VARIANT );
    FormData fromFormData = new FormData();
    from.setLayoutData( fromFormData );
    fromFormData.top = new FormAttachment( title, 10 );
    fromFormData.left = new FormAttachment( 0, 5 );
    from.setText( "From:" );
    
    fromAddress = new Label( content, SWT.NONE );
    fromAddress.setData( "org.eclipse.rwt.themeVariant", LOCATION_VARIANT );
    FormData fromAddressFormData = new FormData();
    fromAddress.setLayoutData( fromAddressFormData );
    fromAddressFormData.top = new FormAttachment( title, 10 );
    fromAddressFormData.left = new FormAttachment( from, 5 );
    fromAddress.setText( "" );
    
    fromCoordinates = new Label( content, SWT.NONE );
    fromCoordinates.setData( "org.eclipse.rwt.themeVariant", LOCATION_VARIANT );
    FormData fromCoordinatesFormData = new FormData();
    fromCoordinates.setLayoutData( fromCoordinatesFormData );
    fromCoordinatesFormData.top = fromAddressFormData.top;
    fromCoordinatesFormData.left = new FormAttachment( fromAddress, 5 );
    fromCoordinates.setText( "" );
    return from;
  }

  private Label createToControls( Composite content, Label from ) {
    Label to = new Label( content, SWT.NONE );
    to.setData( "org.eclipse.rwt.themeVariant", LOCATION_VARIANT );
    FormData toFormData = new FormData();
    to.setLayoutData( toFormData );
    toFormData.top = new FormAttachment( from, 5 );
    toFormData.left = new FormAttachment( 0, 5 );
    to.setText( "To:" );
    
    toAddress = new Label( content, SWT.NONE );
    toAddress.setData( "org.eclipse.rwt.themeVariant", LOCATION_VARIANT );
    FormData toAddressFormData = new FormData();
    toAddress.setLayoutData( toAddressFormData );
    toAddressFormData.top = new FormAttachment( from, 5 );
    toAddressFormData.left = new FormAttachment( to, 5 );
    toAddress.setText( "" );
    
    toCoordinates = new Label( content, SWT.NONE );
    toCoordinates.setData( "org.eclipse.rwt.themeVariant", LOCATION_VARIANT );
    FormData toCoordinatesFormData = new FormData();
    toCoordinates.setLayoutData( toCoordinatesFormData );
    toCoordinatesFormData.top = toAddressFormData.top;
    toCoordinatesFormData.left = new FormAttachment( toAddress, 5 );
    toCoordinates.setText( "" );
    return to;
  }

  private void createMap( Composite content, Label to ) {
    map = new GMap( content, SWT.NONE );
    FormData formDataMap = new FormData();
    map.setLayoutData( formDataMap );
    formDataMap.left = new FormAttachment( 0, 5 );
    formDataMap.right = new FormAttachment( 100, -5 );
    formDataMap.top = new FormAttachment( to, 10 );
    formDataMap.bottom = new FormAttachment( 100, -5 );
    map.setZoom( 0 );
    map.setType( 2 );
  }
  
  public void selectionChanged( Shipment shipment ) {
    idLabel.setText( shipment.getId() );
    Address pickUpAddress = shipment.getPickUpAddress();
    fromAddress.setText( pickUpAddress.getText() );
    GeoLocation fromGeoLocation = pickUpAddress.getGeoLocation();
    fromCoordinates.setText( "(" + fromGeoLocation.getLat() + "/" + fromGeoLocation.getLon() + ")" );
    Address shipToAddress = shipment.getShipToAddress();
    toAddress.setText( shipToAddress.getText() );
    GeoLocation toGeoLocation = shipToAddress.getGeoLocation();
    toCoordinates.setText( "(" + toGeoLocation.getLat() + "/" + toGeoLocation.getLon() + ")" );
    map.setZoom( 15 );
    map.setCenter( new LatLng( fromGeoLocation.getLat(), fromGeoLocation.getLon() ) );
    map.addMarker( "From: " + fromAddress.getText() );
    map.gotoAddress( shipToAddress.getText() );
    map.addMarker( "To: " + shipToAddress.getText() );
    parent.layout( true, true );
  }
}
