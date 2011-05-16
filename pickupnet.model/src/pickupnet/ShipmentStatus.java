/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package pickupnet;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Shipment Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see pickupnet.PickupnetPackage#getShipmentStatus()
 * @model
 * @generated
 */
public enum ShipmentStatus implements Enumerator {
	/**
   * The '<em><b>NEW</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #NEW_VALUE
   * @generated
   * @ordered
   */
	NEW(100, "NEW", "NEW"),

	/**
   * The '<em><b>ASSIGNED</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #ASSIGNED_VALUE
   * @generated
   * @ordered
   */
	ASSIGNED(200, "ASSIGNED", "ASSIGNED"),

	/**
   * The '<em><b>UNDERWAY</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #UNDERWAY_VALUE
   * @generated
   * @ordered
   */
	UNDERWAY(300, "UNDERWAY", "UNDERWAY"),

	/**
   * The '<em><b>DELIVERED</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #DELIVERED_VALUE
   * @generated
   * @ordered
   */
	DELIVERED(400, "DELIVERED", "DELIVERED");

	/**
   * The '<em><b>NEW</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NEW</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #NEW
   * @model
   * @generated
   * @ordered
   */
	public static final int NEW_VALUE = 100;

	/**
   * The '<em><b>ASSIGNED</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ASSIGNED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #ASSIGNED
   * @model
   * @generated
   * @ordered
   */
	public static final int ASSIGNED_VALUE = 200;

	/**
   * The '<em><b>UNDERWAY</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNDERWAY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #UNDERWAY
   * @model
   * @generated
   * @ordered
   */
	public static final int UNDERWAY_VALUE = 300;

	/**
   * The '<em><b>DELIVERED</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DELIVERED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #DELIVERED
   * @model
   * @generated
   * @ordered
   */
	public static final int DELIVERED_VALUE = 400;

	/**
   * An array of all the '<em><b>Shipment Status</b></em>' enumerators.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private static final ShipmentStatus[] VALUES_ARRAY =
		new ShipmentStatus[]
    {
      NEW,
      ASSIGNED,
      UNDERWAY,
      DELIVERED,
    };

	/**
   * A public read-only list of all the '<em><b>Shipment Status</b></em>' enumerators.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final List<ShipmentStatus> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
   * Returns the '<em><b>Shipment Status</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static ShipmentStatus get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ShipmentStatus result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

	/**
   * Returns the '<em><b>Shipment Status</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static ShipmentStatus getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ShipmentStatus result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

	/**
   * Returns the '<em><b>Shipment Status</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static ShipmentStatus get(int value) {
    switch (value)
    {
      case NEW_VALUE: return NEW;
      case ASSIGNED_VALUE: return ASSIGNED;
      case UNDERWAY_VALUE: return UNDERWAY;
      case DELIVERED_VALUE: return DELIVERED;
    }
    return null;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private final int value;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private final String name;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private final String literal;

	/**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private ShipmentStatus(int value, String name, String literal) {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public int getValue() {
    return value;
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
	public String getLiteral() {
    return literal;
  }

	/**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public String toString() {
    return literal;
  }
	
} //ShipmentStatus
