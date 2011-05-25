package pickupnet.ui.business.rcp;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import pickupnet.ui.business.singlesourcing.SingleSourcingService;

public class Activator implements BundleActivator {

  private static BundleContext context;
  private ServiceRegistration<?> registration;

  static BundleContext getContext() {
      return context;
  }

  public void start(BundleContext bundleContext) throws Exception {
      Activator.context = bundleContext;
      registration = bundleContext.registerService( SingleSourcingService.class.getName(), new RCPSingleSourcingService(), null );
  }

  /*
   * (non-Javadoc)
   * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
   */
  public void stop(BundleContext bundleContext) throws Exception {
      bundleContext.ungetService( registration.getReference() );
      Activator.context = null;
  }

}
