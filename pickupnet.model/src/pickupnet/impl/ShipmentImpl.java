/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package pickupnet.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import pickupnet.Address;
import pickupnet.Customer;
import pickupnet.Driver;
import pickupnet.PickupnetPackage;
import pickupnet.Shipment;
import pickupnet.ShipmentStatus;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shipment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link pickupnet.impl.ShipmentImpl#getId <em>Id</em>}</li>
 *   <li>{@link pickupnet.impl.ShipmentImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link pickupnet.impl.ShipmentImpl#getDriver <em>Driver</em>}</li>
 *   <li>{@link pickupnet.impl.ShipmentImpl#getOrderer <em>Orderer</em>}</li>
 *   <li>{@link pickupnet.impl.ShipmentImpl#getShipToAddress <em>Ship To Address</em>}</li>
 *   <li>{@link pickupnet.impl.ShipmentImpl#getPickUpAddress <em>Pick Up Address</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ShipmentImpl extends EObjectImpl implements Shipment {
	/**
   * The default value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
	protected static final String ID_EDEFAULT = null;

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
   * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getStatus()
   * @generated
   * @ordered
   */
	protected static final ShipmentStatus STATUS_EDEFAULT = ShipmentStatus.NEW;

	/**
   * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getStatus()
   * @generated
   * @ordered
   */
	protected ShipmentStatus status = STATUS_EDEFAULT;

	/**
   * The cached value of the '{@link #getDriver() <em>Driver</em>}' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getDriver()
   * @generated
   * @ordered
   */
	protected Driver driver;

	/**
   * The cached value of the '{@link #getOrderer() <em>Orderer</em>}' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getOrderer()
   * @generated
   * @ordered
   */
	protected Customer orderer;

	/**
   * The cached value of the '{@link #getShipToAddress() <em>Ship To Address</em>}' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getShipToAddress()
   * @generated
   * @ordered
   */
	protected Address shipToAddress;

	/**
   * The cached value of the '{@link #getPickUpAddress() <em>Pick Up Address</em>}' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getPickUpAddress()
   * @generated
   * @ordered
   */
	protected Address pickUpAddress;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected ShipmentImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return PickupnetPackage.Literals.SHIPMENT;
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
	public ShipmentStatus getStatus() {
    return status;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setStatus(ShipmentStatus newStatus) {
    ShipmentStatus oldStatus = status;
    status = newStatus == null ? STATUS_EDEFAULT : newStatus;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PickupnetPackage.SHIPMENT__STATUS, oldStatus, status));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Driver getDriver() {
    if (driver != null && driver.eIsProxy())
    {
      InternalEObject oldDriver = (InternalEObject)driver;
      driver = (Driver)eResolveProxy(oldDriver);
      if (driver != oldDriver)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PickupnetPackage.SHIPMENT__DRIVER, oldDriver, driver));
      }
    }
    return driver;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Driver basicGetDriver() {
    return driver;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetDriver(Driver newDriver, NotificationChain msgs) {
    Driver oldDriver = driver;
    driver = newDriver;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PickupnetPackage.SHIPMENT__DRIVER, oldDriver, newDriver);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setDriver(Driver newDriver) {
    if (newDriver != driver)
    {
      NotificationChain msgs = null;
      if (driver != null)
        msgs = ((InternalEObject)driver).eInverseRemove(this, PickupnetPackage.DRIVER__ASSIGNMENTS, Driver.class, msgs);
      if (newDriver != null)
        msgs = ((InternalEObject)newDriver).eInverseAdd(this, PickupnetPackage.DRIVER__ASSIGNMENTS, Driver.class, msgs);
      msgs = basicSetDriver(newDriver, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PickupnetPackage.SHIPMENT__DRIVER, newDriver, newDriver));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Customer getOrderer() {
    if (orderer != null && orderer.eIsProxy())
    {
      InternalEObject oldOrderer = (InternalEObject)orderer;
      orderer = (Customer)eResolveProxy(oldOrderer);
      if (orderer != oldOrderer)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PickupnetPackage.SHIPMENT__ORDERER, oldOrderer, orderer));
      }
    }
    return orderer;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Customer basicGetOrderer() {
    return orderer;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetOrderer(Customer newOrderer, NotificationChain msgs) {
    Customer oldOrderer = orderer;
    orderer = newOrderer;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PickupnetPackage.SHIPMENT__ORDERER, oldOrderer, newOrderer);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setOrderer(Customer newOrderer) {
    if (newOrderer != orderer)
    {
      NotificationChain msgs = null;
      if (orderer != null)
        msgs = ((InternalEObject)orderer).eInverseRemove(this, PickupnetPackage.CUSTOMER__ORDERS, Customer.class, msgs);
      if (newOrderer != null)
        msgs = ((InternalEObject)newOrderer).eInverseAdd(this, PickupnetPackage.CUSTOMER__ORDERS, Customer.class, msgs);
      msgs = basicSetOrderer(newOrderer, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PickupnetPackage.SHIPMENT__ORDERER, newOrderer, newOrderer));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Address getShipToAddress() {
    if (shipToAddress != null && shipToAddress.eIsProxy())
    {
      InternalEObject oldShipToAddress = (InternalEObject)shipToAddress;
      shipToAddress = (Address)eResolveProxy(oldShipToAddress);
      if (shipToAddress != oldShipToAddress)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PickupnetPackage.SHIPMENT__SHIP_TO_ADDRESS, oldShipToAddress, shipToAddress));
      }
    }
    return shipToAddress;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Address basicGetShipToAddress() {
    return shipToAddress;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setShipToAddress(Address newShipToAddress) {
    Address oldShipToAddress = shipToAddress;
    shipToAddress = newShipToAddress;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PickupnetPackage.SHIPMENT__SHIP_TO_ADDRESS, oldShipToAddress, shipToAddress));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Address getPickUpAddress() {
    if (pickUpAddress != null && pickUpAddress.eIsProxy())
    {
      InternalEObject oldPickUpAddress = (InternalEObject)pickUpAddress;
      pickUpAddress = (Address)eResolveProxy(oldPickUpAddress);
      if (pickUpAddress != oldPickUpAddress)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PickupnetPackage.SHIPMENT__PICK_UP_ADDRESS, oldPickUpAddress, pickUpAddress));
      }
    }
    return pickUpAddress;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Address basicGetPickUpAddress() {
    return pickUpAddress;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setPickUpAddress(Address newPickUpAddress) {
    Address oldPickUpAddress = pickUpAddress;
    pickUpAddress = newPickUpAddress;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PickupnetPackage.SHIPMENT__PICK_UP_ADDRESS, oldPickUpAddress, pickUpAddress));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID)
    {
      case PickupnetPackage.SHIPMENT__DRIVER:
        if (driver != null)
          msgs = ((InternalEObject)driver).eInverseRemove(this, PickupnetPackage.DRIVER__ASSIGNMENTS, Driver.class, msgs);
        return basicSetDriver((Driver)otherEnd, msgs);
      case PickupnetPackage.SHIPMENT__ORDERER:
        if (orderer != null)
          msgs = ((InternalEObject)orderer).eInverseRemove(this, PickupnetPackage.CUSTOMER__ORDERS, Customer.class, msgs);
        return basicSetOrderer((Customer)otherEnd, msgs);
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
      case PickupnetPackage.SHIPMENT__DRIVER:
        return basicSetDriver(null, msgs);
      case PickupnetPackage.SHIPMENT__ORDERER:
        return basicSetOrderer(null, msgs);
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
      case PickupnetPackage.SHIPMENT__ID:
        return getId();
      case PickupnetPackage.SHIPMENT__STATUS:
        return getStatus();
      case PickupnetPackage.SHIPMENT__DRIVER:
        if (resolve) return getDriver();
        return basicGetDriver();
      case PickupnetPackage.SHIPMENT__ORDERER:
        if (resolve) return getOrderer();
        return basicGetOrderer();
      case PickupnetPackage.SHIPMENT__SHIP_TO_ADDRESS:
        if (resolve) return getShipToAddress();
        return basicGetShipToAddress();
      case PickupnetPackage.SHIPMENT__PICK_UP_ADDRESS:
        if (resolve) return getPickUpAddress();
        return basicGetPickUpAddress();
    }
    return super.eGet(featureID, resolve, coreType);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public void eSet(int featureID, Object newValue) {
    switch (featureID)
    {
      case PickupnetPackage.SHIPMENT__STATUS:
        setStatus((ShipmentStatus)newValue);
        return;
      case PickupnetPackage.SHIPMENT__DRIVER:
        setDriver((Driver)newValue);
        return;
      case PickupnetPackage.SHIPMENT__ORDERER:
        setOrderer((Customer)newValue);
        return;
      case PickupnetPackage.SHIPMENT__SHIP_TO_ADDRESS:
        setShipToAddress((Address)newValue);
        return;
      case PickupnetPackage.SHIPMENT__PICK_UP_ADDRESS:
        setPickUpAddress((Address)newValue);
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
      case PickupnetPackage.SHIPMENT__STATUS:
        setStatus(STATUS_EDEFAULT);
        return;
      case PickupnetPackage.SHIPMENT__DRIVER:
        setDriver((Driver)null);
        return;
      case PickupnetPackage.SHIPMENT__ORDERER:
        setOrderer((Customer)null);
        return;
      case PickupnetPackage.SHIPMENT__SHIP_TO_ADDRESS:
        setShipToAddress((Address)null);
        return;
      case PickupnetPackage.SHIPMENT__PICK_UP_ADDRESS:
        setPickUpAddress((Address)null);
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
      case PickupnetPackage.SHIPMENT__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case PickupnetPackage.SHIPMENT__STATUS:
        return status != STATUS_EDEFAULT;
      case PickupnetPackage.SHIPMENT__DRIVER:
        return driver != null;
      case PickupnetPackage.SHIPMENT__ORDERER:
        return orderer != null;
      case PickupnetPackage.SHIPMENT__SHIP_TO_ADDRESS:
        return shipToAddress != null;
      case PickupnetPackage.SHIPMENT__PICK_UP_ADDRESS:
        return pickUpAddress != null;
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
    result.append(", status: ");
    result.append(status);
    result.append(')');
    return result.toString();
  }

} //ShipmentImpl
