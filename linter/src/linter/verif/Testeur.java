package linter.verif;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/*
 * La Class Testeur permet de lancer tous les tests de verification 
 * et d'afficher les resultats dans la console et enregistrer dans un fichier
 */
public class Testeur {

    Class<?>[] classes;

    public Testeur(Class<?>[] classes) {
        this.classes = classes;
    }

    /*
     * La methode saveData permet d'enregistrer les resultats dans un fichier
     */
    public void saveData(String filename, String data)
    {
        PrintWriter writer;
        try {
            writer = new PrintWriter(filename, "UTF-8");
            writer.println(data);
            writer.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e.getMessage());
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    /**
     * La methode test permet de lancer tous les tests de verification
     */
    public void test() {
        Verificateur verif = new Verificateur();
        String res = "";
        for (Class<?> c : classes) {
            res += "### Classe : " + c.getSimpleName()+"\n";
            res += verif.checkClassName(c);
            if(c.isInterface())
                res += verif.checkInterfaceName(c);
            if(c.isEnum())
            {
                res += verif.checkEnumName(c);
                res += verif.checkEnumValues(c);
            }
            if(Modifier.isAbstract(c.getModifiers()) && !c.isInterface())
            {
                res += verif.checkAbstractClass(c);
                res += verif.checkAbstractMethodeExist(c);
            }
            for (Field f : c.getDeclaredFields())
                res += verif.checkFieldName(f);
            for (Method m : c.getDeclaredMethods())
            {
                res += verif.checkMethodName(m);
                res += verif.checkMethodeException(m);
            }
            res += verif.checkProtectedPrivateClass(c);
        }
        System.out.println(res);
        System.out.println("### Resultat est enregister dans le fichier 'result.txt' ###");
        saveData("result.txt", res);
    }
}
