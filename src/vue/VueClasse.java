package vue;

import controleur.Classe;

public class VueClasse {
	
	public static Classe saisirClasse()
	{
		String niveau;
		
		System.out.println("Donner le nom de la classe : ");
		niveau = Console.saisirString();
	
		Classe uneClasse = new Classe(0,niveau);
		return uneClasse;
		
	}
	
	public static void afficher(Classe uneClasse)
	{
		System.out.println("________________INFO CLASSE __________________");
		System.out.println("ID classe    : " + uneClasse.getIdclasse());
		System.out.println("NOM classe    : " + uneClasse.getNiveau());
	}
	public static String toXml(Classe uneClasse) {

		String chaine = "<classe>\n";
		chaine +="</niveau>\n" + uneClasse.getNiveau() + "</niveau>\n" ;
		chaine +="</classe>\n";
		return chaine;
	}
	
	public static int saisirIdClasse ()
	{
		int id;
		System.out.println("Donner un id Classe : ");
		id = Console.saisirInt();
		return id;
	}
	
	public static Classe modifierClasse(Classe uneClasse)
	{
		System.out.println("Ancien nom classe  : " + uneClasse.getNiveau());
		System.out.println("Donner le nouveau nom de la classe : ");
		uneClasse.setNiveau(Console.saisirString());
		
		
		return uneClasse;
		
	}

}
