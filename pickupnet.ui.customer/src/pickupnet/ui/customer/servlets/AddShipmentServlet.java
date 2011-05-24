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

import org.eclipse.emf.common.util.EList;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

import pickupnet.Address;
import pickupnet.Customer;
import pickupnet.GeoLocation;
import pickupnet.Pickupnet;
import pickupnet.PickupnetFactory;
import pickupnet.Shipment;
import pickupnet.ui.customer.ServletUtil;
import pickupnet.util.GeoCoder;


public class AddShipmentServlet extends HttpServlet {
  
  private static final long serialVersionUID = -8327411050103548411L;
  
  @Override
  protected void doGet( HttpServletRequest req, HttpServletResponse resp )
    throws ServletException, IOException
  {
    StringBuffer buffer = new StringBuffer();
    buffer.append( ServletUtil.createHeader( "Pickupnet Place Shipment" ) );
    InputStream resource = getClass().getResourceAsStream( "/html/addShipment.html" );
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
    buffer.append( ServletUtil.createHeader( "Pickupnet Shipment added" ) );
    Address from = extractFrom( req, "addressFrom", "geoFrom" );
    Address to = extractFrom( req, "addressTo", "geoTo" );
    createShipment( req, from, to );
    buffer.append( "Order received. A driver will be at yours soon." );
    buffer.append( ServletUtil.createFooter() );
    resp.getWriter().write( buffer.toString() );
  }

  private Address extractFrom( HttpServletRequest req, 
                               String addressParamName, 
                               String geoParamName ) 
  {
    Address address = PickupnetFactory.eINSTANCE.createAddress();
    String addressText = req.getParameter( addressParamName );
    address.setText( addressText );
    String location = req.getParameter( geoParamName );
    GeoLocation geoLocation = extractGeoLocation( location, addressText );
    address.setGeoLocation( geoLocation );
    return address;
  }

  private GeoLocation extractGeoLocation( String location, String addressText ) {
    GeoLocation geoLocation = null;
    if( location != null && !location.equals( "" ) ) {
      int indexOfSlash = location.indexOf( '/' );
      float lat = new Float( location.substring( 0, indexOfSlash ) );
      float lon = new Float( location.substring( indexOfSlash + 1, location.length() ) );
      geoLocation = PickupnetFactory.eINSTANCE.createGeoLocation();
      geoLocation.setLat( lat );
      geoLocation.setLon( lon );
    } else {
      geoLocation = callGeoCoder( addressText );
    }
    return geoLocation;
  }
  
  private GeoLocation callGeoCoder( String addressText ) {
    GeoLocation geoLocation = null;
    BundleContext context = FrameworkUtil.getBundle( getClass() ).getBundleContext();
    ServiceTracker<GeoCoder, GeoCoder> tracker 
      = new ServiceTracker<GeoCoder, GeoCoder>( context, GeoCoder.class.getName(), null );
    tracker.open();
    GeoCoder geoCoder = tracker.getService();
    tracker.close();
    if( geoCoder != null ) {
      geoLocation = geoCoder.decodeGeoLocation( addressText );
    }
    return geoLocation;
  }

  private void createShipment( HttpServletRequest req, Address from, Address to ) {
    Customer customer = extractCustomer( req );
    Shipment shipment = PickupnetFactory.eINSTANCE.createShipment();
    shipment.setPickUpAddress( from );
    shipment.setShipToAddress( to );
    shipment.setOrderer( customer );
    Pickupnet.STATION_1.acceptShipment( shipment );
  }

  private Customer extractCustomer( HttpServletRequest req ) {
    String id = req.getParameter( "customerId" );
    Customer result = null;
    EList<Customer> customers = Pickupnet.STATION_1.getCustomers();
    for( Customer customer : customers ) {
      if( customer.getId().equals( id ) ) {
        result = customer;
      }
    }
    return result;
  }
}
