/*******************************************************************************
 * Copyright (c) EclipseSource (2011). All Rights Reserved.
 * 
 * Contributors:
 *      Holger Staudacher - initial API and Implementation
 ******************************************************************************/
package pickupnet.ui.driver;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.emf.common.util.EList;

import pickupnet.Driver;
import pickupnet.Pickupnet;
import pickupnet.Shipment;
import pickupnet.ShipmentStatus;


public class YourAssignmentsServlet extends HttpServlet {
  
  private static final long serialVersionUID = 94328053485228543L;

  @Override
  protected void doGet( HttpServletRequest req, HttpServletResponse resp )
    throws ServletException, IOException
  {
    String driverId = req.getParameter( "id" );
    if( driverId == null ) {
      resp.getWriter().write( "No driver spcified" );
    } else {
      String content = createContent( driverId );
      resp.getWriter().write( content );
    }
  }

  private String createContent( String driverId ) {
    StringBuffer buffer = new StringBuffer();
    buffer.append( "<html>" );
    addHead( driverId, buffer );
    addAssignments( driverId, buffer );
    buffer.append( "</html></body>" );
    return buffer.toString();
  }

  private void addHead( String driverId, StringBuffer buffer ) {
    buffer.append( "<head><title>Your Assignments</title>" );
    buffer.append( "<meta name=\"viewport\" content=\"initial-scale=1.3, user-scalable=no\">" );
    buffer.append( "</head>" );
    buffer.append( "<body style=\"font-family: Helvetica, Sans-Serif\">" );
    buffer.append( "Your Assignments" );
    buffer.append( "&nbsp;&nbsp;&nbsp;" );
    buffer.append( "<a href=\"/assign?id=" + driverId + "\">Do a job</a>" );
  }

  private void addAssignments( String driverId, StringBuffer buffer ) {
    buffer.append( "<form method=\"post\">" );
    EList<Driver> drivers = Pickupnet.STATION_1.getDrivers();
    for( Driver driver : drivers ) {
      if( driver.getId().equals( driverId ) ) {
        EList<Shipment> assignments = driver.getAssignments();
        buffer.append( "<ul>" );
        for( Shipment shipment : assignments ) {
          buffer.append( "<li>" );
          buffer.append( "From: " + shipment.getPickUpAddress().getText() + "<br>" );
          buffer.append( "To: " + shipment.getShipToAddress().getText() + "<br>" );
          buffer.append( "Status: " + createStatusComboBox( shipment ) );
          buffer.append( "</li>" );
        }
        buffer.append( "</ul>" );
      }
    }
    buffer.append( "<input type=\"submit\" value=\"Change status\">" );
    buffer.append( "</form>" );
  }

  private String createStatusComboBox( Shipment shipment ) {
    StringBuffer buffer = new StringBuffer();
    buffer.append( "<select name=\"" + shipment.getId() + "\">" );
    ShipmentStatus[] values = ShipmentStatus.values();
    for( int i = 0; i < values.length; i++ ) {
      ShipmentStatus value = values[ i ];
      buffer.append( "<option value=\"" + value.toString() + "\" " );
      if( value.equals( shipment.getStatus() ) ) {
        buffer.append( "selected" );
      }
      buffer.append( ">" + value.getName() + "</option>" );
    }
    
    buffer.append( "</select>" );
    return buffer.toString();
  }
  
  @SuppressWarnings("unchecked")
  @Override
  protected void doPost( HttpServletRequest req, HttpServletResponse resp )
    throws ServletException, IOException
  {
    Enumeration<String> parameterNames = req.getParameterNames();
    while( parameterNames.hasMoreElements() ) {
      String name = ( String )parameterNames.nextElement();
      String value = req.getParameter( name );
      updateShipment( name, value );
    }
    resp.getWriter().write( "<html><body>" );
    resp.getWriter().write( "Shipments successfully updated.</br>" );
    String id = req.getParameter( "id" );
    resp.getWriter().write( "<a href=\"/assignments?id=" + id + "\">Go Back</a>" );
    resp.getWriter().write( "</html></body>" );
  }

  private void updateShipment( String name, String value ) {
    EList<Shipment> shipments = Pickupnet.STATION_1.getShipments();
    for( Shipment shipment : shipments ) {
      if( shipment.getId().equals( name ) ) {
        shipment.setStatus( ShipmentStatus.get( value ) );
      }
    }
  }
  
  
}
