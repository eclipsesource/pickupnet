/*******************************************************************************
 * Copyright (c) EclipseSource (2011). All Rights Reserved.
 * 
 * Contributors:
 *      Holger Staudacher - initial API and Implementation
 ******************************************************************************/
package pickupnet.ui.admin.servlets;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pickupnet.Customer;
import pickupnet.Pickupnet;
import pickupnet.PickupnetFactory;
import pickupnet.ui.admin.ServletUtil;


public class AddCustomerServlet extends HttpServlet {

  private static final long serialVersionUID = 8065659313427332812L;
  
  @Override
  protected void doGet( HttpServletRequest req, HttpServletResponse resp )
    throws ServletException, IOException
  {
    StringBuffer buffer = new StringBuffer();
    buffer.append( ServletUtil.createHeader( "Pickupnet Add Customer" ) );
    InputStream resource = getClass().getResourceAsStream( "/html/addCustomer.html" );
    String content = ServletUtil.readFromStream( resource );
    buffer.append( content );
    buffer.append( ServletUtil.createFooter() );
    resp.getWriter().write( buffer.toString() );
  }
  
  @Override
  protected void doPost( HttpServletRequest req, HttpServletResponse resp )
    throws ServletException, IOException
  {
    StringBuffer buffer = new StringBuffer();
    buffer.append( ServletUtil.createHeader( "Pickupnet Customer added" ) );
    String name = req.getParameter( "name" );
    Customer customer = PickupnetFactory.eINSTANCE.createCustomer();
    customer.setName( name );
    Pickupnet.STATION_1.registerCustomer( customer );
    buffer.append( "Customer added with Id " + customer.getId() );
    buffer.append( ServletUtil.createFooter() );
    resp.getWriter().write( buffer.toString() );
  }
}
