/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package pickupnet.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import pickupnet.Customer;
import pickupnet.Driver;
import pickupnet.PickupnetPackage;
import pickupnet.Shipment;
import pickupnet.Station;

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
   * The cached value of the '{@link #getCustomers() <em>Customers</em>}' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getCustomers()
   * @generated
   * @ordered
   */
	protected EList<Customer> customers;

	/**
   * The cached value of the '{@link #getDrivers() <em>Drivers</em>}' reference list.
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
   * @generated NOT
   */
  private int customerSequence = 0;

  /**
   * @generated NOT
   */
  private int driverSequence = 0;

  /**
   * @generated NOT
   */
  private int shipmentSequence = 0;

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
      customers = new EObjectResolvingEList<Customer>(Customer.class, this, PickupnetPackage.STATION__CUSTOMERS);
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
      drivers = new EObjectResolvingEList<Driver>(Driver.class, this, PickupnetPackage.STATION__DRIVERS);
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
    ( ( CustomerImpl )customer ).id = "C" + (++customerSequence);
    getCustomers().add( customer );
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public void registerDriver(Driver driver)
  {
    if( driver == null ) {
      throw new NullPointerException( "driver" );
    }
    ( ( DriverImpl )driver ).id = "D" + (++driverSequence);
    getDrivers().add( driver );
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public void acceptShipment(Shipment shipment)
  {
    if( shipment == null ) {
      throw new NullPointerException( "shipment" );
    }
    ( ( ShipmentImpl )shipment ).id = "S" + (++shipmentSequence);
    getShipments().add( shipment );
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
