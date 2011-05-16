/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package pickupnet;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Station</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link pickupnet.Station#getCustomers <em>Customers</em>}</li>
 *   <li>{@link pickupnet.Station#getDrivers <em>Drivers</em>}</li>
 *   <li>{@link pickupnet.Station#getShipments <em>Shipments</em>}</li>
 * </ul>
 * </p>
 *
 * @see pickupnet.PickupnetPackage#getStation()
 * @model
 * @generated
 */
public interface Station extends EObject {
	/**
   * Returns the value of the '<em><b>Customers</b></em>' reference list.
   * The list contents are of type {@link pickupnet.Customer}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customers</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Customers</em>' reference list.
   * @see pickupnet.PickupnetPackage#getStation_Customers()
   * @model changeable="false"
   * @generated
   */
	EList<Customer> getCustomers();

	/**
   * Returns the value of the '<em><b>Drivers</b></em>' reference list.
   * The list contents are of type {@link pickupnet.Driver}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Drivers</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Drivers</em>' reference list.
   * @see pickupnet.PickupnetPackage#getStation_Drivers()
   * @model
   * @generated
   */
	EList<Driver> getDrivers();

	/**
   * Returns the value of the '<em><b>Shipments</b></em>' reference list.
   * The list contents are of type {@link pickupnet.Shipment}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shipments</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Shipments</em>' reference list.
   * @see pickupnet.PickupnetPackage#getStation_Shipments()
   * @model
   * @generated
   */
	EList<Shipment> getShipments();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model customerRequired="true"
   * @generated
   */
  void registerCustomer(Customer customer);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model driverRequired="true"
   * @generated
   */
  void registerDriver(Driver driver);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model
   * @generated
   */
  void acceptShipment(Shipment shipment);

} // Station
