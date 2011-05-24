/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package pickupnet;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see pickupnet.PickupnetFactory
 * @model kind="package"
 * @generated
 */
public interface PickupnetPackage extends EPackage {
	/**
   * The package name.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	String eNAME = "pickupnet";

	/**
   * The package namespace URI.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	String eNS_URI = "http://pickupnet.de/datamodel";

	/**
   * The package namespace name.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	String eNS_PREFIX = "pickupnet";

	/**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	PickupnetPackage eINSTANCE = pickupnet.impl.PickupnetPackageImpl.init();

	/**
   * The meta object id for the '{@link pickupnet.impl.DriverImpl <em>Driver</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see pickupnet.impl.DriverImpl
   * @see pickupnet.impl.PickupnetPackageImpl#getDriver()
   * @generated
   */
	int DRIVER = 1;

	/**
   * The meta object id for the '{@link pickupnet.impl.CustomerImpl <em>Customer</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see pickupnet.impl.CustomerImpl
   * @see pickupnet.impl.PickupnetPackageImpl#getCustomer()
   * @generated
   */
	int CUSTOMER = 2;

	/**
   * The meta object id for the '{@link pickupnet.impl.ShipmentImpl <em>Shipment</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see pickupnet.impl.ShipmentImpl
   * @see pickupnet.impl.PickupnetPackageImpl#getShipment()
   * @generated
   */
	int SHIPMENT = 3;

	/**
   * The meta object id for the '{@link pickupnet.impl.AddressImpl <em>Address</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see pickupnet.impl.AddressImpl
   * @see pickupnet.impl.PickupnetPackageImpl#getAddress()
   * @generated
   */
	int ADDRESS = 4;

	/**
   * The meta object id for the '{@link pickupnet.impl.StationImpl <em>Station</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see pickupnet.impl.StationImpl
   * @see pickupnet.impl.PickupnetPackageImpl#getStation()
   * @generated
   */
	int STATION = 0;

	/**
   * The feature id for the '<em><b>Customers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int STATION__CUSTOMERS = 0;

	/**
   * The feature id for the '<em><b>Drivers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int STATION__DRIVERS = 1;

	/**
   * The feature id for the '<em><b>Shipments</b></em>' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int STATION__SHIPMENTS = 2;

	/**
   * The number of structural features of the '<em>Station</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int STATION_FEATURE_COUNT = 3;

	/**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DRIVER__ID = 0;

	/**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DRIVER__NAME = 1;

	/**
   * The feature id for the '<em><b>Assignments</b></em>' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DRIVER__ASSIGNMENTS = 2;

	/**
   * The number of structural features of the '<em>Driver</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DRIVER_FEATURE_COUNT = 3;

	/**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CUSTOMER__ID = 0;

	/**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CUSTOMER__NAME = 1;

	/**
   * The feature id for the '<em><b>Twitter User Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOMER__TWITTER_USER_NAME = 2;

  /**
   * The feature id for the '<em><b>Orders</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CUSTOMER__ORDERS = 3;

	/**
   * The number of structural features of the '<em>Customer</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CUSTOMER_FEATURE_COUNT = 4;

	/**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SHIPMENT__ID = 0;

	/**
   * The feature id for the '<em><b>Status</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SHIPMENT__STATUS = 1;

	/**
   * The feature id for the '<em><b>Driver</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SHIPMENT__DRIVER = 2;

	/**
   * The feature id for the '<em><b>Orderer</b></em>' container reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SHIPMENT__ORDERER = 3;

	/**
   * The feature id for the '<em><b>Ship To Address</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SHIPMENT__SHIP_TO_ADDRESS = 4;

	/**
   * The feature id for the '<em><b>Pick Up Address</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SHIPMENT__PICK_UP_ADDRESS = 5;

	/**
   * The number of structural features of the '<em>Shipment</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SHIPMENT_FEATURE_COUNT = 6;

	/**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ADDRESS__TEXT = 0;

	/**
   * The feature id for the '<em><b>Geo Location</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ADDRESS__GEO_LOCATION = 1;

	/**
   * The number of structural features of the '<em>Address</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ADDRESS_FEATURE_COUNT = 2;

	/**
   * The meta object id for the '{@link pickupnet.ShipmentStatus <em>Shipment Status</em>}' enum.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see pickupnet.ShipmentStatus
   * @see pickupnet.impl.PickupnetPackageImpl#getShipmentStatus()
   * @generated
   */
	int SHIPMENT_STATUS = 6;

	/**
   * The meta object id for the '{@link pickupnet.impl.GeoLocationImpl <em>Geo Location</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see pickupnet.impl.GeoLocationImpl
   * @see pickupnet.impl.PickupnetPackageImpl#getGeoLocation()
   * @generated
   */
	int GEO_LOCATION = 5;


	/**
   * The feature id for the '<em><b>Lat</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEO_LOCATION__LAT = 0;

  /**
   * The feature id for the '<em><b>Lon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEO_LOCATION__LON = 1;

  /**
   * The number of structural features of the '<em>Geo Location</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEO_LOCATION_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link pickupnet.Driver <em>Driver</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Driver</em>'.
   * @see pickupnet.Driver
   * @generated
   */
	EClass getDriver();

	/**
   * Returns the meta object for the attribute '{@link pickupnet.Driver#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see pickupnet.Driver#getId()
   * @see #getDriver()
   * @generated
   */
	EAttribute getDriver_Id();

	/**
   * Returns the meta object for the attribute '{@link pickupnet.Driver#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see pickupnet.Driver#getName()
   * @see #getDriver()
   * @generated
   */
	EAttribute getDriver_Name();

	/**
   * Returns the meta object for the reference list '{@link pickupnet.Driver#getAssignments <em>Assignments</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Assignments</em>'.
   * @see pickupnet.Driver#getAssignments()
   * @see #getDriver()
   * @generated
   */
	EReference getDriver_Assignments();

	/**
   * Returns the meta object for class '{@link pickupnet.Customer <em>Customer</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Customer</em>'.
   * @see pickupnet.Customer
   * @generated
   */
	EClass getCustomer();

	/**
   * Returns the meta object for the attribute '{@link pickupnet.Customer#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see pickupnet.Customer#getId()
   * @see #getCustomer()
   * @generated
   */
	EAttribute getCustomer_Id();

	/**
   * Returns the meta object for the attribute '{@link pickupnet.Customer#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see pickupnet.Customer#getName()
   * @see #getCustomer()
   * @generated
   */
	EAttribute getCustomer_Name();

	/**
   * Returns the meta object for the attribute '{@link pickupnet.Customer#getTwitterUserName <em>Twitter User Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Twitter User Name</em>'.
   * @see pickupnet.Customer#getTwitterUserName()
   * @see #getCustomer()
   * @generated
   */
  EAttribute getCustomer_TwitterUserName();

  /**
   * Returns the meta object for the containment reference list '{@link pickupnet.Customer#getOrders <em>Orders</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Orders</em>'.
   * @see pickupnet.Customer#getOrders()
   * @see #getCustomer()
   * @generated
   */
	EReference getCustomer_Orders();

	/**
   * Returns the meta object for class '{@link pickupnet.Shipment <em>Shipment</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Shipment</em>'.
   * @see pickupnet.Shipment
   * @generated
   */
	EClass getShipment();

	/**
   * Returns the meta object for the attribute '{@link pickupnet.Shipment#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see pickupnet.Shipment#getId()
   * @see #getShipment()
   * @generated
   */
	EAttribute getShipment_Id();

	/**
   * Returns the meta object for the attribute '{@link pickupnet.Shipment#getStatus <em>Status</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Status</em>'.
   * @see pickupnet.Shipment#getStatus()
   * @see #getShipment()
   * @generated
   */
	EAttribute getShipment_Status();

	/**
   * Returns the meta object for the reference '{@link pickupnet.Shipment#getDriver <em>Driver</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Driver</em>'.
   * @see pickupnet.Shipment#getDriver()
   * @see #getShipment()
   * @generated
   */
	EReference getShipment_Driver();

	/**
   * Returns the meta object for the container reference '{@link pickupnet.Shipment#getOrderer <em>Orderer</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Orderer</em>'.
   * @see pickupnet.Shipment#getOrderer()
   * @see #getShipment()
   * @generated
   */
	EReference getShipment_Orderer();

	/**
   * Returns the meta object for the containment reference '{@link pickupnet.Shipment#getShipToAddress <em>Ship To Address</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ship To Address</em>'.
   * @see pickupnet.Shipment#getShipToAddress()
   * @see #getShipment()
   * @generated
   */
	EReference getShipment_ShipToAddress();

	/**
   * Returns the meta object for the containment reference '{@link pickupnet.Shipment#getPickUpAddress <em>Pick Up Address</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pick Up Address</em>'.
   * @see pickupnet.Shipment#getPickUpAddress()
   * @see #getShipment()
   * @generated
   */
	EReference getShipment_PickUpAddress();

	/**
   * Returns the meta object for class '{@link pickupnet.Address <em>Address</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Address</em>'.
   * @see pickupnet.Address
   * @generated
   */
	EClass getAddress();

	/**
   * Returns the meta object for the attribute '{@link pickupnet.Address#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see pickupnet.Address#getText()
   * @see #getAddress()
   * @generated
   */
	EAttribute getAddress_Text();

	/**
   * Returns the meta object for the containment reference '{@link pickupnet.Address#getGeoLocation <em>Geo Location</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Geo Location</em>'.
   * @see pickupnet.Address#getGeoLocation()
   * @see #getAddress()
   * @generated
   */
	EReference getAddress_GeoLocation();

	/**
   * Returns the meta object for class '{@link pickupnet.Station <em>Station</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Station</em>'.
   * @see pickupnet.Station
   * @generated
   */
	EClass getStation();

	/**
   * Returns the meta object for the containment reference list '{@link pickupnet.Station#getCustomers <em>Customers</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Customers</em>'.
   * @see pickupnet.Station#getCustomers()
   * @see #getStation()
   * @generated
   */
	EReference getStation_Customers();

	/**
   * Returns the meta object for the containment reference list '{@link pickupnet.Station#getDrivers <em>Drivers</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Drivers</em>'.
   * @see pickupnet.Station#getDrivers()
   * @see #getStation()
   * @generated
   */
	EReference getStation_Drivers();

	/**
   * Returns the meta object for the reference list '{@link pickupnet.Station#getShipments <em>Shipments</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Shipments</em>'.
   * @see pickupnet.Station#getShipments()
   * @see #getStation()
   * @generated
   */
	EReference getStation_Shipments();

	/**
   * Returns the meta object for enum '{@link pickupnet.ShipmentStatus <em>Shipment Status</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Shipment Status</em>'.
   * @see pickupnet.ShipmentStatus
   * @generated
   */
	EEnum getShipmentStatus();

	/**
   * Returns the meta object for class '{@link pickupnet.GeoLocation <em>Geo Location</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Geo Location</em>'.
   * @see pickupnet.GeoLocation
   * @generated
   */
	EClass getGeoLocation();

	/**
   * Returns the meta object for the attribute '{@link pickupnet.GeoLocation#getLat <em>Lat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lat</em>'.
   * @see pickupnet.GeoLocation#getLat()
   * @see #getGeoLocation()
   * @generated
   */
  EAttribute getGeoLocation_Lat();

  /**
   * Returns the meta object for the attribute '{@link pickupnet.GeoLocation#getLon <em>Lon</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lon</em>'.
   * @see pickupnet.GeoLocation#getLon()
   * @see #getGeoLocation()
   * @generated
   */
  EAttribute getGeoLocation_Lon();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
	PickupnetFactory getPickupnetFactory();

	/**
   * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
   * @generated
   */
	interface Literals {
		/**
     * The meta object literal for the '{@link pickupnet.impl.DriverImpl <em>Driver</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see pickupnet.impl.DriverImpl
     * @see pickupnet.impl.PickupnetPackageImpl#getDriver()
     * @generated
     */
		EClass DRIVER = eINSTANCE.getDriver();

		/**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute DRIVER__ID = eINSTANCE.getDriver_Id();

		/**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute DRIVER__NAME = eINSTANCE.getDriver_Name();

		/**
     * The meta object literal for the '<em><b>Assignments</b></em>' reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference DRIVER__ASSIGNMENTS = eINSTANCE.getDriver_Assignments();

		/**
     * The meta object literal for the '{@link pickupnet.impl.CustomerImpl <em>Customer</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see pickupnet.impl.CustomerImpl
     * @see pickupnet.impl.PickupnetPackageImpl#getCustomer()
     * @generated
     */
		EClass CUSTOMER = eINSTANCE.getCustomer();

		/**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute CUSTOMER__ID = eINSTANCE.getCustomer_Id();

		/**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute CUSTOMER__NAME = eINSTANCE.getCustomer_Name();

		/**
     * The meta object literal for the '<em><b>Twitter User Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CUSTOMER__TWITTER_USER_NAME = eINSTANCE.getCustomer_TwitterUserName();

    /**
     * The meta object literal for the '<em><b>Orders</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference CUSTOMER__ORDERS = eINSTANCE.getCustomer_Orders();

		/**
     * The meta object literal for the '{@link pickupnet.impl.ShipmentImpl <em>Shipment</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see pickupnet.impl.ShipmentImpl
     * @see pickupnet.impl.PickupnetPackageImpl#getShipment()
     * @generated
     */
		EClass SHIPMENT = eINSTANCE.getShipment();

		/**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute SHIPMENT__ID = eINSTANCE.getShipment_Id();

		/**
     * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute SHIPMENT__STATUS = eINSTANCE.getShipment_Status();

		/**
     * The meta object literal for the '<em><b>Driver</b></em>' reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference SHIPMENT__DRIVER = eINSTANCE.getShipment_Driver();

		/**
     * The meta object literal for the '<em><b>Orderer</b></em>' container reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference SHIPMENT__ORDERER = eINSTANCE.getShipment_Orderer();

		/**
     * The meta object literal for the '<em><b>Ship To Address</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference SHIPMENT__SHIP_TO_ADDRESS = eINSTANCE.getShipment_ShipToAddress();

		/**
     * The meta object literal for the '<em><b>Pick Up Address</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference SHIPMENT__PICK_UP_ADDRESS = eINSTANCE.getShipment_PickUpAddress();

		/**
     * The meta object literal for the '{@link pickupnet.impl.AddressImpl <em>Address</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see pickupnet.impl.AddressImpl
     * @see pickupnet.impl.PickupnetPackageImpl#getAddress()
     * @generated
     */
		EClass ADDRESS = eINSTANCE.getAddress();

		/**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute ADDRESS__TEXT = eINSTANCE.getAddress_Text();

		/**
     * The meta object literal for the '<em><b>Geo Location</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference ADDRESS__GEO_LOCATION = eINSTANCE.getAddress_GeoLocation();

		/**
     * The meta object literal for the '{@link pickupnet.impl.StationImpl <em>Station</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see pickupnet.impl.StationImpl
     * @see pickupnet.impl.PickupnetPackageImpl#getStation()
     * @generated
     */
		EClass STATION = eINSTANCE.getStation();

		/**
     * The meta object literal for the '<em><b>Customers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference STATION__CUSTOMERS = eINSTANCE.getStation_Customers();

		/**
     * The meta object literal for the '<em><b>Drivers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference STATION__DRIVERS = eINSTANCE.getStation_Drivers();

		/**
     * The meta object literal for the '<em><b>Shipments</b></em>' reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference STATION__SHIPMENTS = eINSTANCE.getStation_Shipments();

		/**
     * The meta object literal for the '{@link pickupnet.ShipmentStatus <em>Shipment Status</em>}' enum.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see pickupnet.ShipmentStatus
     * @see pickupnet.impl.PickupnetPackageImpl#getShipmentStatus()
     * @generated
     */
		EEnum SHIPMENT_STATUS = eINSTANCE.getShipmentStatus();

		/**
     * The meta object literal for the '{@link pickupnet.impl.GeoLocationImpl <em>Geo Location</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see pickupnet.impl.GeoLocationImpl
     * @see pickupnet.impl.PickupnetPackageImpl#getGeoLocation()
     * @generated
     */
		EClass GEO_LOCATION = eINSTANCE.getGeoLocation();

    /**
     * The meta object literal for the '<em><b>Lat</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GEO_LOCATION__LAT = eINSTANCE.getGeoLocation_Lat();

    /**
     * The meta object literal for the '<em><b>Lon</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GEO_LOCATION__LON = eINSTANCE.getGeoLocation_Lon();

	}

} //PickupnetPackage
