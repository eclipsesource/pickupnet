/*******************************************************************************
 * Copyright (c) EclipseSource (2011). All Rights Reserved.
 * 
 * Contributors:
 *      Holger Staudacher - initial API and Implementation
 ******************************************************************************/
package pickupnet.ui.business.rcp;

import org.eclipse.swt.SWT;

import pickupnet.ui.business.singlesourcing.SingleSourcingService;


public class RCPSingleSourcingService implements SingleSourcingService {

  @Override
  public int getShellStyle() {
    return SWT.SHELL_TRIM;
  }

  @Override
  public void startUiCallBack() {
  }

  @Override
  public void stopUiCallback() {
  }
}
