/*******************************************************************************
 * Copyright (c) EclipseSource (2011). All Rights Reserved.
 * 
 * Contributors:
 *      Holger Staudacher - initial API and Implementation
 ******************************************************************************/
package pickupnet.ui.business.rap;

import org.eclipse.rwt.lifecycle.UICallBack;
import org.eclipse.swt.SWT;

import pickupnet.ui.business.singlesourcing.SingleSourcingService;


public class RAPSingleSourcingService implements SingleSourcingService {

  @Override
  public int getShellStyle() {
    return SWT.NO_TRIM;
  }

  @Override
  public void startUiCallBack() {
    UICallBack.activate( "callback" );
  }

  @Override
  public void stopUiCallback() {
    UICallBack.deactivate( "callback" );
  }
}
