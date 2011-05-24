/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package pickupnet.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import pickupnet.Address;
import pickupnet.Customer;
import pickupnet.Driver;
import pickupnet.GeoLocation;
import pickupnet.PickupnetFactory;
import pickupnet.PickupnetPackage;
import pickupnet.Shipment;
import pickupnet.ShipmentStatus;
import pickupnet.Station;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PickupnetPackageImpl extends EPackageImpl implements PickupnetPackage {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass driverEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass customerEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass shipmentEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass addressEClass = null;

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass geoLocationEClass = null;

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass stationEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EEnum shipmentStatusEEnum = null;

	/**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see pickupnet.PickupnetPackage#eNS_URI
   * @see #init()
   * @generated
   */
	private PickupnetPackageImpl() {
    super(eNS_URI, PickupnetFactory.eINSTANCE);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private static boolean isInited = false;

	/**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link PickupnetPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
	public static PickupnetPackage init() {
    if (isInited) return (PickupnetPackage)EPackage.Registry.INSTANCE.getEPackage(PickupnetPackage.eNS_URI);

    // Obtain or create and register package
    PickupnetPackageImpl thePickupnetPackage = (PickupnetPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PickupnetPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PickupnetPackageImpl());

    isInited = true;

    // Create package meta-data objects
    thePickupnetPackage.createPackageContents();

    // Initialize created meta-data
    thePickupnetPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    thePickupnetPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(PickupnetPackage.eNS_URI, thePickupnetPackage);
    return thePickupnetPackage;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getDriver() {
    return driverEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getDriver_Id() {
    return (EAttribute)driverEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getDriver_Name() {
    return (EAttribute)driverEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getDriver_Assignments() {
    return (EReference)driverEClass.getEStructuralFeatures().get(2);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getCustomer() {
    return customerEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getCustomer_Id() {
    return (EAttribute)customerEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getCustomer_Name() {
    return (EAttribute)customerEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCustomer_TwitterUserName()
  {
    return (EAttribute)customerEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getCustomer_Orders() {
    return (EReference)customerEClass.getEStructuralFeatures().get(3);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getShipment() {
    return shipmentEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getShipment_Id() {
    return (EAttribute)shipmentEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getShipment_Status() {
    return (EAttribute)shipmentEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getShipment_Driver() {
    return (EReference)shipmentEClass.getEStructuralFeatures().get(2);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getShipment_Orderer() {
    return (EReference)shipmentEClass.getEStructuralFeatures().get(3);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getShipment_ShipToAddress() {
    return (EReference)shipmentEClass.getEStructuralFeatures().get(4);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getShipment_PickUpAddress() {
    return (EReference)shipmentEClass.getEStructuralFeatures().get(5);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getAddress() {
    return addressEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getAddress_Text() {
    return (EAttribute)addressEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getAddress_GeoLocation() {
    return (EReference)addressEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getStation() {
    return stationEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getStation_Customers() {
    return (EReference)stationEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getStation_Drivers() {
    return (EReference)stationEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getStation_Shipments() {
    return (EReference)stationEClass.getEStructuralFeatures().get(2);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EEnum getShipmentStatus() {
    return shipmentStatusEEnum;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getGeoLocation() {
    return geoLocationEClass;
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGeoLocation_Lat()
  {
    return (EAttribute)geoLocationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGeoLocation_Lon()
  {
    return (EAttribute)geoLocationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public PickupnetFactory getPickupnetFactory() {
    return (PickupnetFactory)getEFactoryInstance();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private boolean isCreated = false;

	/**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void createPackageContents() {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    stationEClass = createEClass(STATION);
    createEReference(stationEClass, STATION__CUSTOMERS);
    createEReference(stationEClass, STATION__DRIVERS);
    createEReference(stationEClass, STATION__SHIPMENTS);

    driverEClass = createEClass(DRIVER);
    createEAttribute(driverEClass, DRIVER__ID);
    createEAttribute(driverEClass, DRIVER__NAME);
    createEReference(driverEClass, DRIVER__ASSIGNMENTS);

    customerEClass = createEClass(CUSTOMER);
    createEAttribute(customerEClass, CUSTOMER__ID);
    createEAttribute(customerEClass, CUSTOMER__NAME);
    createEAttribute(customerEClass, CUSTOMER__TWITTER_USER_NAME);
    createEReference(customerEClass, CUSTOMER__ORDERS);

    shipmentEClass = createEClass(SHIPMENT);
    createEAttribute(shipmentEClass, SHIPMENT__ID);
    createEAttribute(shipmentEClass, SHIPMENT__STATUS);
    createEReference(shipmentEClass, SHIPMENT__DRIVER);
    createEReference(shipmentEClass, SHIPMENT__ORDERER);
    createEReference(shipmentEClass, SHIPMENT__SHIP_TO_ADDRESS);
    createEReference(shipmentEClass, SHIPMENT__PICK_UP_ADDRESS);

    addressEClass = createEClass(ADDRESS);
    createEAttribute(addressEClass, ADDRESS__TEXT);
    createEReference(addressEClass, ADDRESS__GEO_LOCATION);

    geoLocationEClass = createEClass(GEO_LOCATION);
    createEAttribute(geoLocationEClass, GEO_LOCATION__LAT);
    createEAttribute(geoLocationEClass, GEO_LOCATION__LON);

    // Create enums
    shipmentStatusEEnum = createEEnum(SHIPMENT_STATUS);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private boolean isInitialized = false;

	/**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void initializePackageContents() {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(stationEClass, Station.class, "Station", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStation_Customers(), this.getCustomer(), null, "customers", null, 0, -1, Station.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStation_Drivers(), this.getDriver(), null, "drivers", null, 0, -1, Station.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStation_Shipments(), this.getShipment(), null, "shipments", null, 0, -1, Station.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    EOperation op = addEOperation(stationEClass, null, "registerCustomer", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, this.getCustomer(), "customer", 1, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(stationEClass, null, "registerDriver", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, this.getDriver(), "driver", 1, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(stationEClass, null, "acceptShipment", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, this.getShipment(), "shipment", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(driverEClass, Driver.class, "Driver", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDriver_Id(), ecorePackage.getEString(), "id", "", 0, 1, Driver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDriver_Name(), ecorePackage.getEString(), "name", null, 0, 1, Driver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDriver_Assignments(), this.getShipment(), this.getShipment_Driver(), "assignments", null, 0, -1, Driver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(customerEClass, Customer.class, "Customer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCustomer_Id(), ecorePackage.getEString(), "id", "", 0, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCustomer_Name(), ecorePackage.getEString(), "name", null, 0, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCustomer_TwitterUserName(), ecorePackage.getEString(), "twitterUserName", null, 0, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCustomer_Orders(), this.getShipment(), this.getShipment_Orderer(), "orders", null, 0, -1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(shipmentEClass, Shipment.class, "Shipment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getShipment_Id(), ecorePackage.getEString(), "id", null, 0, 1, Shipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getShipment_Status(), this.getShipmentStatus(), "status", null, 1, 1, Shipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getShipment_Driver(), this.getDriver(), this.getDriver_Assignments(), "driver", null, 0, 1, Shipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getShipment_Orderer(), this.getCustomer(), this.getCustomer_Orders(), "orderer", null, 1, 1, Shipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getShipment_ShipToAddress(), this.getAddress(), null, "shipToAddress", null, 1, 1, Shipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getShipment_PickUpAddress(), this.getAddress(), null, "pickUpAddress", null, 1, 1, Shipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(addressEClass, Address.class, "Address", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAddress_Text(), ecorePackage.getEString(), "text", null, 0, 1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAddress_GeoLocation(), this.getGeoLocation(), null, "geoLocation", null, 1, 1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(geoLocationEClass, GeoLocation.class, "GeoLocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGeoLocation_Lat(), ecorePackage.getEFloat(), "lat", null, 0, 1, GeoLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGeoLocation_Lon(), ecorePackage.getEFloat(), "lon", null, 0, 1, GeoLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(shipmentStatusEEnum, ShipmentStatus.class, "ShipmentStatus");
    addEEnumLiteral(shipmentStatusEEnum, ShipmentStatus.NEW);
    addEEnumLiteral(shipmentStatusEEnum, ShipmentStatus.ASSIGNED);
    addEEnumLiteral(shipmentStatusEEnum, ShipmentStatus.UNDERWAY);
    addEEnumLiteral(shipmentStatusEEnum, ShipmentStatus.DELIVERED);

    // Create resource
    createResource(eNS_URI);
  }

} //PickupnetPackageImpl
