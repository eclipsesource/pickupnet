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
 * A representation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link pickupnet.Customer#getId <em>Id</em>}</li>
 *   <li>{@link pickupnet.Customer#getName <em>Name</em>}</li>
 *   <li>{@link pickupnet.Customer#getOrders <em>Orders</em>}</li>
 * </ul>
 * </p>
 *
 * @see pickupnet.PickupnetPackage#getCustomer()
 * @model
 * @generated
 */
public interface Customer extends EObject {
	/**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * The default value is <code>""</code>.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see pickupnet.PickupnetPackage#getCustomer_Id()
   * @model default="" id="true"
   * @generated
   */
	String getId();

	/**
   * Sets the value of the '{@link pickupnet.Customer#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see pickupnet.PickupnetPackage#getCustomer_Name()
   * @model
   * @generated
   */
	String getName();

	/**
   * Sets the value of the '{@link pickupnet.Customer#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
	void setName(String value);

	/**
   * Returns the value of the '<em><b>Orders</b></em>' containment reference list.
   * The list contents are of type {@link pickupnet.Shipment}.
   * It is bidirectional and its opposite is '{@link pickupnet.Shipment#getOrderer <em>Orderer</em>}'.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orders</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Orders</em>' containment reference list.
   * @see pickupnet.PickupnetPackage#getCustomer_Orders()
   * @see pickupnet.Shipment#getOrderer
   * @model opposite="orderer" containment="true"
   * @generated
   */
	EList<Shipment> getOrders();

} // Customer
