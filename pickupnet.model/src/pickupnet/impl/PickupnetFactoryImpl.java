/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package pickupnet.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import pickupnet.*;
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
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PickupnetFactoryImpl extends EFactoryImpl implements PickupnetFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PickupnetFactory init()
  {
    try
    {
      PickupnetFactory thePickupnetFactory = (PickupnetFactory)EPackage.Registry.INSTANCE.getEFactory("http://pickupnet.de/datamodel"); 
      if (thePickupnetFactory != null)
      {
        return thePickupnetFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new PickupnetFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PickupnetFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case PickupnetPackage.STATION: return createStation();
      case PickupnetPackage.DRIVER: return createDriver();
      case PickupnetPackage.CUSTOMER: return createCustomer();
      case PickupnetPackage.SHIPMENT: return createShipment();
      case PickupnetPackage.ADDRESS: return createAddress();
      case PickupnetPackage.GEO_LOCATION: return createGeoLocation();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case PickupnetPackage.SHIPMENT_STATUS:
        return createShipmentStatusFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case PickupnetPackage.SHIPMENT_STATUS:
        return convertShipmentStatusToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Station createStation()
  {
    StationImpl station = new StationImpl();
    return station;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Driver createDriver()
  {
    DriverImpl driver = new DriverImpl();
    return driver;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Customer createCustomer()
  {
    CustomerImpl customer = new CustomerImpl();
    return customer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Shipment createShipment()
  {
    ShipmentImpl shipment = new ShipmentImpl();
    return shipment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Address createAddress()
  {
    AddressImpl address = new AddressImpl();
    return address;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GeoLocation createGeoLocation()
  {
    GeoLocationImpl geoLocation = new GeoLocationImpl();
    return geoLocation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ShipmentStatus createShipmentStatusFromString(EDataType eDataType, String initialValue)
  {
    ShipmentStatus result = ShipmentStatus.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertShipmentStatusToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PickupnetPackage getPickupnetPackage()
  {
    return (PickupnetPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static PickupnetPackage getPackage()
  {
    return PickupnetPackage.eINSTANCE;
  }

} //PickupnetFactoryImpl
