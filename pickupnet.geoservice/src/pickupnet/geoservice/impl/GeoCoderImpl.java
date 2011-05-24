/*******************************************************************************
 * Copyright (c) EclipseSource (2011). All Rights Reserved.
 * 
 * Contributors:
 *      Holger Staudacher - initial API and Implementation
 ******************************************************************************/
package pickupnet.geoservice.impl;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import pickupnet.GeoLocation;
import pickupnet.PickupnetFactory;
import pickupnet.util.GeoCoder;


public class GeoCoderImpl implements GeoCoder {

  @Override
  public GeoLocation decodeGeoLocation( String address ) {
    GeoLocation result = null;
    String json = getMapsJson( address );
    try {
      JSONObject object = new JSONObject( json );
      JSONArray array = object.getJSONArray( "results" );
      JSONObject resultObject = array.getJSONObject( 0 );
      JSONObject geometry = resultObject.getJSONObject( "geometry" );
      JSONObject location = geometry.getJSONObject( "location" );
      double lat = location.getDouble( "lat" );
      double lng = location.getDouble( "lng" );
      Float latToUse = new Float( lat );
      Float lngToUse = new Float( lng );
      result = PickupnetFactory.eINSTANCE.createGeoLocation();
      result.setLat( latToUse );
      result.setLon( lngToUse );
    } catch( JSONException e ) {
      e.printStackTrace();
    }
    return result;
  }

  private String getMapsJson( String address ) {
    String result = null;
    String addressToUse = address.replaceAll( " ", "+" );
    String urlToUse = "http://maps.google.com/maps/api/geocode/json?address=" + addressToUse + "&sensor=false";
    try {
      URL url = new URL( urlToUse );
      URLConnection connection = url.openConnection();
      BufferedReader reader = new BufferedReader( new InputStreamReader( connection.getInputStream() ) );
      StringBuffer buffer = new StringBuffer();
      String line;
      while( ( line = reader.readLine() ) != null ) {
        buffer.append( line );
      }
      result = buffer.toString();
    } catch( Exception e ) {
      e.printStackTrace();
    }
    return result;
  }
}
