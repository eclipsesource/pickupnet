package dummydata;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import pickupnet.util.ModelLoader;


public class Activator implements BundleActivator {

  private static BundleContext context;
  private ServiceRegistration<?> registration;

  static BundleContext getContext() {
    return context;
  }

  public void start( BundleContext bundleContext ) throws Exception {
    Activator.context = bundleContext;
    registration = bundleContext.registerService( ModelLoader.class.getName(), new DummyModelLoader(), null );
  }

  public void stop( BundleContext bundleContext ) throws Exception {
    bundleContext.ungetService( registration.getReference() );
    Activator.context = null;
  }
}
