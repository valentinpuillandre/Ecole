package vue;

import controleur.Matiere;

public class VueMatiere {
	
	public static Matiere saisirMatiere()
	{
		String nom_matiere;
		
		System.out.println("Donner le nom de la matiere : ");
		nom_matiere = Console.saisirString();
	
		Matiere uneMatiere = new Matiere(0,nom_matiere);
		return uneMatiere;
		
	}
	
	public static void afficher(Matiere uneMatiere)
	{
		System.out.println("________________INFO MATIERE __________________");
		System.out.println("ID matiere     : " + uneMatiere.getIdmatiere());
		System.out.println("NOM matiere    : " + uneMatiere.getNom_matiere());
	}
	public static String toXml(Matiere uneMatiere)
	{
		String chaine = "<matiere>\n";
		chaine +="</nom_matiere>\n" + uneMatiere.getNom_matiere() + "</nom_matiere>\n" ;
		chaine +="</matiere>\n";
		return chaine;
	}
	
	public static int saisirIdMatiere ()
	{
		int id;
		System.out.println("Donner un id Matiere : ");
		id = Console.saisirInt();
		return id;
	}
	
	public static Matiere modifierMatiere(Matiere uneMatiere)
	{
		System.out.println("Ancien nom matiere  : " + uneMatiere.getNom_matiere());
		System.out.println("Donner le nouveau nom de la matiere : ");
		uneMatiere.setNom_matiere(Console.saisirString());
		
		
		return uneMatiere;
		
	}

}
