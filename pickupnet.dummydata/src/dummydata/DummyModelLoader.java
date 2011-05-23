/*******************************************************************************
 * Copyright (c) EclipseSource (2011). All Rights Reserved.
 * 
 * Contributors:
 *      Holger Staudacher - initial API and Implementation
 ******************************************************************************/
package dummydata;

import pickupnet.PickupnetFactory;
import pickupnet.Station;
import pickupnet.util.ModelLoader;


public class DummyModelLoader implements ModelLoader {

  @Override
  public Station loadStation() {
    Station station = PickupnetFactory.eINSTANCE.createStation();
    Dummy dummy = new Dummy( station );
    dummy.createData();
    return station;
  }
}
