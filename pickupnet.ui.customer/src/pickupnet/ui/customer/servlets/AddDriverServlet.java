/*******************************************************************************
 * Copyright (c) EclipseSource (2011). All Rights Reserved.
 * 
 * Contributors:
 *      Holger Staudacher - initial API and Implementation
 ******************************************************************************/
package pickupnet.ui.customer.servlets;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pickupnet.Driver;
import pickupnet.Pickupnet;
import pickupnet.PickupnetFactory;
import pickupnet.ui.customer.ServletUtil;


public class AddDriverServlet extends HttpServlet {

  private static final long serialVersionUID = 8065659313427332812L;
  
  @Override
  protected void doGet( HttpServletRequest req, HttpServletResponse resp )
    throws ServletException, IOException
  {
    StringBuffer buffer = new StringBuffer();
    buffer.append( ServletUtil.createHeader( "Pickupnet Driver added" ) );
    InputStream resource = getClass().getResourceAsStream( "/html/addDriver.html" );
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
    buffer.append( ServletUtil.createHeader( "Pickupnet Driver added" ) );
    String name = req.getParameter( "name" );
    Driver driver = PickupnetFactory.eINSTANCE.createDriver();
    driver.setName( name );
    Pickupnet.STATION_1.registerDriver( driver );
    buffer.append( "Driver added with Id " + driver.getId() );
    buffer.append( ServletUtil.createFooter() );
    resp.getWriter().write( buffer.toString() );
  }
}
