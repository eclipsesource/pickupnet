package pickupnet.ui.admin;
/*******************************************************************************
 * Copyright (c) EclipseSource (2011). All Rights Reserved.
 * 
 * Contributors:
 *      Holger Staudacher - initial API and Implementation
 ******************************************************************************/


import org.osgi.service.http.HttpService;

import pickupnet.ui.admin.servlets.AddCustomerServlet;
import pickupnet.ui.admin.servlets.ListCustomersServlet;
import pickupnet.ui.admin.servlets.ListDriversServlet;
import pickupnet.ui.admin.servlets.ListShipmentsServlet;


public class HttpServiceTracker {
  
  private static final String LIST_CUSTOMERS_ALIAS = "/admin/customers";
  private static final String LIST_SHIPMENTS_ALIAS = "/admin/shipments";
  private static final String LIST_DRIVERS_ALIAS = "/admin/drivers";
  private static final String ADD_CUSTOMER_ALIAS = "/admin/add/customer";

  public void setHttpService( HttpService httpService ) {
    try {
      httpService.registerServlet( LIST_CUSTOMERS_ALIAS, new ListCustomersServlet(), null, null );
      httpService.registerServlet( LIST_SHIPMENTS_ALIAS, new ListShipmentsServlet(), null, null );
      httpService.registerServlet( LIST_DRIVERS_ALIAS, new ListDriversServlet(), null, null );
      httpService.registerServlet( ADD_CUSTOMER_ALIAS, new AddCustomerServlet(), null, null );
    } catch( Exception e ) {
      System.err.println( "Could not register servlets and resources" );
      e.printStackTrace();
    } 
  }
  
  void unsetHttpService( HttpService httpService ) {
    httpService.unregister( LIST_CUSTOMERS_ALIAS );
    httpService.unregister( LIST_SHIPMENTS_ALIAS );
    httpService.unregister( LIST_DRIVERS_ALIAS );
    httpService.unregister( ADD_CUSTOMER_ALIAS );
  }
  
}
