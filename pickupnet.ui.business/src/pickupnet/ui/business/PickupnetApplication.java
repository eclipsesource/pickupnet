package pickupnet.ui.business;

import javax.servlet.http.HttpServletRequest;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.eclipse.rwt.RWT;
import org.eclipse.rwt.lifecycle.UICallBack;
import org.eclipse.rwt.lifecycle.WidgetUtil;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;


public class PickupnetApplication implements IApplication {

  private String userId;

  @Override
  public Object start( IApplicationContext context ) throws Exception {
    HttpServletRequest request = RWT.getRequest();
    userId = request.getParameter( "id" );
    
    Display display = new Display();
    final Shell shell = new Shell( display, SWT.NO_TRIM );
    shell.setData( WidgetUtil.CUSTOM_VARIANT, "main" );
    GridLayout layout = new GridLayout( 4, true );
    shell.setLayout( layout );
    shell.setMaximized( true );
    
    createMenuBar( shell );
    ContentPart contentPart = createParts( shell );
    createContent( shell, contentPart );
    
    UICallBack.activate( "callback" );
    
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

  private ContentPart createParts( final Shell shell ) {
    Composite navigation = new Composite( shell, SWT.NONE );
    navigation.setData( WidgetUtil.CUSTOM_VARIANT, "part" );
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
    menuBar.setData( WidgetUtil.CUSTOM_VARIANT, "menubar" );
    MenuPart menuPart = new MenuPart( userId );
    menuPart.createControl( menuBar );
  }

  @Override
  public void stop() {
    UICallBack.deactivate( "callback" );
  }
}
