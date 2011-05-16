package dummydata;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import pickupnet.Pickupnet;


public class Activator implements BundleActivator {

  private static BundleContext context;

  static BundleContext getContext() {
    return context;
  }

  public void start( BundleContext bundleContext ) throws Exception {
    Activator.context = bundleContext;
    Dummy dummyData = new Dummy( Pickupnet.STATION_1 );
    dummyData.createData();
  }

  public void stop( BundleContext bundleContext ) throws Exception {
    Activator.context = null;
  }
}
