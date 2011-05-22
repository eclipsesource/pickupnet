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
 * A representation of the model object '<em><b>Shipment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link pickupnet.Shipment#getId <em>Id</em>}</li>
 *   <li>{@link pickupnet.Shipment#getStatus <em>Status</em>}</li>
 *   <li>{@link pickupnet.Shipment#getDriver <em>Driver</em>}</li>
 *   <li>{@link pickupnet.Shipment#getOrderer <em>Orderer</em>}</li>
 *   <li>{@link pickupnet.Shipment#getShipToAddress <em>Ship To Address</em>}</li>
 *   <li>{@link pickupnet.Shipment#getPickUpAddress <em>Pick Up Address</em>}</li>
 * </ul>
 * </p>
 *
 * @see pickupnet.PickupnetPackage#getShipment()
 * @model
 * @generated
 */
public interface Shipment extends EObject {
	/**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see pickupnet.PickupnetPackage#getShipment_Id()
   * @model id="true"
   * @generated
   */
	String getId();

	/**
   * Sets the value of the '{@link pickupnet.Shipment#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Status</b></em>' attribute.
   * The literals are from the enumeration {@link pickupnet.ShipmentStatus}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Status</em>' attribute.
   * @see pickupnet.ShipmentStatus
   * @see #setStatus(ShipmentStatus)
   * @see pickupnet.PickupnetPackage#getShipment_Status()
   * @model required="true"
   * @generated
   */
	ShipmentStatus getStatus();

	/**
   * Sets the value of the '{@link pickupnet.Shipment#getStatus <em>Status</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Status</em>' attribute.
   * @see pickupnet.ShipmentStatus
   * @see #getStatus()
   * @generated
   */
	void setStatus(ShipmentStatus value);

	/**
   * Returns the value of the '<em><b>Driver</b></em>' reference.
   * It is bidirectional and its opposite is '{@link pickupnet.Driver#getAssignments <em>Assignments</em>}'.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Driver</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Driver</em>' reference.
   * @see #setDriver(Driver)
   * @see pickupnet.PickupnetPackage#getShipment_Driver()
   * @see pickupnet.Driver#getAssignments
   * @model opposite="assignments"
   * @generated
   */
	Driver getDriver();

	/**
   * Sets the value of the '{@link pickupnet.Shipment#getDriver <em>Driver</em>}' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Driver</em>' reference.
   * @see #getDriver()
   * @generated
   */
	void setDriver(Driver value);

	/**
   * Returns the value of the '<em><b>Orderer</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link pickupnet.Customer#getOrders <em>Orders</em>}'.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orderer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Orderer</em>' container reference.
   * @see #setOrderer(Customer)
   * @see pickupnet.PickupnetPackage#getShipment_Orderer()
   * @see pickupnet.Customer#getOrders
   * @model opposite="orders" required="true" transient="false"
   * @generated
   */
	Customer getOrderer();

	/**
   * Sets the value of the '{@link pickupnet.Shipment#getOrderer <em>Orderer</em>}' container reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Orderer</em>' container reference.
   * @see #getOrderer()
   * @generated
   */
	void setOrderer(Customer value);

	/**
   * Returns the value of the '<em><b>Ship To Address</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ship To Address</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Ship To Address</em>' containment reference.
   * @see #setShipToAddress(Address)
   * @see pickupnet.PickupnetPackage#getShipment_ShipToAddress()
   * @model containment="true" required="true"
   * @generated
   */
	Address getShipToAddress();

	/**
   * Sets the value of the '{@link pickupnet.Shipment#getShipToAddress <em>Ship To Address</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ship To Address</em>' containment reference.
   * @see #getShipToAddress()
   * @generated
   */
	void setShipToAddress(Address value);

	/**
   * Returns the value of the '<em><b>Pick Up Address</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pick Up Address</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Pick Up Address</em>' containment reference.
   * @see #setPickUpAddress(Address)
   * @see pickupnet.PickupnetPackage#getShipment_PickUpAddress()
   * @model containment="true" required="true"
   * @generated
   */
	Address getPickUpAddress();

	/**
   * Sets the value of the '{@link pickupnet.Shipment#getPickUpAddress <em>Pick Up Address</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pick Up Address</em>' containment reference.
   * @see #getPickUpAddress()
   * @generated
   */
	void setPickUpAddress(Address value);

} // Shipment
