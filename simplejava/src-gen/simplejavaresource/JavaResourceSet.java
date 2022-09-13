package simplejavaresource;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import simplejava.JClass;
import simplejava.JPackage;
import simplejava.SimplejavaPackage;

public class JavaResourceSet {
	
	public static EList<JClass> getAllClasses(JPackage jpack){
		EList<JClass> classes = (EList<JClass>) jpack.eGet(jpack.eClass().getEStructuralFeature("classes"));
		return classes;
	}

	public static void main(String[] args) {
		ResourceSet rset = new ResourceSetImpl();
		rset.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore" , new XMIResourceFactoryImpl() ) ;
		rset.getResourceFactoryRegistry( ).getExtensionToFactoryMap().put("xmi" , new XMIResourceFactoryImpl ( ) ) ;
		rset.getPackageRegistry().put( SimplejavaPackage.eNS_URI, SimplejavaPackage.eINSTANCE ) ;
		Resource resource = rset.getResource(URI.createFileURI("model/simplejava2.xmi") , true );
		JPackage model = ( JPackage ) resource.getContents().get(0);
		
		System.out.println("Debut de programme");
		System.out.println(model.getNom());
		for(JClass c : getAllClasses(model))
		{
			System.out.println(c.getNom());
		}	

	}
	
	

}
