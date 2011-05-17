/*******************************************************************************
 * Copyright (c) EclipseSource (2011). All Rights Reserved.
 * 
 * Contributors:
 *      Holger Staudacher - initial API and Implementation
 ******************************************************************************/
package pickupnet.ui.customer;

import org.osgi.service.http.HttpService;

import pickupnet.ui.customer.servlets.AddDriverServlet;
import pickupnet.ui.customer.servlets.AddShipmentServlet;


public class HttpServiceTracker {
  
  private static final String RESOURCE_ALIAS = "/";
  private static final String ADD_SHIPMENT_ALIAS = "/add/shipment";
  private static final String ADD_DRIVER_ALIAS = "/add/driver";

  public void setHttpService( HttpService httpService ) {
    try {
      httpService.registerServlet( ADD_SHIPMENT_ALIAS, new AddShipmentServlet(), null, null );
      httpService.registerServlet( ADD_DRIVER_ALIAS, new AddDriverServlet(), null, null );
      httpService.registerResources( RESOURCE_ALIAS, "/html", null );
    } catch( Exception e ) {
      System.err.println( "Could not register servlets and resources" );
      e.printStackTrace();
    } 
  }
  
  void unsetHttpService( HttpService httpService ) {
    httpService.unregister( ADD_SHIPMENT_ALIAS );
    httpService.unregister( ADD_DRIVER_ALIAS );
    httpService.unregister( RESOURCE_ALIAS );
  }
  
}
