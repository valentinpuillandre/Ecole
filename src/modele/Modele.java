package modele;

import java.sql.ResultSet;
import java.util.ArrayList;

import controleur.Etudiant;
import controleur.Professeur;


public class Modele {

	private static Bdd uneBdd = new Bdd("localhost","ecole","root","");
	/***************************** gestion des etudiants *******************/
	
	//********************** Ins�rer un �tudiant ***************************
	public static void insertEtudiant(Etudiant unEtudiant)
	{
		String requete = "insert into etudiant values(null,'" + unEtudiant.getNom_etudiant() + "','" +unEtudiant.getPrenom_etudiant()
		+"','"+unEtudiant.getAdresse_etudiant() + "','"+ unEtudiant.getEmail_etudiant() + "','" + unEtudiant.getTel_etudiant()+"','" 
				+unEtudiant.getIdclasse()+"');";
		
		try {
			uneBdd.seConnecter();
			Statement unStat = uneBdd.getMaConnexion().createStatement();//curseur 
			unStat.execute(requete);
			unStat.close();
			uneBdd.seDeconnecter();

		}
		catch(SQLException exp)
		{
			System.out.println("Erreur execution requete : " + requete);
		}
	}
	//******************Afficher les �tudiants *************************
	
	public static ArrayList<Etudiant> selectAllEtudiants ()
	{
		ArrayList<Etudiant> lesEtudiants = new ArrayList<Etudiant>();
		String requete = "select * from etudiant ; ";
		try {
			uneBdd.seConnecter();
			Statement unStat = uneBdd.getMaConnexion().createStatement();//curseur 
			ResultSet desResultats = unStat.executeQuery(requete); //fetchAll de PHP
			//parcours des r�sultats ppur construire des instances de clients
			while (desResultats.next())
			{
				Etudiant unEtudiant = new Etudiant(
			desResultats.getInt("idetudiant"), desResultats.getString("nom_etudiant"), 
			desResultats.getString("prenom_etudiant"), desResultats.getString("adresse_etudiant"), 
			desResultats.getString("email_etudiant"), desResultats.getString("tel_etudiant"),
			desResultats.getInt("idclasse")
						);
				lesEtudiants.add(unEtudiant);
			}
			unStat.close();
			uneBdd.seDeconnecter();

		}
		catch(SQLException exp)
		{
			System.out.println("Erreur execution requete : " + requete);
		}
		return lesEtudiants;
	}
	
	public static Etudiant selectWhereEtudiants ( int idetudiant)
	{
		
		Etudiant unEtudiant = null;
		String requete = "select * from client where idetudiant = " + idetudiant + " ; ";
		try {
			uneBdd.seConnecter();
			Statement unStat = uneBdd.getMaConnexion().createStatement();//curseur 
			ResultSet unResultat = unStat.executeQuery(requete); //fetchAll de PHP
			//extraire un r�sultat et construire une seule instanc client
			if (unResultat.next())
			{
				unEtudiant = new Etudiant(
			unResultat.getInt("idetudiant"), unResultat.getString("nom_etudiant"), 
			unResultat.getString("prenom_etudiant"), unResultat.getString("adresse_etudiant"), 
			unResultat.getString("email_etudiant"), unResultat.getString("tel_etudiant"),unResultat.getInt("idclasse")
						);
			}
			unStat.close();
			uneBdd.seDeconnecter();

		}
		catch(SQLException exp)
		{
			System.out.println("Erreur execution requete : " + requete);
		}
		return unEtudiant;
	}
	
	// *******************supprimer un Etudiant *************************
	public static void deleteEtudiant(int  idetudiant)
	{
		String requete = "delete from etudiant where idetudiant = " + idetudiant + ";";
		
		try {
			uneBdd.seConnecter();
			Statement unStat = uneBdd.getMaConnexion().createStatement();//curseur 
			unStat.execute(requete);
			unStat.close();
			uneBdd.seDeconnecter();

		}
		catch(SQLException exp)
		{
			System.out.println("Erreur execution requete : " + requete);
		}
	}
	 
	public static void updateEtudiant(Etudiant unEtudiant)
	{
	String requete = "update etudiant set nom_etudiant  = '" + unEtudiant.getNom_etudiant() + "', prenom_etudiant = '" +unEtudiant.getPrenom_etudiant()
	+"',adresse_etudiant = '"+unEtudiant.getAdresse_etudiant() + "',email_etudiant = '"+ unEtudiant.getEmail_etudiant() + "',tel_etudiant = '"
	+ unEtudiant.getTel_etudiant()+"',idclasse ='"+unEtudiant.getIdclasse()+"' where idetudiant = " + unEtudiant.getIdetudiant() + ";";
		
		try {
			uneBdd.seConnecter(); 
			Statement unStat = uneBdd.getMaConnexion().createStatement();//curseur 
			unStat.execute(requete);
			unStat.close();
			uneBdd.seDeconnecter();

		}
		catch(SQLException exp)
		{
			System.out.println("Erreur execution requete : " + requete);
		}
	}
	/*****************************11/01/2022**********************************/
	/***************************** gestion des professeur *******************/
	
	//********************** Ins�rer un professeur ***************************
	public static void insertProfesseur(Professeur unProfesseur)
	{
		String requete = "insert into professeur values(null,'" + unProfesseur.getNom_prof()+ "','" +unProfesseur.getPrenom_prof()
		+"','"+unProfesseur.getMatiere_prof()+ "','"+ unProfesseur.getEmail_prof()+ "','" + unProfesseur.getTel_prof()
		+ "','" + unProfesseur.getIdmatiere()+"');";
		
		try {
			uneBdd.seConnecter();
			Statement unStat = uneBdd.getMaConnexion().createStatement();//curseur 
			unStat.execute(requete);
			unStat.close();
			uneBdd.seDeconnecter();

		}
		catch(SQLException exp)
		{
			System.out.println("Erreur execution requete : " + requete);
		}
	}
	
	//******************Afficher les professeur *************************
	
	public static ArrayList<Professeur> selectAllProfesseur()
	{
		ArrayList<Professeur> lesProfesseurs = new ArrayList<Professeur>();
		String requete = "select * from professeur ; ";
		try {
			uneBdd.seConnecter();
			Statement unStat = uneBdd.getMaConnexion().createStatement();//curseur 
			ResultSet desResultats = unStat.executeQuery(requete); //fetchAll de PHP
			//parcours des r�sultats ppur construire des instances de Professeur
			while (desResultats.next())
			{
				Professeur unProfesseur = new Professeur(
						desResultats.getInt("idprofesseur"), desResultats.getString("nom_prof"), 
						desResultats.getString("prenom_prof"), desResultats.getString("matiere_prof"), 
						desResultats.getString("email_prof"), desResultats.getString("tel_prof"),
						desResultats.getInt("idmatiere")
						);
					lesProfesseurs.add(unProfesseur);
			}
			unStat.close();
			uneBdd.seDeconnecter();

		}
		catch(SQLException exp)
		{
			System.out.println("Erreur execution requete : " + requete);
		}
		return lesProfesseurs;
	}
	
	// *******************supprimer un Professeur *************************
	
	public static void deleteProfesseur (int  idprofesseur)
	{
		String requete = "delete from client where idprofesseur = " + idprofesseur + ";";
		
		try {
			uneBdd.seConnecter();
			Statement unStat = uneBdd.getMaConnexion().createStatement();//curseur 
			unStat.execute(requete);
			unStat.close();
			uneBdd.seDeconnecter();

		}
		catch(SQLException exp)
		{
			System.out.println("Erreur execution requete : " + requete);
		}
	}
	
	public static Professeur selectWhereProfesseur ( int idprofesseur)
	{
		
		Professeur unProfesseur = null;
		String requete = "select * from professeur where idprofesseur = " + idprofesseur + " ; ";
		try {
			uneBdd.seConnecter();
			Statement unStat = uneBdd.getMaConnexion().createStatement();//curseur 
			ResultSet unResultat = unStat.executeQuery(requete); //fetchAll de PHP
			//extraire un r�sultat et construire une seule instance professeur
			if (unResultat.next())
			{
				unProfesseur = new Professeur(
						unResultat.getInt("idprofesseur"), unResultat.getString("nom_prof"), 
						unResultat.getString("prenom_prof"), unResultat.getString("matiere_prof"), 
						unResultat.getString("email_prof"), unResultat.getString("tel_prof"),
						unResultat.getInt("idmatiere")
				);		
			}
			unStat.close();
			uneBdd.seDeconnecter();

		}
		catch(SQLException exp)
		{
			System.out.println("Erreur execution requete : " + requete);
		}
		return unProfesseur;
	}
	
	public static void updateProfesseur(Professeur unProfesseur)
	{
		String requete = "update professeur set nom_prof  = '" + unProfesseur.getNom_prof() + "', prenom_prof = '" +unProfesseur.getPrenom_prof()
		+"',adresse_etudiant = '"+unProfesseur.getMatiere_prof() + "',email_prof = '"+ unProfesseur.getEmail_prof() + "',tel_prof = '"
		+ unProfesseur.getTel_prof()+"',idmatiere ='"+unProfesseur.getIdmatiere()+"' where idprofesseur = " + unProfesseur.getIdprofesseur() + ";";
		
		try {
			uneBdd.seConnecter();
			Statement unStat = uneBdd.getMaConnexion().createStatement();//curseur 
			unStat.execute(requete);
			unStat.close();
			uneBdd.seDeconnecter();

		}
		catch(SQLException exp)
		{
			System.out.println("Erreur execution requete : " + requete);
		}
	}
}
