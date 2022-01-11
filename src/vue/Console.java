package vue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Console {
private static BufferedReader entree = new BufferedReader(new InputStreamReader(System.in));
	
	public static int saisirInt()
	{
		int nb = 0;
		String chaine ="";
		boolean ok = false;
		do {
			
		
		try {
		chaine = entree.readLine();//lire une chaine
		nb = Integer.parseInt(chaine);//convertir la chaine en un entier
		ok = true ; //saisie correcte
		}
		catch(IOException exp){
			System.out.println("Erreur de lecture sur le clavier");
		}
		catch(NumberFormatException exp)
		{
			System.out.println("Le format de nombre n'est pas respecté");
		}}while(ok==false);
		return nb;
	}

public static float saisirFloat()
{
	float nb = 0;
	String chaine ="";
	boolean ok = false;
	do {
		
	
	try {
	chaine = entree.readLine();//lire une chaine
	nb = Float.parseFloat(chaine);//convertir la chaine en un entier
	ok = true ; //saisie correcte
	}
	catch(IOException exp){
		System.out.println("Erreur de lecture sur le clavier");
	}
	catch(NumberFormatException exp)
	{
		System.out.println("Le format de nombre n'est pas respecté");
	}}while(ok==false);
	return nb;
}
public static double saisirDouble()
{
	double nb = 0;
	String chaine ="";
	boolean ok = false;
	do {
		
	
	try {
	chaine = entree.readLine();//lire une chaine
	nb = Double.parseDouble(chaine);//convertir la chaine en un entier
	ok = true ; //saisie correcte
	}
	catch(IOException exp){
		System.out.println("Erreur de lecture sur le clavier");
	}
	catch(NumberFormatException exp)
	{
		System.out.println("Le format de nombre n'est pas respecté");
	}}while(ok==false);
	return nb;
}
public static String saisirString()
{
	String chaine ="";
	
	try {
	chaine = entree.readLine();//lire une chaine
	}
	catch(IOException exp){
		System.out.println("Erreur de lecture sur le clavier");
	}
	catch(NumberFormatException exp)
	{
		System.out.println("Le format de nombre n'est pas respecté");
	}
	return chaine;
}
public static char saisirChar()
{
	String chaine ="";
	
	try {
	chaine = entree.readLine();//lire une chaine
	}
	catch(IOException exp){
		System.out.println("Erreur de lecture sur le clavier");
	}
	catch(NumberFormatException exp)
	{
		System.out.println("Le format de nombre n'est pas respecté");
	}
	return chaine.charAt(0);
}
}
