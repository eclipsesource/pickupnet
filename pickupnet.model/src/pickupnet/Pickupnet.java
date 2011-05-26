package pickupnet;

import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

import pickupnet.util.ModelLoader;


/**
 * @generated NOT
 */
public class Pickupnet {

  public static final Station STATION_1 = loadStation();

  private static Station loadStation() {
    BundleContext context = FrameworkUtil.getBundle( Pickupnet.class ).getBundleContext();
    ServiceTracker<ModelLoader, ModelLoader> tracker = new ServiceTracker<ModelLoader, ModelLoader>( context, ModelLoader.class.getName(), null );
    tracker.open();
    ModelLoader loader = tracker.getService();
    tracker.close();
    Station station = loader.loadStation();
    printLoadedCount( station );
    return station;
  }

  private static void printLoadedCount( Station station ) {
    System.out.println( "Loaded:" );
    System.out.println( station.getCustomers().size() + " Customers" );
    System.out.println( station.getDrivers().size() + " Drivers" );
    System.out.println( station.getShipments().size() + " Shipments" );
  }

}
