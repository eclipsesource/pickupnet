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

import pickupnet.Driver;
import pickupnet.Pickupnet;
import pickupnet.Shipment;
import pickupnet.ui.admin.ServletUtil;


public class ListShipmentsServlet extends HttpServlet {

  private static final long serialVersionUID = 8721722164932667252L;

  @Override
  protected void doGet( HttpServletRequest req, HttpServletResponse resp )
    throws ServletException, IOException
  {
    StringBuffer buffer = new StringBuffer();
    EList<Shipment> shipments = Pickupnet.STATION_1.getShipments();
    buffer.append( ServletUtil.createHeader( "Pickupnet Shipments" ) );
    buffer.append( "<ul>" );
    for( Shipment shipment : shipments ) {
      buffer.append( "<li>" );
      buffer.append( "From: " + shipment.getPickUpAddress().getText() + ", " );
      buffer.append( "To: " + shipment.getShipToAddress().getText() + ", " );
      buffer.append( "Customer: " + shipment.getOrderer().getId() + ", " );
      Driver driver = shipment.getDriver();
      if( driver != null ) {
        buffer.append( "<br/>Driver: " + driver.getId() + ", " );
      }
      buffer.append( "Status: " + shipment.getStatus() );
      buffer.append( "</li>" );
    }
    buffer.append( "</ul>" );
    buffer.append( ServletUtil.createFooter() );
    resp.getWriter().append( buffer.toString() );
  }
}
