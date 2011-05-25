package pickupnet.notification.twitter;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.osgi.service.event.Event;
import org.osgi.service.event.EventHandler;

import pickupnet.Customer;
import pickupnet.Shipment;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;


public class ServiceComponent implements EventHandler {

  private static final String PROP_CONSUMER_KEY = "ConsumerKey";
  private static final String PROP_CONSUMER_SECRET = "ConsumerSecret";
  private static final String PROP_ACCESS_TOKEN = "AccessToken";
  private static final String PROP_ACCESS_SECRET = "AccessSecret";

  private Twitter twitter;

  public ServiceComponent() throws IOException {
    Properties properties = getProperties();
    twitter = authenticate( properties );
  }

  public void handleEvent( Event event ) {
    Object property = event.getProperty( "shipment" );
    if( property instanceof Shipment ) {
      handleShipmentChanged( ( Shipment )property );
    }
  }

  private void handleShipmentChanged( Shipment shipment ) {
    Customer orderer = shipment.getOrderer();
    if( orderer != null ) {
      String twitterHandle = orderer.getTwitterUserName();
      if( twitterHandle != null ) {
        String message = createTwitterMessage( shipment );
        sendDirectMessage( twitterHandle, message );
      }
    }
  }

  private String createTwitterMessage( Shipment shipment ) {
    StringBuilder buffer = new StringBuilder();
    buffer.append( "Shipment from "  );
    buffer.append( shipment.getPickUpAddress().getText() );
    buffer.append( " to " );
    buffer.append( shipment.getShipToAddress().getText() );
    switch( shipment.getStatus() ) {
      case NEW:
        buffer.append( " has been received" );
      break;
      case ASSIGNED:
        buffer.append( " has been assigned to " );
        buffer.append( shipment.getDriver().getName() );
      break;
      case UNDERWAY:
        buffer.append( " has been picked up" );
      break;
      case DELIVERED:
        buffer.append( " has been delivered" );
      break;
    }
    return buffer.toString();
  }

  private void sendDirectMessage( String twitterHandle, String message ) {
    System.out.println( "@" + twitterHandle + " " + message );
    try {
      twitter.sendDirectMessage( twitterHandle, message );
    } catch( TwitterException e ) {
      // TODO Handle exception
      e.printStackTrace();
    }
  }

  private Twitter authenticate( Properties properties ) {
    String consumerKey = properties.getProperty( PROP_CONSUMER_KEY );
    String consumerSecret = properties.getProperty( PROP_CONSUMER_SECRET );
    String accessToken = properties.getProperty( PROP_ACCESS_TOKEN );
    String accessSecret = properties.getProperty( PROP_ACCESS_SECRET );
    Twitter twitter = new TwitterFactory().getInstance();
    twitter.setOAuthConsumer( consumerKey, consumerSecret );
    AccessToken token = new AccessToken( accessToken, accessSecret );
    twitter.setOAuthAccessToken( token );
    return twitter;
  }

  private Properties getProperties() throws IOException {
    Properties properties = new Properties();
    ClassLoader classLoader = ServiceComponent.class.getClassLoader();
    InputStream inputStream = classLoader.getResourceAsStream( "credentials.properties" );
    try {
      properties.load( inputStream );
    } finally {
      inputStream.close();
    }
    return properties;
  }
}
