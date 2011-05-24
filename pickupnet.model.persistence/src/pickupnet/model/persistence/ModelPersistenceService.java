/*******************************************************************************
 * Copyright (c) EclipseSource (2011). All Rights Reserved.
 * 
 * Contributors:
 *      Holger Staudacher - initial API and Implementation
 ******************************************************************************/
package pickupnet.model.persistence;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Factory.Registry;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;

import pickupnet.Pickupnet;
import pickupnet.PickupnetFactory;
import pickupnet.PickupnetPackage;
import pickupnet.Station;
import pickupnet.util.ModelLoader;
import pickupnet.util.PickupnetAdapterFactory;


public class ModelPersistenceService implements ModelLoader {
  
  private static final String FILE_PATH = "/tmp/station.xml";
  private static final String MODEL_URI = "http://pickupnet.de/datamodel";

  @Override
  public Station loadStation() {
    Station result = null;
    try {
      AdapterFactoryEditingDomain editingDomain 
        = new AdapterFactoryEditingDomain( new PickupnetAdapterFactory(), new BasicCommandStack() );
      ResourceSet resourceSet = createResourceSet( editingDomain );
      File file = new File( FILE_PATH );
      EPackage.Registry.INSTANCE.put( MODEL_URI, PickupnetPackage.eINSTANCE );
      boolean needToSave = !file.exists();
      final Resource resource = createResource( resourceSet, needToSave );
      addNotifyChangeListener( resource );
      EList<EObject> contents = resource.getContents();
      result = assignResult( resource, contents );
    } catch( Exception e ) {
      e.printStackTrace();
    }
    return result;
  }
  
  private static ResourceSet createResourceSet( AdapterFactoryEditingDomain editingDomain ) {
    ResourceSet resourceSet = editingDomain.getResourceSet();
    Registry resourceFactoryRegistry = resourceSet.getResourceFactoryRegistry();
    resourceFactoryRegistry.getProtocolToFactoryMap().put( "xml", new XMLResourceFactoryImpl() );
    return resourceSet;
  }

  private static Resource createResource( ResourceSet resourceSet, boolean needToSave )
    throws IOException
  {
    final Resource resource = resourceSet.createResource( URI.createFileURI( FILE_PATH ), "xml" );
    if( needToSave ) {
      resource.getContents().add( PickupnetFactory.eINSTANCE.createStation() );
      resource.save( null );
    }
    resource.load( null );
    return resource;
  }

  private static void addNotifyChangeListener( final Resource resource ) {
    resource.eAdapters().add( new EContentAdapter() {
      private boolean isSaving;
 
      @Override
      public void notifyChanged( Notification notification ) {
        super.notifyChanged( notification );
        if( !notification.isTouch() && !isSaving ) {
          try {
            isSaving = true;
            resource.save( null );
            isSaving = false;
          } catch( IOException e ) {
            e.printStackTrace();
          }
        }
      }
    } );
  }

  private static Station assignResult( final Resource resource, EList<EObject> contents ) {
    Station result;
    if( !contents.isEmpty() ) {
      result = ( Station )contents.get( 0 );
    } else {
      result = PickupnetFactory.eINSTANCE.createStation();
      resource.getContents().add( Pickupnet.STATION_1 );
    }
    return result;
  }
}
