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
 * A representation of the model object '<em><b>Driver</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link pickupnet.Driver#getId <em>Id</em>}</li>
 *   <li>{@link pickupnet.Driver#getName <em>Name</em>}</li>
 *   <li>{@link pickupnet.Driver#getAssignments <em>Assignments</em>}</li>
 * </ul>
 * </p>
 *
 * @see pickupnet.PickupnetPackage#getDriver()
 * @model
 * @generated
 */
public interface Driver extends EObject {
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
   * @see pickupnet.PickupnetPackage#getDriver_Id()
   * @model default="" id="true" changeable="false"
   * @generated
   */
	String getId();

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
   * @see pickupnet.PickupnetPackage#getDriver_Name()
   * @model
   * @generated
   */
	String getName();

	/**
   * Sets the value of the '{@link pickupnet.Driver#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
	void setName(String value);

	/**
   * Returns the value of the '<em><b>Assignments</b></em>' reference list.
   * The list contents are of type {@link pickupnet.Shipment}.
   * It is bidirectional and its opposite is '{@link pickupnet.Shipment#getDriver <em>Driver</em>}'.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assignments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Assignments</em>' reference list.
   * @see pickupnet.PickupnetPackage#getDriver_Assignments()
   * @see pickupnet.Shipment#getDriver
   * @model opposite="driver" changeable="false"
   * @generated
   */
	EList<Shipment> getAssignments();

} // Driver
