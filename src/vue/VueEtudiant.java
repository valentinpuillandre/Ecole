package vue;


import controleur.Etudiant;

public class VueEtudiant {

	public static Etudiant saisirEtudiant()
	{
		String nom_etudiant, prenom_etudiant, adresse_etudiant, email_etudiant, tel_etudiant ;
		int  idclasse;
		System.out.println("Donner le nom de l'Etudiant : ");
		nom_etudiant = Console.saisirString();
		System.out.println("Donner le prenom de l'Etudiant : ");
		prenom_etudiant = Console.saisirString();
		System.out.println("Donner le adresse de l'Etudiant : ");
		adresse_etudiant = Console.saisirString();
		System.out.println("Donner le email de l'Etudiant : ");
		email_etudiant = Console.saisirString();
		System.out.println("Donner le tel de l'Etudiant : ");
		tel_etudiant = Console.saisirString();
		System.out.println("Donner l'id de la classe de l'Etudiant : ");
		idclasse = Console.saisirInt();
		Etudiant unEtudiant = new Etudiant(0,nom_etudiant,prenom_etudiant,adresse_etudiant,email_etudiant,tel_etudiant,idclasse );
		return unEtudiant;
		
	}
	
	public static void afficher(Etudiant unEtudiant)
	{
		System.out.println("________________INFO DU CLIENT __________________");
		System.out.println("ID etudiant     : " + unEtudiant.getIdetudiant());
		System.out.println("NOM etudiant    : " + unEtudiant.getNom_etudiant());
		System.out.println("PRENOM etudiant : " + unEtudiant.getPrenom_etudiant());
		System.out.println("ADRESSE etudiant: " + unEtudiant.getAdresse_etudiant());
		System.out.println("EMAIL etudiant  : " + unEtudiant.getEmail_etudiant());
		System.out.println("TEL etudiant    : " + unEtudiant.getTel_etudiant());
		System.out.println("ID de classe    : " + unEtudiant.getIdclasse());
	}
	public static String toXml(Etudiant unEtudiant)
	{
		String chaine = "<etudiant>\n";
		chaine +="</nom_etudiant>\n" + unEtudiant.getNom_etudiant() + "</nom_etudiant>\n" ;
		chaine +="</prenom_etudiant>\n" + unEtudiant.getPrenom_etudiant() + "</prenom_etudiant>\n" ;
		chaine +="</adresse_etudiant>\n" + unEtudiant.getAdresse_etudiant() + "</adresse_etudiant>\n" ;
		chaine +="</email_etudiant>\n" + unEtudiant.getEmail_etudiant() + "</email_etudiant>\n" ;
		chaine +="</tel_etudiant>\n" + unEtudiant.getTel_etudiant() + "</tel_etudiant>\n" ;
		chaine +="</idclasse>\n" + unEtudiant.getIdclasse() + "</idclasse>\n" ;
		chaine +="</etudiant>\n";
		return chaine;
	}
	
	public static int saisirIdEtudiant ()
	{
		int id;
		System.out.println("Donner un id Etudiant : ");
		id = Console.saisirInt();
		return id;
	}
	
	public static Etudiant modifierEtudiant( Etudiant unEtudiant)
	{
		System.out.println("Ancien nom etudiant  : " + unEtudiant.getNom_etudiant());
		System.out.println("Donner le nouveau nom de l'etudiant : ");
		unEtudiant.setNom_etudiant(Console.saisirString());
		
		System.out.println("Ancien prénom etudiant  : " + unEtudiant.getPrenom_etudiant());
		System.out.println("Donner le nouveau prénom de l'etudiant : ");
		unEtudiant.setPrenom_etudiant(Console.saisirString());
		
		System.out.println("Ancienne adresse etudiante  : " + unEtudiant.getAdresse_etudiant());
		System.out.println("Donner la nouvelle adresse de l'etudiant : ");
		unEtudiant.setAdresse_etudiant(Console.saisirString());
		
		System.out.println("Ancien mail etudiant  : " + unEtudiant.getEmail_etudiant());
		System.out.println("Donner la nouvelle adresse mail etudiante : ");
		unEtudiant.setEmail_etudiant(Console.saisirString());
		
		System.out.println("Ancien téléphone etudiant  : " + unEtudiant.getTel_etudiant());
		System.out.println("Donner la nouvelle ligne téléphonique de l'etudiant : ");
		unEtudiant.setTel_etudiant(Console.saisirString());
		
		System.out.println("Ancienne classe de l'etudiant : " + unEtudiant.getIdclasse());
		System.out.println("Donner la nouvelle classe de l'etudiant : ");
		unEtudiant.setIdclasse(Console.saisirInt());
		
		return unEtudiant;
		
	}
}
