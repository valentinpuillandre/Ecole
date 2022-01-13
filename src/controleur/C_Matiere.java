package controleur;

import java.util.ArrayList;

import modele.Modele;
import vue.Console;
import vue.VueMatiere;



public class C_Matiere {
	public void ajouterMatiere ()
	{
		//on appelle la vue pour saisir une matiere
		Matiere uneMatiere = VueMatiere.saisirMatiere();
		
		//on appelle le mod�le pour ins�rer la Matiere
		Modele.insertMatiere(uneMatiere);
	}
	
	public void listerMatieres ()
	{
		//on appelle le Modele pour r�cup�rer la liste des matieres 
		
		ArrayList<Matiere> lesMatieres = Modele.selectAllMatiere();
		//on appelle la vue pour afficher les matieres
		for(Matiere uneMatiere : lesMatieres)
		{
			VueMatiere.afficher(uneMatiere);
		}
	}
	public void retirerMatiere ()
	{
		//on appelle la vue pour avoir un id matiere � retirer 
		int idmatiere = VueMatiere.saisirIdMatiere();
		// on appelle le modele pour supprimer de la BDD la matiere identifi� par id 
		Modele.deleteMatiere(idmatiere);
	}
	
	public void modifierMatiere ()
	{
		//on appelle la vue pour avoir un id matiere � modifier 
		int idmatiere = VueMatiere.saisirIdMatiere();
		// on appelle le modele pour r�cup�rer la matiere � modifier
		Matiere uneMatiere  = Modele.selectWhereMatiere(idmatiere);
		
		if(uneMatiere != null) {
		//on demande les infos � modifier de la matiere � partir de la vue 
			uneMatiere = VueMatiere.modifierMatiere(uneMatiere);
		// on r�alise la modif en appelant le mod�le
		Modele.updateMatiere(uneMatiere);
		}
	}
	public void menuMatiere ()
	{
		int choix = 0; 
		do{
			System.out.println("________Menu Matiere__________");
			System.out.println("1- Ajouter un Matiere");
			System.out.println("2- Lister les Matieres");
			System.out.println("3- Retirer une Matiere");
			System.out.println("4- Editer une Matiere");
			System.out.println("0- Quitter ");
			System.out.println("Votre choix ");
			choix = Console.saisirInt();
			switch(choix)
			{
			case 1 : this.ajouterMatiere(); break;
			case 2 : this.listerMatieres(); break;
			case 3 : this.retirerMatiere(); break;
			case 4 : this.modifierMatiere(); break;
			case 5 : break;
			case 6 : break;
			}
		}
		while (choix !=0);
			
	}

}
