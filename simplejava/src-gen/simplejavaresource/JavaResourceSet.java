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

import simplejava.JAttribut;
import simplejava.JClass;
import simplejava.JPackage;
import simplejava.SimplejavaPackage;

public class JavaResourceSet {
	
	public static EList<JClass> getAllClasses(JPackage jpack){
		return jpack.getClasses();
	}
	
	public static void displayAttributes(JPackage jpack)
	{
		for(JClass c : getAllClasses(jpack))
		{
			System.out.println(c.getNom());
			for(JAttribut a : c.getAttributs())
			{
				System.out.println("->"+a.getNom());
			}
		}
	}

	public static int getDeep(JClass jc) {
		if(jc.getMere() == null)
			return 0;
		else
			return 1+ getDeep(jc.getMere());
	}
	
	public static void display_deep_by_package(JPackage j)
	{
		for(JClass c : j.getClasses())
		{
			System.out.println(c.getNom()+" : getdeep = "+getDeep(c));
		}
		if(j.getPackages().size() != 0)
		{
			for(JPackage j1 : j.getPackages())
			{
				display_deep_by_package(j1);
			}
		}
	}
	
	public static String getPackagesNames(JPackage j)
	{
		JPackage pere = (JPackage) j.eContainer();
		if( pere != null)
			return getPackagesNames(pere)+"."+j.getNom();
		else
			return j.getNom();
		
	}
	
	public static String getFullName(JClass c)
	{
		String ret = getPackagesNames(c.getJpackage())+"."+c.getNom();
		return ret;
	}
	
	public static void getFullnameClassesPackage(JPackage p)
	{
		for(JClass c : p.getClasses())
		{
			System.out.println(getFullName(c));
		}
		for(JPackage jp : p.getPackages())
		{
			getFullnameClassesPackage(jp);
		}
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
//		displayAttributes(model);
//		display_deep_by_package(model);
//		for(JClass c : model.getPackages())
//		{
//			System.out.println(getFullName(c));
//			
//		}
		getFullnameClassesPackage(model);
		

	}
	
	

}
