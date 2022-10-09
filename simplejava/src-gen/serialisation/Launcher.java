package serialisation;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import simplejava.JPackage;
import simplejava.SimplejavaPackage;

public class Launcher {
	
	public static void main(String[] args) {
		
		ResourceSet rset = new ResourceSetImpl();
		rset.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore" , new XMIResourceFactoryImpl() ) ;
		rset.getResourceFactoryRegistry( ).getExtensionToFactoryMap().put("xmi" , new XMIResourceFactoryImpl() ) ;
		rset.getPackageRegistry().put( SimplejavaPackage.eNS_URI, SimplejavaPackage.eINSTANCE ) ;
		Resource resourceXmi = rset.getResource(URI.createFileURI("model/simplejava.xmi") , true );
		
		JPackage root = (JPackage) resourceXmi.getContents().get(0);
		
//		System.out.println(root.eClass().getEPackage().getNsURI());
		Serialiser s = new Serialiser(root);
		s.serialise();

	}

}
