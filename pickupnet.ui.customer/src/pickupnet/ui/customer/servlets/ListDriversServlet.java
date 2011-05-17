/*******************************************************************************
 * Copyright (c) EclipseSource (2011). All Rights Reserved.
 * 
 * Contributors:
 *      Holger Staudacher - initial API and Implementation
 ******************************************************************************/
package pickupnet.ui.customer.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.emf.common.util.EList;

import pickupnet.Driver;
import pickupnet.Pickupnet;
import pickupnet.ui.customer.ServletUtil;


public class ListDriversServlet extends HttpServlet {
  
  private static final long serialVersionUID = 2152621099798970057L;

  @Override
  protected void doGet( HttpServletRequest req, HttpServletResponse resp )
    throws ServletException, IOException
  {
    StringBuffer buffer = new StringBuffer();
    EList<Driver> drivers = Pickupnet.STATION_1.getDrivers();
    buffer.append( ServletUtil.createHeader( "Pickupnet Drivers" ) );
    buffer.append( "<ul>" );
    for( Driver driver : drivers ) {
      buffer.append( "<li>" );
      buffer.append( "Id: " + driver.getId() + ", " );
      buffer.append( "Name: " + driver.getName() );
      buffer.append( "</li>" );
    }
    buffer.append( "</ul>" );
    buffer.append( ServletUtil.createFooter() );
    resp.getWriter().append( buffer.toString() );
  }
}
