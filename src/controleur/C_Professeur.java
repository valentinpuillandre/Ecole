package controleur;

import java.util.ArrayList;

public class C_Professeur {

	public void ajouterProfesseur ()
	{
		//on appelle la vue pour saisir un Professeur
		Professeur unProfesseur = VueProfesseur.saisirProfesseur();
		
		//on appelle le mod�le pour ins�rer le Professeur
		Modele.insertProfesseur(unProfesseur);
	}
	public void listerProfesseurs ()
	{
		//on appelle le Modele pour r�cup�rer la liste des Professeurs 
		
		ArrayList<Professeur> lesTechniciens = Modele.selectAllProfesseurs();
		//on appelle la vue pour afficher les Professeur
		for(Professeur unProfesseur : lesProfesseurs)
		{
			VueProfesseur.afficher(unProfesseur);
		}
	}
	
	public void retirerProfesseur ()
	{
		//on appelle la vue pour avoir un id Professeur � retirer 
		int idprofesseur = VueProfesseur.saisirIdProfesseur();
		// on appelle le modele pour supprimer de la BDD le Professeur identifi� par id 
		Modele.deleteProfesseur(idprofesseur);
	}
	public void modifierProfesseur ()
	{
		//on appelle la vue pour avoir un id Professeur � modifier 
		int idprofesseur = VueProfesseur.saisirIdProfesseur();
		// on appelle le modele pour r�cup�rer le Professeur � modifier
		Professeur unProfesseur  = Modele.selectWhereProfesseur(idprofesseur);
		
		if(unProfesseur != null) {
		//on demande les infos � modifier du professeur � partir de la vue 
		unProfesseur = VueProfesseur.modifierProfesseur(unProfesseur);
		// on r�alise la modif en appelant le mod�le
		Modele.updateProfesseur(unProfesseur);
		}
	}
	public void menuProfesseur ()
	{
		int choix = 0; 
		do{
			System.out.println("________Menu Professeur__________");
			System.out.println("1- Ajouter un Professeur");
			System.out.println("2- Lister les Professeur");
			System.out.println("3- Retirer un Professeur");
			System.out.println("4- Editer un Professeur");
			System.out.println("5- Les interventions du Professeur ");
			System.out.println("0- Quitter ");
			System.out.println("Votre choix ");
			choix = Console.saisirInt();
			switch(choix)
			{
			case 1 : this.ajouterProfesseur(); break;
			case 2 : this.listerProfesseurs(); break;
			case 3 : this.retirerProfesseur(); break;
			case 4 : this.modifierProfesseur();break;
			case 5 : break;
			case 6 : break;
			}
		}
		while (choix !=0);
			
	}
	
}
