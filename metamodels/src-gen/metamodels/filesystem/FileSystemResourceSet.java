package metamodels.filesystem;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import filesystem.Disque;
import filesystem.File;
import filesystem.FilesystemPackage;
import filesystem.Folder;
import filesystem.ShortcutFile;


public class FileSystemResourceSet {

	public static int nbFiles(File f)
	{
		int ret=0;
		if(f.eClass().getName().equals(Folder.class.getSimpleName()))
		{
			System.out.println(f.getName()+", taille : "+sizeFolder((Folder) f));
			for(File file : ((Folder) f).getFiles())
			{	
				ret += nbFiles(file);
			}
		}
		else if(!f.eClass().getName().equals(ShortcutFile.class.getSimpleName()) )
		{
			ret += 1;
		}
		return ret;
	}
	

	public static int nbFiles(Disque d)
	{
		int ret =0;
		for(File f : d.getFiles())
		{
			ret += nbFiles(f);
		}
		return ret;
	}
	
	public static int sizeFolder(Folder f)
	{
		int ret = 0;
		for(File file : f.getFiles())
		{
			if(file.eClass().getName().equals(Folder.class.getSimpleName()))
			{
				ret += sizeFolder((Folder) file);
			}
			else
			{
				ret += file.getSize();				
			}
		}
		return ret;
	}
	
	public static int sizeDisque(Disque d)
	{
		int ret = 0;
		for(File f : d.getFiles())
		{
			if(f.eClass().getName().equals(Folder.class.getSimpleName()))
			{
				ret += sizeFolder((Folder) f);
			} else {
				ret += f.getSize();				
			}
		}
		return ret;
	}
	
	public static void main(String[] args) {
		ResourceSet rset = new ResourceSetImpl();
		rset.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore" , new XMIResourceFactoryImpl() ) ;
		rset.getResourceFactoryRegistry( ).getExtensionToFactoryMap().put("xmi" , new XMIResourceFactoryImpl( ) ) ;
		rset.getPackageRegistry().put(FilesystemPackage.eNS_URI, FilesystemPackage.eINSTANCE);
		Resource resource = rset.getResource(URI.createFileURI("model/filesystem1.xmi") , true );
		Disque disk = (Disque) resource.getContents().get(0);	

		System.out.println("nb files = "+nbFiles(disk));
		System.out.println("size disk= "+sizeDisque(disk));		
	}
}
