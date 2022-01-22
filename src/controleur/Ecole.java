package controleur;


import java.util.ArrayList;

import modele.Modele;
import vue.Console; 

public class Ecole {



private C_Professeur unControleurProfesseur = new C_Professeur();
private C_Etudiant unControleurEtudiant = new C_Etudiant();
private C_Matiere unControleurMatiere = new C_Matiere();
private C_Classe unControleurClasse = new C_Classe();

public void stats ()
{
	int nbClasses = 0, nbEtudiants = 0, nbMatieres = 0, nbProfesseurs=0;
	
	//on appelle le mod�le pour r�cup�rer les nombres d'enregistrements par table
	
	nbClasses = Modele.count("classe");
	nbEtudiants  =Modele.count("etudiant");
	nbMatieres = Modele.count("matiere");
	nbProfesseurs = 	Modele.count("professeur");
	
	
	System.out.println("____________Statistiques de l'�cole_______________");
	System.out.println("Nombre de classes     : " + nbClasses);
	System.out.println("Nombre d'�tudiants    : " +nbEtudiants);
	System.out.println("Nombre de mati�res    : " + nbMatieres);
	System.out.println("Nombre de professeurs : " +nbProfesseurs);
	System.out.println("________________________________________");
	
	
}
public void tableauBord()
{
	/*
	d�roulement:
	1. Allez dans le controleur r�aliser une classe : tableauBord avec tous les champs
	qui existent dans la view (nomc,prenomc, nomt, prenomt, matricule, description, dateinter
	
	2. Allez dans le Modele et cr�er une m�thode : selectAllTableauBord ()
	
	3. Ici dans cette m�thode , r�cup�rer l'ArrayList<TableauBord> et affichez les r�sultats
	
	*/

		ArrayList<TableauBord> lesTableauBords = Modele.selectAllTableauBord();
		System.out.println("________________Tableau de bord __________________\n");
		for (TableauBord unTableauBord : lesTableauBords)
		{
			
			System.out.println("Nom de l'�tudiant     : " + unTableauBord.getNom_etudiant());
			System.out.println("Pr�nom de l'�tudiant  : " + unTableauBord.getPrenom_etudiant());
			System.out.println("Classe de l'�tudiant  : " + unTableauBord.getNiveau());
			System.out.println("___________________________________________________\n");
			
		}
	
}

public void menuGeneral ()
{
int choix = 0;
do{
System.out.println("________Menu General de l'Ecole__________");
System.out.println("1- G�rer les Professeurs");
System.out.println("2- G�rer les Etudiants");
System.out.println("3- G�rer les Classes");
System.out.println("4- G�rer les Matieres");
System.out.println("5- Statistiques ");
System.out.println("6- Tous les �l�ves ");
System.out.println("0- Quitter ");
System.out.println("Votre choix ");
choix = Console.saisirInt();
switch(choix)
{
case 1 : unControleurProfesseur.menuProfesseur(); break;
case 2 : unControleurEtudiant.menuEtudiant();break;
case 3 : unControleurClasse.menuClasse(); break;
case 4 : unControleurMatiere.menuMatiere(); break;
case 5 : stats();break;
case 6 : tableauBord ();break;
case 7 : break;
}
}
while (choix !=0);

}



public static void main(String[] args) {
Ecole iris = new Ecole ();
iris. menuGeneral ();
}



}
