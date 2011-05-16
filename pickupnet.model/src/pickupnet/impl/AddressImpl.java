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

import pickupnet.Address;
import pickupnet.GeoLocation;
import pickupnet.PickupnetPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Address</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link pickupnet.impl.AddressImpl#getText <em>Text</em>}</li>
 *   <li>{@link pickupnet.impl.AddressImpl#getGeoLocation <em>Geo Location</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AddressImpl extends EObjectImpl implements Address {
	/**
   * The default value of the '{@link #getText() <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getText()
   * @generated
   * @ordered
   */
	protected static final String TEXT_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getText()
   * @generated
   * @ordered
   */
	protected String text = TEXT_EDEFAULT;

	/**
   * The default value of the '{@link #getGeoLocation() <em>Geo Location</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getGeoLocation()
   * @generated
   * @ordered
   */
	protected static final GeoLocation GEO_LOCATION_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getGeoLocation() <em>Geo Location</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getGeoLocation()
   * @generated
   * @ordered
   */
	protected GeoLocation geoLocation = GEO_LOCATION_EDEFAULT;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected AddressImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return PickupnetPackage.Literals.ADDRESS;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getText() {
    return text;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setText(String newText) {
    String oldText = text;
    text = newText;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PickupnetPackage.ADDRESS__TEXT, oldText, text));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GeoLocation getGeoLocation() {
    return geoLocation;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setGeoLocation(GeoLocation newGeoLocation) {
    GeoLocation oldGeoLocation = geoLocation;
    geoLocation = newGeoLocation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PickupnetPackage.ADDRESS__GEO_LOCATION, oldGeoLocation, geoLocation));
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
      case PickupnetPackage.ADDRESS__TEXT:
        return getText();
      case PickupnetPackage.ADDRESS__GEO_LOCATION:
        return getGeoLocation();
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
      case PickupnetPackage.ADDRESS__TEXT:
        setText((String)newValue);
        return;
      case PickupnetPackage.ADDRESS__GEO_LOCATION:
        setGeoLocation((GeoLocation)newValue);
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
      case PickupnetPackage.ADDRESS__TEXT:
        setText(TEXT_EDEFAULT);
        return;
      case PickupnetPackage.ADDRESS__GEO_LOCATION:
        setGeoLocation(GEO_LOCATION_EDEFAULT);
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
      case PickupnetPackage.ADDRESS__TEXT:
        return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
      case PickupnetPackage.ADDRESS__GEO_LOCATION:
        return GEO_LOCATION_EDEFAULT == null ? geoLocation != null : !GEO_LOCATION_EDEFAULT.equals(geoLocation);
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
    result.append(" (text: ");
    result.append(text);
    result.append(", geoLocation: ");
    result.append(geoLocation);
    result.append(')');
    return result.toString();
  }

} //AddressImpl
