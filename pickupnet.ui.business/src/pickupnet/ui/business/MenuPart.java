/*******************************************************************************
 * Copyright (c) EclipseSource (2011). All Rights Reserved.
 * 
 * Contributors:
 *      Holger Staudacher - initial API and Implementation
 ******************************************************************************/
package pickupnet.ui.business;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import pickupnet.Customer;
import pickupnet.Pickupnet;


public class MenuPart {

  private String userId;

  public MenuPart( String userId ) {
    this.userId = userId;
  }

  public void createControl( final Composite menuBar ) {
    GridLayout layout = new GridLayout( 3, false);
    menuBar.setLayout( layout );
    layout.horizontalSpacing = 50;
    GridData gridDataMenuBar = new GridData( SWT.FILL, SWT.FILL, true, false );
    gridDataMenuBar.horizontalSpan = 4;
    gridDataMenuBar.heightHint = 50;
    menuBar.setLayoutData( gridDataMenuBar );
    
    Label logo = new Label( menuBar, SWT.NONE );
    logo.setData( "org.eclipse.rwt.themeVariant", "menubar" );
    ImageDescriptor descriptor = AbstractUIPlugin.imageDescriptorFromPlugin( "pickupnet.ui.business", "icons/logo.png" );
    logo.setImage( descriptor.createImage() );
    
    Label welcome = new Label( menuBar, SWT.NONE );
    welcome.setData( "org.eclipse.rwt.themeVariant", "welcome" );
    Customer customer = getCustomer();
    welcome.setText( "Welcome back " + customer.getName() );
    
    Composite controlParent = new Composite( menuBar, SWT.NONE );
    controlParent.setData( "org.eclipse.rwt.themeVariant", "menuControls" );
    controlParent.setLayoutData( new GridData( SWT.RIGHT, SWT.CENTER, false, false ) );
    controlParent.setLayout( new RowLayout() );
    
    Button addShipmentButton = new Button( controlParent, SWT.PUSH );
    addShipmentButton.setData( "org.eclipse.rwt.themeVariant", "menu" );
    addShipmentButton.setText( "Place Shipment" );
    addShipmentButton.addSelectionListener( new SelectionAdapter() {
      public void widgetSelected( SelectionEvent e ) {
        Dialog dialog = new ShipmentDialog( menuBar.getShell(), userId );
        dialog.create();
        dialog.open();
      };
    } );
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
