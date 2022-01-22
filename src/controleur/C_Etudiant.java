package controleur;

import java.util.ArrayList;

import modele.Modele;
import vue.Console;
import vue.VueClasse;
import vue.VueEtudiant;

public class C_Etudiant {
	
	private int idClasseChoisi = 0 ; 
	
	public boolean verifierId (int idClasse)
	{
		ArrayList<Classe> lesClasses = Modele.selectAllClasse();
		for(Classe uneClasse : lesClasses)
		{
			if (uneClasse.getIdclasse() == idClasse)
		{
		return true;
		}
		}
		return false;
		}
	public void saisirIdClasse()
		{
		ArrayList<Classe> lesClasses = Modele.selectAllClasse();
		do {
		String chaine = "________LISTE DES CLASSES________ \n\n";
		for(Classe uneClasse : lesClasses)
			{
			chaine+= uneClasse.getIdclasse()+" : "+uneClasse.getIdclasse()+" "+uneClasse.getNiveau()+";\n";
			}
		chaine += "\n_________FIN DES CLASSES________\n";
		System.out.println(chaine);
		this.idClasseChoisi = VueClasse.saisirIdClasse();
		}while (! verifierId(this.idClasseChoisi ));
		Classe uneClasse = Modele.selectWhereClasse(this.idClasseChoisi);
		if(uneClasse == null)
		{
			System.out.println("Aucune classe avec cet ID");
			this.idClasseChoisi = 0;
		}
		else
		{
			System.out.println("Vous allez gérer les étudiants d'une classe :");
			VueClasse.afficher(uneClasse);
		}
	}
	
	public void ajouterEtudiant ()
	{
		this.saisirIdClasse();
		if(this.idClasseChoisi !=0)
		{
		//on appelle la vue pour saisir un Etudiant
		Etudiant unEtudiant = VueEtudiant.saisirEtudiant();
		//on appelle le modèle pour insérer le Etudiant
		Modele.insertEtudiant(unEtudiant);
		}
	}
	
	public void listerEtudiants ()
	{
		//on appelle le Modele pour récupérer la liste des Etudiants 
		
		ArrayList<Etudiant> lesEtudiants = Modele.selectAllEtudiants();
		//on appelle la vue pour afficher les etudiants
		for(Etudiant unEtudiant : lesEtudiants)
		{
			VueEtudiant.afficher(unEtudiant);
		}
	}
	public void retirerEtudiant ()
	{
		//on appelle la vue pour avoir un id étudiant à retirer 
		int idetudiant = VueEtudiant.saisirIdEtudiant();
		// on appelle le modele pour supprimer de la BDD l'étudiant identifié par id 
		Modele.deleteEtudiant(idetudiant);
	}
	
	public void modifierEtudiant ()
	{
		//on appelle la vue pour avoir un id etudiant à modifier 
		int idetudiant = VueEtudiant.saisirIdEtudiant();
		// on appelle le modele pour récupérer l'étudiant à modifier
		Etudiant unEtudiant  = Modele.selectWhereEtudiants(idetudiant);
		
		if(unEtudiant != null) {
		//on demande les infos à modifier de l'étudiant à partir de la vue 
			unEtudiant = VueEtudiant.modifierEtudiant(unEtudiant);
		// on réalise la modif en appelant le modèle
		Modele.updateEtudiant(unEtudiant);
		}
	}
	public void menuEtudiant ()
	{
		int choix = 0; 
		do{
			System.out.println("________Menu Etudiant__________");
			System.out.println("1- Ajouter un Etudiant");
			System.out.println("2- Lister les Etudiants");
			System.out.println("3- Retirer un Etudiant");
			System.out.println("4- Editer un Etudiant");
			System.out.println("5- Les camarades de l'Etudiant ");
			System.out.println("0- Quitter ");
			System.out.println("Votre choix ");
			choix = Console.saisirInt();
			switch(choix)
			{
			case 1 : this.ajouterEtudiant(); break;
			case 2 : this.listerEtudiants(); break;
			case 3 : this.retirerEtudiant(); break;
			case 4 : this.modifierEtudiant(); break;
			case 5 : break;
			case 6 : break;
			}
		}
		while (choix !=0);
			
	}
}
