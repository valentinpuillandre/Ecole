package vue;


import controleur.Professeur;

public class VueProfesseur {

	public static Professeur saisirProfesseur()
	{
		String nom_prof, prenom_prof, matiere_prof, email_prof, tel_prof;
		int  idmatiere ;
		System.out.println("Donner le nom du Professeur : ");
		nom_prof = Console.saisirString();
		System.out.println("Donner le prenom du Professeur : ");
		prenom_prof  = Console.saisirString();
		System.out.println("Donner la matiere du Professeur : ");
		matiere_prof  = Console.saisirString();
		System.out.println("Donner le email du Professeur : ");
		email_prof  = Console.saisirString();
		System.out.println("Donner le tel du Professeur : ");
		tel_prof  = Console.saisirString();
		System.out.println("Donner l'id de la matiere du Professeur : ");
		idmatiere  = Console.saisirInt();
		Professeur unProfesseur = new Professeur(0,nom_prof,prenom_prof,matiere_prof,email_prof,tel_prof,idmatiere );
		return unProfesseur;
		
	}
	
	public static void afficher(Professeur unProfesseur)
	{
		System.out.println("________________INFO DU Professeur __________________");
		System.out.println("ID Professeur     : " + unProfesseur.getIdprofesseur());
		System.out.println("NOM Professeur    : " + unProfesseur.getNom_prof());
		System.out.println("PRENOM Professeur : " + unProfesseur.getPrenom_prof());
		System.out.println("MATIERE Professeur: " + unProfesseur.getMatiere_prof());
		System.out.println("EMAIL Professeur  : " + unProfesseur.getEmail_prof());
		System.out.println("TEL Professeur    : " + unProfesseur.getTel_prof());
		System.out.println("ID de Matiere    : " + unProfesseur.getIdmatiere());
	}
	public static String toXml(Professeur unProfesseur)
	{
		String chaine = "<professeur>\n";
		chaine +="</nom_prof>\n" + unProfesseur.getNom_prof() + "</nom_prof>\n" ;
		chaine +="</prenom_prof>\n" + unProfesseur.getPrenom_prof() + "</prenom_prof>\n" ;
		chaine +="</matiere_prof>\n" + unProfesseur.getMatiere_prof() + "</matiere_etudiant>\n" ;
		chaine +="</email_prof>\n" + unProfesseur.getEmail_prof() + "</email_prof>\n" ;
		chaine +="</tel_prof>\n" + unProfesseur.getTel_prof() + "</tel_prof>\n" ;
		chaine +="</idmatiere>\n" + unProfesseur.getIdmatiere() + "</idmatiere>\n" ;
		chaine +="</professeur>\n";
		return chaine;
	}
	
	public static int saisirIdProfesseur ()
	{
		int id;
		System.out.println("Donner un id Professeur : ");
		id = Console.saisirInt();
		return id;
	}
	
	public static Professeur modifierProfesseur( Professeur unProfesseur)
	{
		System.out.println("Ancien nom prof  : " + unProfesseur.getNom_prof());
		System.out.println("Donner le nouveau nom du professeur : ");
		unProfesseur.setNom_prof(Console.saisirString());
		
		System.out.println("Ancien prénom professeur  : " + unProfesseur.getPrenom_prof());
		System.out.println("Donner le nouveau prénom du professeur : ");
		unProfesseur.setPrenom_prof(Console.saisirString());
		
		System.out.println("Ancienne matiere du professeur  : " + unProfesseur.getMatiere_prof());
		System.out.println("Donner la matiere du professeur : ");
		unProfesseur.setMatiere_prof(Console.saisirString());
		
		System.out.println("Ancien mail professeur  : " + unProfesseur.getEmail_prof());
		System.out.println("Donner la nouvelle adresse mail du professeur : ");
		unProfesseur.setEmail_prof(Console.saisirString());
		
		System.out.println("Ancien téléphone professeur  : " + unProfesseur.getTel_prof());
		System.out.println("Donner la nouvelle ligne téléphonique du professeur : ");
		unProfesseur.setTel_prof(Console.saisirString());
		
		System.out.println("Ancien ID de matiere du professeur : " + unProfesseur.getIdmatiere());
		System.out.println("Donner le nouvel ID de la matiere du professeur : ");
		unProfesseur.setIdmatiere(Console.saisirInt());
		
		return unProfesseur;
		
	}
}
