/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package pickupnet.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import pickupnet.GeoLocation;
import pickupnet.PickupnetPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Geo Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link pickupnet.impl.GeoLocationImpl#getLat <em>Lat</em>}</li>
 *   <li>{@link pickupnet.impl.GeoLocationImpl#getLon <em>Lon</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeoLocationImpl extends EObjectImpl implements GeoLocation
{
  /**
   * The default value of the '{@link #getLat() <em>Lat</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLat()
   * @generated
   * @ordered
   */
  protected static final float LAT_EDEFAULT = 0.0F;

  /**
   * The cached value of the '{@link #getLat() <em>Lat</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLat()
   * @generated
   * @ordered
   */
  protected float lat = LAT_EDEFAULT;

  /**
   * The default value of the '{@link #getLon() <em>Lon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLon()
   * @generated
   * @ordered
   */
  protected static final float LON_EDEFAULT = 0.0F;

  /**
   * The cached value of the '{@link #getLon() <em>Lon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLon()
   * @generated
   * @ordered
   */
  protected float lon = LON_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GeoLocationImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return PickupnetPackage.Literals.GEO_LOCATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public float getLat()
  {
    return lat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLat(float newLat)
  {
    float oldLat = lat;
    lat = newLat;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PickupnetPackage.GEO_LOCATION__LAT, oldLat, lat));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public float getLon()
  {
    return lon;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLon(float newLon)
  {
    float oldLon = lon;
    lon = newLon;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PickupnetPackage.GEO_LOCATION__LON, oldLon, lon));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case PickupnetPackage.GEO_LOCATION__LAT:
        return getLat();
      case PickupnetPackage.GEO_LOCATION__LON:
        return getLon();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PickupnetPackage.GEO_LOCATION__LAT:
        setLat((Float)newValue);
        return;
      case PickupnetPackage.GEO_LOCATION__LON:
        setLon((Float)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case PickupnetPackage.GEO_LOCATION__LAT:
        setLat(LAT_EDEFAULT);
        return;
      case PickupnetPackage.GEO_LOCATION__LON:
        setLon(LON_EDEFAULT);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case PickupnetPackage.GEO_LOCATION__LAT:
        return lat != LAT_EDEFAULT;
      case PickupnetPackage.GEO_LOCATION__LON:
        return lon != LON_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (lat: ");
    result.append(lat);
    result.append(", lon: ");
    result.append(lon);
    result.append(')');
    return result.toString();
  }

} //GeoLocationImpl
