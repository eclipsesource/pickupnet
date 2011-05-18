/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package pickupnet;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see pickupnet.PickupnetPackage
 * @generated
 */
public interface PickupnetFactory extends EFactory {
	/**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	PickupnetFactory eINSTANCE = pickupnet.impl.PickupnetFactoryImpl.init();

	/**
   * Returns a new object of class '<em>Driver</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Driver</em>'.
   * @generated
   */
	Driver createDriver();

	/**
   * Returns a new object of class '<em>Customer</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Customer</em>'.
   * @generated
   */
	Customer createCustomer();

	/**
   * Returns a new object of class '<em>Shipment</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Shipment</em>'.
   * @generated
   */
	Shipment createShipment();

	/**
   * Returns a new object of class '<em>Address</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Address</em>'.
   * @generated
   */
	Address createAddress();

	/**
   * Returns a new object of class '<em>Geo Location</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Geo Location</em>'.
   * @generated
   */
  GeoLocation createGeoLocation();

  /**
   * Returns a new object of class '<em>Station</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Station</em>'.
   * @generated
   */
	Station createStation();

	/**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
	PickupnetPackage getPickupnetPackage();

} //PickupnetFactory
