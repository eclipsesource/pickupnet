/*******************************************************************************
 * Copyright (c) EclipseSource (2011). All Rights Reserved.
 * 
 * Contributors:
 *      Holger Staudacher - initial API and Implementation
 ******************************************************************************/
package pickupnet.ui.customer;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;


public class ServletUtil {
  
  public static String createHeader( String pgeTitle ) {
    StringBuffer buffer = new StringBuffer();
    buffer.append( "<html><head>" );
    buffer.append( "<title>" + pgeTitle + "</title>" );
    buffer.append( "<link rel=\"stylesheet\" media=\"all\" type=\"text/css\" " +
    		       "href=\"/style.css\"/>" );
    buffer.append( "</head>" );
    createMenu( buffer );
    buffer.append( "<div id=\"logo\"></div>" );
    buffer.append( "<div id=\"main\">" );
    return buffer.toString();
  }

  private static void createMenu( StringBuffer buffer ) {
    buffer.append( "<div id=\"menu\">" );
    buffer.append( "<a href=\"/add/shipment\">Add Shipment</a>" );
    buffer.append( "<a href=\"/add/driver\">Add Driver</a>" );
    buffer.append( "<a href=\"/add/customer\">Add Customer</a>" );
    buffer.append( "<a href=\"/shipments\">List Shipments</a>" );
    buffer.append( "<a href=\"/drivers\">List Driver</a>" );
    buffer.append( "<a href=\"/customers\">List Customers</a>" );
    buffer.append( "</div>" );
  }
  
  public static String createFooter() {
    StringBuffer buffer = new StringBuffer();
    buffer.append( "</div id=\"main\">" );
    buffer.append( "</body></html>" );
    return buffer.toString();
  }
  
  public static String readFromStream( InputStream resource ) {
    Writer writer = new StringWriter();
    char[] buffer = new char[ 1024 ];
    try {
      Reader reader = new BufferedReader( new InputStreamReader( resource, "UTF-8" ) );
      int n;
      while( ( n = reader.read( buffer ) ) != -1 ) {
        writer.write( buffer, 0, n );
      }
      resource.close();
    } catch( Exception e ) {
      e.printStackTrace();
    }
    return writer.toString();
  }
}
