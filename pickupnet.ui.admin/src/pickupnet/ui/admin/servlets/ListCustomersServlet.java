/*******************************************************************************
 * Copyright (c) EclipseSource (2011). All Rights Reserved.
 * 
 * Contributors:
 *      Holger Staudacher - initial API and Implementation
 ******************************************************************************/
package pickupnet.ui.admin.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.emf.common.util.EList;

import pickupnet.Customer;
import pickupnet.Pickupnet;
import pickupnet.ui.admin.ServletUtil;


public class ListCustomersServlet extends HttpServlet {
  
  private static final long serialVersionUID = 202905995753085532L;

  @Override
  protected void doGet( HttpServletRequest req, HttpServletResponse resp )
    throws ServletException, IOException
  {
    StringBuffer buffer = new StringBuffer();
    EList<Customer> customers = Pickupnet.STATION_1.getCustomers();
    buffer.append( ServletUtil.createHeader( "Pickupnet Customers" ) );
    buffer.append( "<ul>" );
    for( Customer customer : customers ) {
      buffer.append( "<li>" );
      buffer.append( "Id: " + customer.getId() + ", " );
      buffer.append( "Name: " + customer.getName() );
      buffer.append( "</li>" );
    }
    buffer.append( "</ul>" );
    buffer.append( ServletUtil.createFooter() );
    resp.getWriter().append( buffer.toString() );
  }
}
