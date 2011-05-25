package pickupnet.ui.business;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;


public class Activator implements BundleActivator {

  static BundleContext context;

  @Override
  public void start( BundleContext context ) throws Exception {
    Activator.context = context;
  }

  @Override
  public void stop( BundleContext context ) throws Exception {
    Activator.context = null;
  }
}
