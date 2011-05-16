package dummydata;

import org.eclipse.emf.common.util.EList;

import pickupnet.Address;
import pickupnet.Customer;
import pickupnet.Driver;
import pickupnet.Pickupnet;
import pickupnet.PickupnetFactory;
import pickupnet.Shipment;
import pickupnet.Station;


public class Dummy {

  private final Station station;

  public Dummy( Station station ) {
    this.station = station;
  }

  public void createData() {
    createDrivers();
    createCustomers();
    createShipments();
  }

  public void listData() {
    listCustomers();
    listDrivers();
    listShipments();
  }

  private void createDrivers() {
    for( int i = 0; i < 5; i++ ) {
      Driver driver = PickupnetFactory.eINSTANCE.createDriver();
      driver.setName( "Driver" + ( i + 1 ) );
      station.registerDriver( driver );
    }
  }

  private void createCustomers() {
    for( int i = 0; i < 12; i++ ) {
      Customer customer = PickupnetFactory.eINSTANCE.createCustomer();
      customer.setName( "Customer" + ( i + 1 ) );
      station.registerCustomer( customer );
    }
  }

  private void createShipments() {
    for( int i = 0; i < 7; i++ ) {
      Shipment shipment = PickupnetFactory.eINSTANCE.createShipment();
      Customer orderer = station.getCustomers().get( i * 2 % 12 );
      shipment.setOrderer( orderer );
      Address pickupAddress = PickupnetFactory.eINSTANCE.createAddress();
      pickupAddress.setText( "here" );
      shipment.setPickUpAddress( pickupAddress );
      Address shiptoAddress = PickupnetFactory.eINSTANCE.createAddress();
      shiptoAddress.setText( "there" );
      shipment.setShipToAddress( shiptoAddress );
      station.acceptShipment( shipment );
    }
  }

  private void listDrivers() {
    EList< Driver > drivers = station.getDrivers();
    for( Driver driver : drivers ) {
      System.out.println( "Driver " + driver.getId() + ":" );
      System.out.println( "  name: " + driver.getName() );
      System.out.println( "  assignments: " + driver.getAssignments().size() );
    }
  }

  private void listCustomers() {
    EList< Customer > customers = station.getCustomers();
    for( Customer customer : customers ) {
      System.out.println( "Customer " + customer.getId() + ":" );
      System.out.println( "  name: " + customer.getName() );
      System.out.println( "  orders: " + customer.getOrders().size() );
    }
  }

  private void listShipments() {
    EList<Shipment> shipments = station.getShipments();
    for( Shipment shipment : shipments ) {
      System.out.println( "Shipment " + shipment.getId() + ":" );
      System.out.println( "  from: " + shipment.getPickUpAddress().getText() );
      System.out.println( "  to: " + shipment.getShipToAddress().getText() );
      System.out.println( "  status: " + shipment.getStatus() );
    }
  }

  public static void main( String[] args ) {
    Dummy dummyData = new Dummy( Pickupnet.STATION_1 );
    dummyData.createData();
    dummyData.listData();
  }
}
