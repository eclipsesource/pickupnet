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
 * A representation of the model object '<em><b>Address</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link pickupnet.Address#getText <em>Text</em>}</li>
 *   <li>{@link pickupnet.Address#getGeoLocation <em>Geo Location</em>}</li>
 * </ul>
 * </p>
 *
 * @see pickupnet.PickupnetPackage#getAddress()
 * @model
 * @generated
 */
public interface Address extends EObject {
	/**
   * Returns the value of the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Text</em>' attribute.
   * @see #setText(String)
   * @see pickupnet.PickupnetPackage#getAddress_Text()
   * @model
   * @generated
   */
	String getText();

	/**
   * Sets the value of the '{@link pickupnet.Address#getText <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text</em>' attribute.
   * @see #getText()
   * @generated
   */
	void setText(String value);

	/**
   * Returns the value of the '<em><b>Geo Location</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geo Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Geo Location</em>' attribute.
   * @see #setGeoLocation(GeoLocation)
   * @see pickupnet.PickupnetPackage#getAddress_GeoLocation()
   * @model dataType="pickupnet.GeoLocation"
   * @generated
   */
	GeoLocation getGeoLocation();

	/**
   * Sets the value of the '{@link pickupnet.Address#getGeoLocation <em>Geo Location</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Geo Location</em>' attribute.
   * @see #getGeoLocation()
   * @generated
   */
	void setGeoLocation(GeoLocation value);

} // Address
