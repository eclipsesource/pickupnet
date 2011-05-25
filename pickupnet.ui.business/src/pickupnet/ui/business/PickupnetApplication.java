package pickupnet.ui.business;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.osgi.framework.BundleContext;
import org.osgi.util.tracker.ServiceTracker;

import pickupnet.ui.business.singlesourcing.SingleSourcingService;


public class PickupnetApplication implements IApplication {

  private String userId;
  private SingleSourcingService service;

  @Override
  public Object start( IApplicationContext context ) throws Exception {
    Display display = new Display();
    final Shell shell = new Shell( display, getSingleSourceingService().getShellStyle() );
    shell.setData( "org.eclipse.rwt.themeVariant", "main" );
    GridLayout layout = new GridLayout( 4, true );
    shell.setLayout( layout );
    shell.setMaximized( true );
    
    InputDialog userDialog = new InputDialog( shell, "Enter Customer Id", "Id:", "", null );
    userDialog.setBlockOnOpen( true );
    userDialog.open();
    userId = userDialog.getValue();
    
    createMenuBar( shell );
    ContentPart contentPart = createParts( shell );
    createContent( shell, contentPart );
    
    getSingleSourceingService().startUiCallBack();
    
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
    content.setData( "org.eclipse.rwt.themeVariant", "part" );
    GridData gridDataContent = new GridData( SWT.FILL, SWT.FILL, true, true );
    gridDataContent.horizontalSpan = 3;
    content.setLayoutData( gridDataContent );
    contentPart.createControl( content );
  }

  private ContentPart createParts( final Shell shell ) {
    Composite navigation = new Composite( shell, SWT.NONE );
    navigation.setData( "org.eclipse.rwt.themeVariant", "part" );
    GridData gridDataNavigation = new GridData( SWT.FILL, SWT.FILL, true, true );
    navigation.setLayoutData( gridDataNavigation );
    navigation.setLayout( new FillLayout() );
    ContentPart contentPart = new ContentPart();
    NavigationPart navigationControl = new NavigationPart( contentPart, userId );
    navigationControl.createControl( navigation );
    return contentPart;
  }

  private void createMenuBar( final Shell shell ) {
    Composite menuBar = new Composite( shell, SWT.NONE );
    menuBar.setData( "org.eclipse.rwt.themeVariant", "menubar" );
    MenuPart menuPart = new MenuPart( userId );
    menuPart.createControl( menuBar );
  }

  @Override
  public void stop() {
    getSingleSourceingService().stopUiCallback();
  }
  
  private SingleSourcingService getSingleSourceingService() {
    if( service == null ) {
      BundleContext context = Activator.context;
      ServiceTracker<SingleSourcingService, SingleSourcingService> tracker 
        = new ServiceTracker<SingleSourcingService, SingleSourcingService>( context, SingleSourcingService.class.getName(), null );
      tracker.open();
      service = tracker.getService();
      tracker.close();
    }
    return service;
  }
}
