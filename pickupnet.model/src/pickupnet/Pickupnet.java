package pickupnet;

import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

import pickupnet.util.ModelLoader;


/**
 * @generated NOT
 */
public class Pickupnet {


  public static final Station STATION_1 = loadStationFromFile();

  private static Station loadStationFromFile() {
    BundleContext context = FrameworkUtil.getBundle( Pickupnet.class ).getBundleContext();
    ServiceTracker<ModelLoader, ModelLoader> tracker = new ServiceTracker<ModelLoader, ModelLoader>( context, ModelLoader.class.getName(), null );
    tracker.open();
    ModelLoader loader = tracker.getService();
    tracker.close();
    return loader.loadStation();
  }

}
