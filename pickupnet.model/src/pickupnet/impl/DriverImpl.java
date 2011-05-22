/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package pickupnet.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pickupnet.Driver;
import pickupnet.PickupnetPackage;
import pickupnet.Shipment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Driver</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link pickupnet.impl.DriverImpl#getId <em>Id</em>}</li>
 *   <li>{@link pickupnet.impl.DriverImpl#getName <em>Name</em>}</li>
 *   <li>{@link pickupnet.impl.DriverImpl#getAssignments <em>Assignments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DriverImpl extends EObjectImpl implements Driver {
	/**
   * The default value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
	protected static final String ID_EDEFAULT = "";

	/**
   * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
	protected String id = ID_EDEFAULT;

	/**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
	protected static final String NAME_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
	protected String name = NAME_EDEFAULT;

	/**
   * The cached value of the '{@link #getAssignments() <em>Assignments</em>}' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getAssignments()
   * @generated
   * @ordered
   */
	protected EList<Shipment> assignments;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected DriverImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return PickupnetPackage.Literals.DRIVER;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getId() {
    return id;
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId(String newId)
  {
    String oldId = id;
    id = newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PickupnetPackage.DRIVER__ID, oldId, id));
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getName() {
    return name;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setName(String newName) {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PickupnetPackage.DRIVER__NAME, oldName, name));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<Shipment> getAssignments() {
    if (assignments == null)
    {
      assignments = new EObjectWithInverseResolvingEList<Shipment>(Shipment.class, this, PickupnetPackage.DRIVER__ASSIGNMENTS, PickupnetPackage.SHIPMENT__DRIVER);
    }
    return assignments;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID)
    {
      case PickupnetPackage.DRIVER__ASSIGNMENTS:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssignments()).basicAdd(otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID)
    {
      case PickupnetPackage.DRIVER__ASSIGNMENTS:
        return ((InternalEList<?>)getAssignments()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID)
    {
      case PickupnetPackage.DRIVER__ID:
        return getId();
      case PickupnetPackage.DRIVER__NAME:
        return getName();
      case PickupnetPackage.DRIVER__ASSIGNMENTS:
        return getAssignments();
    }
    return super.eGet(featureID, resolve, coreType);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
  @Override
	public void eSet(int featureID, Object newValue) {
    switch (featureID)
    {
      case PickupnetPackage.DRIVER__ID:
        setId((String)newValue);
        return;
      case PickupnetPackage.DRIVER__NAME:
        setName((String)newValue);
        return;
      case PickupnetPackage.DRIVER__ASSIGNMENTS:
        getAssignments().clear();
        getAssignments().addAll((Collection<? extends Shipment>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public void eUnset(int featureID) {
    switch (featureID)
    {
      case PickupnetPackage.DRIVER__ID:
        setId(ID_EDEFAULT);
        return;
      case PickupnetPackage.DRIVER__NAME:
        setName(NAME_EDEFAULT);
        return;
      case PickupnetPackage.DRIVER__ASSIGNMENTS:
        getAssignments().clear();
        return;
    }
    super.eUnset(featureID);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public boolean eIsSet(int featureID) {
    switch (featureID)
    {
      case PickupnetPackage.DRIVER__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case PickupnetPackage.DRIVER__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case PickupnetPackage.DRIVER__ASSIGNMENTS:
        return assignments != null && !assignments.isEmpty();
    }
    return super.eIsSet(featureID);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public String toString() {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (id: ");
    result.append(id);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //DriverImpl
