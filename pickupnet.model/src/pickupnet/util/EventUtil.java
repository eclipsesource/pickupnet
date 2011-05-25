package pickupnet.util;

import java.util.HashMap;
import java.util.Map;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventAdmin;
import org.osgi.util.tracker.ServiceTracker;

import pickupnet.Address;
import pickupnet.Customer;
import pickupnet.Driver;
import pickupnet.Shipment;


/**
* <!-- begin-user-doc -->
 * <!-- end-user-doc -->
* @generated NOT
*/
public class EventUtil {

  public static void fireCustomerEvent( Customer customer, String type ) {
    Map<String, String> properties = new HashMap<String, String>();
    properties.put( "id", customer.getId() );
    properties.put( "name", customer.getName() );
    Event event = new Event( "pickupnet/customer/" + type, properties );
    sendEvent( event );
  }

  public static void fireDriverEvent( Driver driver, String type ) {
    Map<String, String> properties = new HashMap<String, String>();
    properties.put( "id", driver.getId() );
    properties.put( "name", driver.getName() );
    Event event = new Event( "pickupnet/driver/" + type, properties );
    sendEvent( event );
  }

  public static void fireShipmentEvent( Shipment shipment, String type ) {
    Map<String, Object> properties = new HashMap<String, Object>();
    properties.put( "shipment", shipment );
    properties.put( "id", shipment.getId() );
    properties.put( "status", shipment.getStatus().toString() );
    Address pickUpAddress = shipment.getPickUpAddress();
    if( pickUpAddress != null ) {
      properties.put( "pickupAddress", pickUpAddress.getText() );
    }
    Address shipToAddress = shipment.getShipToAddress();
    if( shipToAddress != null ) {
      properties.put( "shipToAddress", shipToAddress.getText() );
    }
    Customer orderer = shipment.getOrderer();
    if( orderer != null ) {
      properties.put( "orderer", orderer.getName() );
    }
    Event event = new Event( "pickupnet/shipment/" + type, properties );
    sendEvent( event );
  }

  private static void sendEvent( Event event ) {
    Bundle bundle = FrameworkUtil.getBundle( EventUtil.class );
    BundleContext bundleContext = bundle.getBundleContext();
    String name = EventAdmin.class.getName();
    ServiceTracker<EventAdmin, EventAdmin> tracker
      = new ServiceTracker<EventAdmin, EventAdmin>( bundleContext, name, null );
    tracker.open();
    EventAdmin eventAdmin = tracker.getService();
    tracker.close();
    if( eventAdmin != null ) {
      eventAdmin.sendEvent( event );
    }
  }

}
