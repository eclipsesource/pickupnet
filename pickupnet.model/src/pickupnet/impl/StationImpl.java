/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package pickupnet.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.osgi.framework.FrameworkUtil;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventAdmin;
import org.osgi.util.tracker.ServiceTracker;

import pickupnet.Customer;
import pickupnet.Driver;
import pickupnet.PickupnetPackage;
import pickupnet.Shipment;
import pickupnet.Station;
import pickupnet.util.EventUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Station</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link pickupnet.impl.StationImpl#getCustomers <em>Customers</em>}</li>
 *   <li>{@link pickupnet.impl.StationImpl#getDrivers <em>Drivers</em>}</li>
 *   <li>{@link pickupnet.impl.StationImpl#getShipments <em>Shipments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StationImpl extends EObjectImpl implements Station {
	/**
   * The cached value of the '{@link #getCustomers() <em>Customers</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getCustomers()
   * @generated
   * @ordered
   */
	protected EList<Customer> customers;

	/**
   * The cached value of the '{@link #getDrivers() <em>Drivers</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getDrivers()
   * @generated
   * @ordered
   */
	protected EList<Driver> drivers;

	/**
   * The cached value of the '{@link #getShipments() <em>Shipments</em>}' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getShipments()
   * @generated
   * @ordered
   */
	protected EList<Shipment> shipments;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected StationImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return PickupnetPackage.Literals.STATION;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<Customer> getCustomers() {
    if (customers == null)
    {
      customers = new EObjectContainmentEList<Customer>(Customer.class, this, PickupnetPackage.STATION__CUSTOMERS);
    }
    return customers;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<Driver> getDrivers() {
    if (drivers == null)
    {
      drivers = new EObjectContainmentEList<Driver>(Driver.class, this, PickupnetPackage.STATION__DRIVERS);
    }
    return drivers;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<Shipment> getShipments() {
    if (shipments == null)
    {
      shipments = new EObjectResolvingEList<Shipment>(Shipment.class, this, PickupnetPackage.STATION__SHIPMENTS);
    }
    return shipments;
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public void registerCustomer(Customer customer)
  {
    if( customer == null ) {
      throw new NullPointerException( "customer" );
    }
    String id = Integer.toHexString( ( int )( Math.random() * 0xffffff ) ).toUpperCase();
    ( ( CustomerImpl )customer ).setId( "C" + id );
    getCustomers().add( customer );
    EventUtil.fireCustomerEvent( customer, "added" );
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public void registerDriver( Driver driver ) {
    if( driver == null ) {
      throw new NullPointerException( "driver" );
    }
    String id = Integer.toHexString( ( int )( Math.random() * 0xffffff ) ).toUpperCase();
    ( ( DriverImpl )driver ).setId( "D" + id );
    getDrivers().add( driver );
    EventUtil.fireDriverEvent( driver, "added" );
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public void acceptShipment( Shipment shipment ) {
    if( shipment == null ) {
      throw new NullPointerException( "shipment" );
    }
    String id = Integer.toHexString( ( int )( Math.random() * 0xffffff ) ).toUpperCase();
    ( ( ShipmentImpl )shipment ).setId( "S" + id );
    getShipments().add( shipment );
    EventUtil.fireShipmentEvent( shipment, "added" );
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case PickupnetPackage.STATION__CUSTOMERS:
        return ((InternalEList<?>)getCustomers()).basicRemove(otherEnd, msgs);
      case PickupnetPackage.STATION__DRIVERS:
        return ((InternalEList<?>)getDrivers()).basicRemove(otherEnd, msgs);
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
      case PickupnetPackage.STATION__CUSTOMERS:
        return getCustomers();
      case PickupnetPackage.STATION__DRIVERS:
        return getDrivers();
      case PickupnetPackage.STATION__SHIPMENTS:
        return getShipments();
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
      case PickupnetPackage.STATION__DRIVERS:
        getDrivers().clear();
        getDrivers().addAll((Collection<? extends Driver>)newValue);
        return;
      case PickupnetPackage.STATION__SHIPMENTS:
        getShipments().clear();
        getShipments().addAll((Collection<? extends Shipment>)newValue);
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
      case PickupnetPackage.STATION__DRIVERS:
        getDrivers().clear();
        return;
      case PickupnetPackage.STATION__SHIPMENTS:
        getShipments().clear();
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
      case PickupnetPackage.STATION__CUSTOMERS:
        return customers != null && !customers.isEmpty();
      case PickupnetPackage.STATION__DRIVERS:
        return drivers != null && !drivers.isEmpty();
      case PickupnetPackage.STATION__SHIPMENTS:
        return shipments != null && !shipments.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //StationImpl
