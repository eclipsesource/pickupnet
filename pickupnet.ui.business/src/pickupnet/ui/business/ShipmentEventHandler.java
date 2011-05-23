/*******************************************************************************
 * Copyright (c) EclipseSource (2011). All Rights Reserved.
 * 
 * Contributors:
 *      Holger Staudacher - initial API and Implementation
 ******************************************************************************/
package pickupnet.ui.business;

import org.eclipse.swt.widgets.Label;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventHandler;


public class ShipmentEventHandler implements EventHandler {
  
  private Label label;

  public ShipmentEventHandler( Label label ) {
    this.label = label;
  }
  
  @Override
  public void handleEvent( final Event event ) {
    label.getDisplay().asyncExec( new Runnable() {
      
      @Override
      public void run() {
        String address = ( String )event.getProperty( "pickupAddress" );
        label.setText( address );
      }
    } );
  }
}
