/*******************************************************************************
 * Copyright (c) EclipseSource (2011). All Rights Reserved.
 * 
 * Contributors:
 *      Holger Staudacher - initial API and Implementation
 ******************************************************************************/
package pickupnet.ui.customer;

import org.osgi.service.http.HttpService;

import pickupnet.ui.customer.servlets.AddCustomerServlet;
import pickupnet.ui.customer.servlets.AddDriverServlet;
import pickupnet.ui.customer.servlets.AddShipmentServlet;
import pickupnet.ui.customer.servlets.ListCustomersServlet;
import pickupnet.ui.customer.servlets.ListDriversServlet;
import pickupnet.ui.customer.servlets.ListShipmentsServlet;


public class HttpServiceTracker {
  
  private static final String RESOURCE_ALIAS = "/";
  private static final String LIST_CUSTOMERS_ALIAS = "/customers";
  private static final String LIST_SHIPMENTS_ALIAS = "/shipments";
  private static final String LIST_DRIVERS_ALIAS = "/drivers";
  private static final String ADD_SHIPMENT_ALIAS = "/add/shipment";
  private static final String ADD_CUSTOMER_ALIAS = "/add/customer";
  private static final String ADD_DRIVER_ALIAS = "/add/driver";

  public void setHttpService( HttpService httpService ) {
    try {
      httpService.registerServlet( LIST_CUSTOMERS_ALIAS, new ListCustomersServlet(), null, null );
      httpService.registerServlet( LIST_SHIPMENTS_ALIAS, new ListShipmentsServlet(), null, null );
      httpService.registerServlet( LIST_DRIVERS_ALIAS, new ListDriversServlet(), null, null );
      httpService.registerServlet( ADD_SHIPMENT_ALIAS, new AddShipmentServlet(), null, null );
      httpService.registerServlet( ADD_CUSTOMER_ALIAS, new AddCustomerServlet(), null, null );
      httpService.registerServlet( ADD_DRIVER_ALIAS, new AddDriverServlet(), null, null );
      httpService.registerResources( RESOURCE_ALIAS, "/html", null );
    } catch( Exception e ) {
      System.err.println( "Could not register servlets and resources" );
      e.printStackTrace();
    } 
  }
  
  void unsetHttpService( HttpService httpService ) {
    httpService.unregister( LIST_CUSTOMERS_ALIAS );
    httpService.unregister( LIST_SHIPMENTS_ALIAS );
    httpService.unregister( LIST_DRIVERS_ALIAS );
    httpService.unregister( ADD_SHIPMENT_ALIAS );
    httpService.unregister( ADD_CUSTOMER_ALIAS );
    httpService.unregister( ADD_DRIVER_ALIAS );
    httpService.unregister( RESOURCE_ALIAS );
  }
  
}
