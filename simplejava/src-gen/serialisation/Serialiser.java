package serialisation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import simplejava.JAttribut;
import simplejava.JClass;
import simplejava.JInterface;
import simplejava.JPackage;

public class Serialiser {

	long nextID;
	JPackage root;
	String uri;
	HashMap<EObject, Long> tout;
	List<String> lines;
	
	public Serialiser(JPackage root)
	{
		this.nextID = 1;
		this.root = root;
		this.uri = root.eClass().getEPackage().getNsURI();
		this.tout = new HashMap<>();
		this.lines = new ArrayList<>();
	}
	
	long getNextID()
	{
		return this.nextID;
	}
	
	void incNextID()
	{
		this.nextID++;
	}
	
	public void serialise()
	{
		getJSON(this.root);
		for(String line : lines)
			System.out.print(line);
	}
	
	public void getJSON(JPackage p)
	{
		String ret = "{\"#id\" : "+this.getNextID()+", ";
		ret += "\"#metaclass\" : "+this.uri+"#"+p.eClass().getName()+", ";
		ret += "\"name\" : "+p.getNom();
		tout.put(p,this.getNextID());
		this.incNextID();
		
		JPackage parent = (JPackage) p.eContainer();
		if(parent != null)
		{
			ret += ", \"@parentPackage\":"+tout.get(parent);
		}
		
		for(JClass c: p.getClasses())
		{
			getJSON(c);
		}
		
		for(JPackage jp : p.getPackages())
		{
			getJSON(jp);
		}
		lines.add(ret+"}\n");
	}
	
	public void getJSON(JClass c)
	{
		if(this.tout.containsKey(c))
			return;

		String ret = "{\"#id\" : "+this.getNextID()+", ";
		ret += "\"#metaclass\" : "+this.uri+"#"+c.eClass().getName()+", ";
		ret += "\"name\" : "+c.getNom();
		tout.put(c, this.getNextID());
		this.incNextID();
		
		if(c.getMere() != null)
		{
			if(!tout.containsKey(c.getMere()))
			{
				getJSON(c.getMere());
			}
			ret += ", \"@classMere\": "+tout.get(c.getMere());
		}
		if(c.getFilles().size() != 0)
		{
			ret += ", \"@classesFilles\": [";
			for(JClass jc : c.getFilles())
			{
				getJSON(jc);
				ret+= "{\"ref\":"+ tout.get(jc) +"}";
			}
			ret += "]";			
		}
		if(c.getInterfaces().size() != 0)
		{
			ret += ", \"@interfaces\": [";
			for(JInterface i : c.getInterfaces())
			{
				getJSON(i);
				ret+= "{\"ref\":"+ tout.get(i) +"}";
			}
			ret += "]";			
		}
		if(c.getAttributs().size() != 0)
		{
			ret += ", \"@attributs\": [";
			for(JAttribut a : c.getAttributs())
			{
				getJSON(a);
				ret+= "{\"ref\":"+ tout.get(a) +"}";
			}
			ret += "]";	
		}
		lines.add(ret+"}\n");
	}
	
	public void getJSON(JInterface i)
	{
		if(this.tout.containsKey(i))
			return;
		
		String ret = "{\"#id\" : "+this.getNextID()+", ";
		ret += "\"#metaclass\" : "+this.uri+"#"+i.eClass().getName()+", ";
		ret += "\"name\" : "+i.getNom();
		tout.put(i, this.getNextID());
		this.incNextID();
		if(i.getClasses().size() != 0)
		{
			ret += ", \"@classes\": [";
			for(JClass jc : i.getClasses())
			{
				getJSON(jc);
				ret+= "{\"ref\":"+ tout.get(jc) +"}";
			}
			ret += "]";			
		}
		lines.add(ret+"}\n");
	}
	
	public void getJSON(JAttribut a)
	{
		if(this.tout.containsKey(a))
			return;
		String ret = "{\"#id\" : "+this.getNextID()+", ";
		ret += "\"#metaclass\" : "+this.uri+"#"+a.eClass().getName()+", ";
		ret += "\"name\" : "+a.getNom();
		tout.put(a, this.getNextID());
		this.incNextID();
		lines.add(ret+"}\n");
	}

	
}
