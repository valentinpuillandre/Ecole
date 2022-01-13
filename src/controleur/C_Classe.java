package controleur;

import java.util.ArrayList;

import modele.Modele;
import vue.Console;
import vue.VueClasse;

public class C_Classe {
	public void ajouterClasse ()
	{
		//on appelle la vue pour saisir une classe
		Classe uneClasse = VueClasse.saisirClasse();
		
		//on appelle le mod�le pour ins�rer la Matiere
		Modele.insertClasse(uneClasse);
	}
	
	public void listerClasses ()
	{
		//on appelle le Modele pour r�cup�rer la liste des classes 
		
		ArrayList<Classe> lesClasses = Modele.selectAllClasse();
		//on appelle la vue pour afficher les classes
		for(Classe uneClasse: lesClasses)
		{
			VueClasse.afficher(uneClasse);
		}
	}
	public void retirerClasse ()
	{
		//on appelle la vue pour avoir un id classe � retirer 
		int idclasse = VueClasse.saisirIdClasse();
		// on appelle le modele pour supprimer de la BDD la classe identifi� par id 
		Modele.deleteClasse(idclasse);
	}
	
	public void modifierClasse ()
	{
		//on appelle la vue pour avoir un id classe � modifier 
		int idclasse = VueClasse.saisirIdClasse();
		// on appelle le modele pour r�cup�rer la classe � modifier
		Classe uneClasse  = Modele.selectWhereClasse(idclasse);
		
		if(uneClasse != null) {
		//on demande les infos � modifier de la classe � partir de la vue 
			uneClasse = VueClasse.modifierClasse(uneClasse);
		// on r�alise la modif en appelant le mod�le
		Modele.updateClasse(uneClasse);
		}
	}
	public void menuClasse ()
	{
		int choix = 0; 
		do{
			System.out.println("________Menu Classe__________");
			System.out.println("1- Ajouter une Classe");
			System.out.println("2- Lister les Classes");
			System.out.println("3- Retirer une Classe");
			System.out.println("4- Editer une Classe");
			System.out.println("0- Quitter ");
			System.out.println("Votre choix ");
			choix = Console.saisirInt();
			switch(choix)
			{
			case 1 : this.ajouterClasse(); break;
			case 2 : this.listerClasses(); break;
			case 3 : this.retirerClasse(); break;
			case 4 : this.modifierClasse(); break;
			case 5 : break;
			case 6 : break;
			}
		}
		while (choix !=0);
			
	}

}
