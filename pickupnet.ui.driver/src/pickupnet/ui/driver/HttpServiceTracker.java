package pickupnet.ui.driver;

import org.osgi.service.http.HttpService;

public class HttpServiceTracker {

  public void setHttpService( HttpService httpService ) {
    try {
      httpService.registerServlet( "/assignments", new YourAssignmentsServlet(), null, null );
      httpService.registerServlet( "/assign", new AssignServlet(), null, null );
    } catch( Exception e ) {
      System.err.println( "Could not register servlets and resources" );
      e.printStackTrace();
    } 
  }
  
  void unsetHttpService( HttpService httpService ) {
    httpService.unregister( "/assignments" );
    httpService.unregister( "/assign" );
  }
  
}
