/*******************************************************************************
 * Copyright (c) EclipseSource (2011). All Rights Reserved.
 * 
 * Contributors:
 *      Holger Staudacher - initial API and Implementation
 ******************************************************************************/
package pickupnet.ui.business.singlesourcing;


public interface SingleSourcingService {

  int getShellStyle();

  void startUiCallBack();

  void stopUiCallback();
}
