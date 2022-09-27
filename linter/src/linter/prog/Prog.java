package linter.prog;

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
import linter.verif.Testeur;

/**
 * Prog est la classe principale du projet
 * Dans le package classes, j'ai mis tous les classes avec lesquelles j'ai testés mes fonctions
 * Tous mes fonctions sont dans le package verif, class Verificateur
 * La Classe Testeur permet de lancer tous les tests, les affichers et les enregistrer dans un fichier
 * @author M'RABET EL KHOMSSI Hatim
 */
public class Prog {

	public static void main(String[] args) {
		Class<?>[] classes = { Vehicule.class, velo.class, IPersonne.class, Imaison.class, EStatus.class, Estatus2.class,
				status.class, AFile.class, afile1.class, ADocument.class, Enfant.class, DemoPrivateClass.class,
				NoBreaksException.class };
		Testeur testeur = new Testeur(classes);
		testeur.test();
	}

}
