package pickupnet.ui.business;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.rwt.lifecycle.UICallBack;
import org.eclipse.rwt.lifecycle.WidgetUtil;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.plugin.AbstractUIPlugin;


public class PickupnetApplication implements IApplication {

  @Override
  public Object start( IApplicationContext context ) throws Exception {
    Display display = new Display();
    final Shell shell = new Shell( display, SWT.NO_TRIM );
    shell.setData( WidgetUtil.CUSTOM_VARIANT, "main" );
    GridLayout layout = new GridLayout( 4, true );
    shell.setLayout( layout );
    shell.setMaximized( true );
    
    createMenuBar( shell );
    ContentPart navigationtPart = createNavigation( shell );
    createContent( shell, navigationtPart );
    
    UICallBack.activate( "callback" );
    
//    String[] topics = new String[] { "pickupnet/shipment/added" };
//    Hashtable<String, String[]> properties = new Hashtable<String, String[]>();
//    properties.put(EventConstants.EVENT_TOPIC, topics);
//    BundleContext bundleContext = FrameworkUtil.getBundle( getClass() ).getBundleContext();
//    bundleContext.registerService( EventHandler.class.getName(), new ShipmentEventHandler( label ), properties );
    shell.open();
    while( !shell.isDisposed() ) {
      if( !display.readAndDispatch() )
        display.sleep();
    }
    display.dispose();
    return null;
  }

  private void createContent( final Shell shell, ContentPart contentPart ) {
    Composite content = new Composite( shell, SWT.NONE );
    content.setData( WidgetUtil.CUSTOM_VARIANT, "part" );
    GridData gridDataContent = new GridData( SWT.FILL, SWT.FILL, true, true );
    gridDataContent.horizontalSpan = 3;
    content.setLayoutData( gridDataContent );
    contentPart.createControl( content );
  }

  private ContentPart createNavigation( final Shell shell ) {
    Composite navigation = new Composite( shell, SWT.NONE );
    navigation.setData( WidgetUtil.CUSTOM_VARIANT, "part" );
    GridData gridDataNavigation = new GridData( SWT.FILL, SWT.FILL, true, true );
    navigation.setLayoutData( gridDataNavigation );
    navigation.setLayout( new FillLayout() );
    ContentPart contentPart = new ContentPart();
    NavigationPart navigationControl = new NavigationPart( contentPart );
    navigationControl.createControl( navigation );
    return contentPart;
  }

  private void createMenuBar( final Shell shell ) {
    Composite menuBar = new Composite( shell, SWT.NONE );
    menuBar.setData( WidgetUtil.CUSTOM_VARIANT, "menubar" );
    menuBar.setLayout( new GridLayout( 6, true ) );
    GridData gridDataMenuBar = new GridData( SWT.FILL, SWT.FILL, true, false );
    gridDataMenuBar.horizontalSpan = 4;
    gridDataMenuBar.heightHint = 50;
    menuBar.setLayoutData( gridDataMenuBar );
    
    Label logo = new Label( menuBar, SWT.NONE );
    logo.setData( WidgetUtil.CUSTOM_VARIANT, "menubar" );
    ImageDescriptor descriptor = AbstractUIPlugin.imageDescriptorFromPlugin( "pickupnet.ui.business", "icons/logo.png" );
    logo.setImage( descriptor.createImage() );
  }

  @Override
  public void stop() {
    UICallBack.deactivate( "callback" );
  }
}
