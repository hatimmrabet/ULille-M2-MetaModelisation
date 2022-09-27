package linter.verif;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import linter.classes.ADocument;
import linter.classes.AFile;
import linter.classes.DemoPrivateClass;
import linter.classes.EStatus;
import linter.classes.Enfant;
import linter.classes.Estatus2;
import linter.classes.IPersonne;
import linter.classes.Imaison;
import linter.classes.Vehicule;
import linter.classes.afile1;
import linter.classes.status;
import linter.classes.velo;
import linter.classes.exception.NoBreaksException;

/**
 * Cette class est utilisé pour tester la class Verificateur au cours du
 * developpement, peut etre ignorer on depot final
 */
public class testVerif {
    public static void main(String[] args) {

        Verificateur verif = new Verificateur();

        System.out.println(verif.checkClassName(Vehicule.class));
        System.out.println(verif.checkClassName(velo.class));

        System.out.println(verif.checkInterfaceName(velo.class));
        System.out.println(verif.checkInterfaceName(IPersonne.class));
        System.out.println(verif.checkInterfaceName(Imaison.class));

        System.out.println("checkEnumName");
        System.out.println(verif.checkEnumName(EStatus.class));
        System.out.println(verif.checkEnumName(Estatus2.class));
        System.out.println(verif.checkEnumName(status.class));

        System.out.println("checkAbstractClass");
        System.out.println(verif.checkAbstractClass(Vehicule.class));
        System.out.println(verif.checkAbstractClass(AFile.class));
        System.out.println(verif.checkAbstractClass(afile1.class));

        System.out.println("checkMethod");
        for (Method m : Vehicule.class.getDeclaredMethods())
            System.out.println(verif.checkMethodName(m));

        System.out.println("checkField");
        for (Field f : Vehicule.class.getDeclaredFields())
            System.out.println(verif.checkFieldName(f));

        System.out.println("checkAbstractMethodeExist");
        System.out.println(verif.checkAbstractMethodeExist(Vehicule.class));
        System.out.println(verif.checkAbstractMethodeExist(AFile.class));
        System.out.println(verif.checkAbstractMethodeExist(ADocument.class));

        System.out.println("checkEnumValues");
        System.out.println(verif.checkEnumValues(EStatus.class));
        System.out.println(verif.checkEnumValues(Estatus2.class));
        System.out.println(verif.checkEnumValues(status.class));

        System.out.println("checkMethodeException");
        for (Method m : Vehicule.class.getDeclaredMethods())
            System.out.println(verif.checkMethodeException(m));

        System.out.println("checkProtectedPrivateClass");
        System.out.println(verif.checkProtectedPrivateClass(Vehicule.class));

        Class<DemoPrivateClass> c = DemoPrivateClass.class;
        for (Class<?> i : c.getDeclaredClasses())
            System.out.println(verif.checkProtectedPrivateClass(i));
        System.out.println(verif.checkProtectedPrivateClass(Vehicule.class));

        Class<?>[] classes = { Vehicule.class, velo.class, IPersonne.class, Imaison.class, EStatus.class,
                Estatus2.class,
                status.class, AFile.class, afile1.class, ADocument.class, DemoPrivateClass.class, Enfant.class };

        System.out.println("checkinterfaces");
        System.out.println(verif.checkInterfaceImplementation(classes, IPersonne.class));
        System.out.println(verif.checkInterfaceImplementation(classes, Imaison.class));

        System.out.println("checkPackages");
        System.out.println(verif.checkPackageClasses(classes, Vehicule.class.getPackage()));
        System.out.println(verif.checkPackageClasses(classes, NoBreaksException.class.getPackage()));

    }

}
