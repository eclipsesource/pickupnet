/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package pickupnet;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Geo Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link pickupnet.GeoLocation#getLat <em>Lat</em>}</li>
 *   <li>{@link pickupnet.GeoLocation#getLon <em>Lon</em>}</li>
 * </ul>
 * </p>
 *
 * @see pickupnet.PickupnetPackage#getGeoLocation()
 * @model
 * @generated
 */
public interface GeoLocation extends EObject
{
  /**
   * Returns the value of the '<em><b>Lat</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lat</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lat</em>' attribute.
   * @see #setLat(float)
   * @see pickupnet.PickupnetPackage#getGeoLocation_Lat()
   * @model
   * @generated
   */
  float getLat();

  /**
   * Sets the value of the '{@link pickupnet.GeoLocation#getLat <em>Lat</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lat</em>' attribute.
   * @see #getLat()
   * @generated
   */
  void setLat(float value);

  /**
   * Returns the value of the '<em><b>Lon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lon</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lon</em>' attribute.
   * @see #setLon(float)
   * @see pickupnet.PickupnetPackage#getGeoLocation_Lon()
   * @model
   * @generated
   */
  float getLon();

  /**
   * Sets the value of the '{@link pickupnet.GeoLocation#getLon <em>Lon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lon</em>' attribute.
   * @see #getLon()
   * @generated
   */
  void setLon(float value);

} // GeoLocation
