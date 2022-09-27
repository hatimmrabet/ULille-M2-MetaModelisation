package linter.classes;

import linter.classes.exception.NoBreaksException;

public class Vehicule {

	public final String marque = "Peugeot";
	public final String MODELE = "308";
	public final String Mode = "SUV";
	public int Capacite = 5;
	public int vitesseMax = 180;

	public void accelerer()
	{
		System.out.println("la voirure accelere");
	}

	public void Freiner()
	{
		System.out.println("la voiture freine");
	}

	public void demarrer() throws Exception
	{
		System.out.println("la voiture demarre");
	}

	public void arreter() throws NoBreaksException
	{
		System.out.println("la voiture s'arrete");
	}
}
