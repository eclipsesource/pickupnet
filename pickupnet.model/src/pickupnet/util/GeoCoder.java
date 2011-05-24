/*******************************************************************************
 * 
 * Copyright (c) EclipseSource (2011). All Rights Reserved.
 * Contributors:
 *      Holger Staudacher - initial API and Implementation
 ******************************************************************************/
package pickupnet.util;

import pickupnet.GeoLocation;

/**
* <!-- begin-user-doc -->
 * <!-- end-user-doc -->
* @generated NOT
*/
public interface GeoCoder {
  
  GeoLocation decodeGeoLocation( String address );
  
}
