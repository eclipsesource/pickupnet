package pickupnet.model.persistence;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import pickupnet.util.ModelLoader;



public class Activator implements BundleActivator {

  private ServiceRegistration<?> registration;

  @Override
  public void start( BundleContext context ) throws Exception {
    registration = context.registerService( ModelLoader.class.getName(), new ModelPersistenceService(), null );
    
  }

  @Override
  public void stop( BundleContext context ) throws Exception {
    context.ungetService( registration.getReference() );
  }
}
