/*******************************************************************************
 * Copyright (c) EclipseSource (2011). All Rights Reserved.
 * 
 * Contributors:
 *      Holger Staudacher - initial API and Implementation
 ******************************************************************************/
package pickupnet.ui.business;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.rwt.RWT;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import pickupnet.Customer;
import pickupnet.Pickupnet;
import pickupnet.Shipment;
import pickupnet.ShipmentStatus;



public class NavigationPart {
  
  private class NavigationContentProvider implements ITreeContentProvider {

    private Customer customer;

    @Override
    public void dispose() {
      // TODO Auto-generated method stub
      
    }

    @Override
    public void inputChanged( Viewer viewer, Object oldInput, Object newInput ) {
      customer = ( Customer )newInput;
    }

    @Override
    public Object[] getElements( Object inputElement ) {
      customer = ( Customer )inputElement;
      return ShipmentStatus.values();
    }

    @Override
    public Object[] getChildren( Object parentElement ) {
      Object[] result = null;
      if( parentElement instanceof Customer ) {
        result = ShipmentStatus.values();
      } else if( parentElement instanceof ShipmentStatus ) {
        EList<Shipment> orders = customer.getOrders();
        List<Shipment> shipments = new ArrayList<Shipment>();
        for( Shipment shipment : orders ) {
          if( shipment.getStatus().equals( parentElement ) ) {
            shipments.add( shipment );
          }
        }
        result = new Shipment[ shipments.size() ];
        shipments.toArray( result );
      }
      return result;
    }

    @Override
    public Object getParent( Object element ) {
      Object result = null;
      if( element instanceof ShipmentStatus ) {
        result = customer;
      } else if( element instanceof Shipment ) {
        result = ( ( Shipment ) element ).getStatus();
      }
      return result;
    }

    @Override
    public boolean hasChildren( Object element ) {
      boolean result = false;
      if( !( element instanceof Shipment ) ) {
        result = true;
      }
      return result;
    }
    
  }
  
  private class NavigationlabelProvider extends LabelProvider {
    @Override
    public String getText( Object element ) {
      String result = super.getText( element );
      if( element instanceof Shipment ) {
        Shipment shipment = ( Shipment )element;
        result = shipment.getPickUpAddress().getText() + ", " + shipment.getShipToAddress().getText();
      }
      return result;
    }
    
    @Override
    public Image getImage( Object element ) {
      Image result = super.getImage( element );
      if( element instanceof Shipment ) {
        ImageDescriptor descriptor = AbstractUIPlugin.imageDescriptorFromPlugin( "pickupnet.ui.business", "icons/package.png" );
        result = descriptor.createImage();
      }
      return result;
    }
  }


  private ContentPart contentPart;

  public NavigationPart( ContentPart contentPart ) {
    this.contentPart = contentPart;
  }

  public void createControl( Composite navigation ) {
    navigation.setLayout( new GridLayout( 1, true ) );
    TreeViewer viewer = new TreeViewer( navigation, SWT.H_SCROLL | SWT.V_SCROLL );
    viewer.getTree().setLayoutData( new GridData( SWT.FILL, SWT.FILL, true, true ) );
    viewer.setContentProvider( new NavigationContentProvider() );
    viewer.setLabelProvider( new NavigationlabelProvider() );
    viewer.setInput( getInitalInput() );
    viewer.expandAll();
    viewer.addSelectionChangedListener( new ISelectionChangedListener() {
      
      @Override
      public void selectionChanged( SelectionChangedEvent event ) {
        IStructuredSelection selection = ( IStructuredSelection )event.getSelection();
        Object firstElement = selection.getFirstElement();
        if( firstElement instanceof Shipment ) {
          contentPart.selectionChanged( ( Shipment )firstElement );
        }
      }
    } );
  }


  private Customer getInitalInput() {
    EList<Customer> customers = Pickupnet.STATION_1.getCustomers();
    HttpServletRequest request = RWT.getRequest();
    String userId = request.getParameter( "id" );
    Customer result = null;
    for( Customer customer : customers ) {
      if( customer.getId().equals( userId ) ) {
        result = customer;
      }
    }
    return result;
  }
}
