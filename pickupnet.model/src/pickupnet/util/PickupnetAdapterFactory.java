/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package pickupnet.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import pickupnet.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see pickupnet.PickupnetPackage
 * @generated
 */
public class PickupnetAdapterFactory extends AdapterFactoryImpl {
	/**
   * The cached model package.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected static PickupnetPackage modelPackage;

	/**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public PickupnetAdapterFactory() {
    if (modelPackage == null)
    {
      modelPackage = PickupnetPackage.eINSTANCE;
    }
  }

	/**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
	@Override
	public boolean isFactoryForType(Object object) {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

	/**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected PickupnetSwitch<Adapter> modelSwitch =
		new PickupnetSwitch<Adapter>()
    {
      @Override
      public Adapter caseStation(Station object)
      {
        return createStationAdapter();
      }
      @Override
      public Adapter caseDriver(Driver object)
      {
        return createDriverAdapter();
      }
      @Override
      public Adapter caseCustomer(Customer object)
      {
        return createCustomerAdapter();
      }
      @Override
      public Adapter caseShipment(Shipment object)
      {
        return createShipmentAdapter();
      }
      @Override
      public Adapter caseAddress(Address object)
      {
        return createAddressAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

	/**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
	@Override
	public Adapter createAdapter(Notifier target) {
    return modelSwitch.doSwitch((EObject)target);
  }


	/**
   * Creates a new adapter for an object of class '{@link pickupnet.Driver <em>Driver</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see pickupnet.Driver
   * @generated
   */
	public Adapter createDriverAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link pickupnet.Customer <em>Customer</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see pickupnet.Customer
   * @generated
   */
	public Adapter createCustomerAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link pickupnet.Shipment <em>Shipment</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see pickupnet.Shipment
   * @generated
   */
	public Adapter createShipmentAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link pickupnet.Address <em>Address</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see pickupnet.Address
   * @generated
   */
	public Adapter createAddressAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link pickupnet.Station <em>Station</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see pickupnet.Station
   * @generated
   */
	public Adapter createStationAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
	public Adapter createEObjectAdapter() {
    return null;
  }

} //PickupnetAdapterFactory
