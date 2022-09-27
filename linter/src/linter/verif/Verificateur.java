package linter.verif;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Verificateur est la classe qui contient toutes les fonctions de vérification
 * @author M'RABET EL KHOMSSI Hatim
 */
public class Verificateur {

	public Verificateur()
	{
		
	}
	
	/*
	 * Les noms des classes, interfaces et énumérations doivent commencer par une
	 * majuscule et avoir moins de 30 caractères.
	 */
	public String checkClassName(Class c)
	{
		String name = c.getSimpleName();
		String ret = "";
		if(name.length() >= 30)
			ret += name +": Le nom de la classe est trop long (+30 characteres)\n";
		if(name.charAt(0) != name.toUpperCase().charAt(0))
			ret += name +": Le nom doit commencer par une majuscule\n";
		if( ret != "")
			return ret;
		return ret + name + ": OK\n";
	}

	/*
	 * Les noms des interfaces doivent commencer par un I et le mot après doit
	 * commencer par une majuscule.
	 */
	public String checkInterfaceName(Class c)
	{
		String name = c.getSimpleName();
		String ret = "";
		if(!c.isInterface())
			ret += name +": Ce n'est pas une interface\n";
		if(name.charAt(0) != 'I')
			ret += name + ":Le nom doit commencer par 'I'\n";
		if(!name.substring(0, 2).equals(name.toUpperCase().substring(0, 2)))
			ret += name + ":Le nom doit commencer par 2 lettres en majuscule, "+ name.substring(0, 2)+"'\n";
		if(ret != "")
			return ret;
		return ret + name +": commence par un I: OK\n";
	}

	/*
	 * Les noms des énumérations doivent commencer par un E et le mot après doit
	 * commencer par une majuscule.
	 */
	public String checkEnumName(Class c)
	{
		String name = c.getSimpleName();
		String ret = "";
		if(!c.isEnum())
			ret += name + ": " +"Ce n'est pas un enum\n";
		if(!name.startsWith("E"))
			ret += name +": Le nom doit commencer par 'E'\n";
		if(!name.substring(0, 2).equals(name.toUpperCase().substring(0, 2)))
			ret += name +": Le nom doit commencer par 2 lettres en majuscule, '"+ name.substring(0, 2)+"'\n";
		if(ret != "")
			return ret;
		return ret + name +": commence par un E: OK\n";
	}

	/*
	 * Les noms des classes abstraites doivent commencer par un A et le mot après
	 * doit commencer par une majuscule.
	 */
	public String checkAbstractClass(Class c)
	{
		String name = c.getSimpleName();
		String ret = "";
		if(!Modifier.isAbstract(c.getModifiers()))
			ret+= name +": Ce n'est pas une classe abstraite\n";
		if(!name.startsWith("A"))
			ret += name + ":Le nom doit commencer par 'A'\n";
		if(!name.substring(0, 2).equals(name.toUpperCase().substring(0, 2)))
			ret += name + ":Le nom doit commencer par 2 lettres en majuscule, '"+ name.substring(0, 2)+"'\n";
		if(ret != "")
			return ret;

		return ret + name + ": commence par un A: OK\n";
	}
	
	/*
	 * Les noms des méthodes doivent commencer par une minuscule
	 */
	public String checkMethodName(Method m)
	{
		String name = m.getName();
		String ret = "";
		if(!name.substring(0,1).equals(name.toLowerCase().substring(0,1)))
			return ret +name + ": Le nom doit commencer par une miniscule\n";
		return ret + name +": OK\n";
	}
	
	/*
	 * Les noms des attributs doivent commencer par une minuscule sauf si ce sont
	 * des constantes et dans ce cas, ils doivent être en majuscule.
	 */
	public String checkFieldName(Field f)
	{
		String name = f.getName();
		String ret = "";
		if(Modifier.isFinal(f.getModifiers()))
		{
			if(!name.equals(name.toUpperCase()))
				ret += name + ": C'est une constante, tout le nom doit etre en majuscule\n";
		}
		else 
		{
			if(!name.substring(0,1).equals(name.toLowerCase().substring(0,1)))
				ret += name + ": Le nom doit commencer par une miniscule\n";
		}
		if(ret != "")
			return ret;
		return ret + "FieldName: OK\n";
	}

	/*
	 * Les classes abstraites doivent avoir au moins une méthode abstraite.
	 */
	public String checkAbstractMethodeExist(Class c)
	{
		String name = c.getSimpleName();
		String ret = name+": ";
		if(!Modifier.isAbstract(c.getModifiers()))
			return ret+"Ce n'est pas une classe abstraite\n";
		for(Method m : c.getDeclaredMethods())
		{
			if(Modifier.isAbstract(m.getModifiers()))
				return ret + "AbstractMethodeExist: OK\n";
		}
		return ret + "Il n'y a pas de methode abstraite\n";
	}

	/*
	 * Les énumérations doivent avoir au moins deux valeurs énumérées.
	 */
	public String checkEnumValues(Class c)
	{
		String name =c.getSimpleName();
		String ret = name+": ";
		if(!c.isEnum())
			return ret+"Ce n'est pas un enum\n";
		if(c.getEnumConstants().length < 2)
			return ret + "Il n'y a pas assez de valeurs, il faut avoir au moins 2 valeurs.\n";
		return ret + " au moins deux valeurs énumérées: OK\n";
	}

	/*
	 * Les méthodes ne doivent pas lever directement Exception mais une de ses
	 * sousclasses.
	 */
	public String checkMethodeException(Method m)
	{
		String name = m.getName();
		String ret = name+": ";
		if(m.getExceptionTypes().length != 0)
		{
			for(Class c : m.getExceptionTypes())
			{
				if(c == Exception.class)
					return ret + "Il ne doivent pas lever directement 'Exception'\n";
			}
		}
		return ret + "MethodeException: OK\n";
	}

	/*
	 * Les classes protected ou private ne peuvent pas avoir de méthodes ou
	 * d’attributs public.
	 */
	public String checkProtectedPrivateClass(Class c)
	{
		String name = c.getSimpleName();
		String ret = "";
		if(Modifier.isPrivate(c.getModifiers()) || Modifier.isProtected(c.getModifiers()))
		{
			for(Field f : c.getDeclaredFields())
			{
				if(Modifier.isPublic(f.getModifiers()))
				{
					ret += name+ ": ne doit pas avoir de champ public, "+f.getName()+" est public.\n";
				}
			}
			for (Method m : c.getDeclaredMethods()) {
				if (Modifier.isPublic(m.getModifiers())) {
					ret += name+ ": ne doit pas avoir de methode public, " + m.getName() + " est public.\n";
				}
			}
		}
		else {
			return ret+"Ce n'est pas une classe abstraite\n";
		}
		if( ret != "")
			return ret;
		return ret + name + ": OK\n";
	}

	/*
	 * Les interfaces doivent être implémentées. On remarquera qu’il n’est pas
	 * possible * d’avoir directement cette information, mais qu’il est facile 
	 * pour une classe de savoir les interfaces qu’elle implémente.
	 */
	public String checkInterfaceImplementation(Class<?>[] classes, Class i)
	{
		String name = i.getSimpleName();
		String ret = name+": ";
		for(Class c : classes)
		{
			Class[] interfaces = c.getInterfaces();
			if(interfaces.length != 0)
			{
				for(Class inter : interfaces)
				{
					if(inter.equals(i))
						return ret + "OK, implemented in Class '"+c.getSimpleName()+"'\n";
				}
			}
		}
		return ret + "Il n'y a pas de classe qui implemente l'interface '"+name+"'\n";

	}


	/*
	 * Les packages doivent avoir au moins deux classes. On remarquera là aussi
	 * qu’il n’est pas possible d’avoir directement cette information, mais qu’il est
	 * facile pour une classe de connaître son package.
	 */
	public String checkPackageClasses(Class<?>[] classes, Package p)
	{
		String name = p.getName();
		String ret = name+": ";
		int nb = 0;
		for(Class c : classes)
		{
			if(c.getPackage().equals(p))
				nb++;
		}
		if(nb < 2)
			return ret + "Un package doit avoir au moins 2 classes.\n";
		return ret + "OK\n";
	}



	
}
