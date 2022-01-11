package controleur;

public class Donner_cours {

	private int idclasse, idprofesseur ;
	
	public Donner_cours (int idclasse  , int idprofesseur ) 
	{
		this.idclasse  = idclasse ;
		this.idprofesseur = idprofesseur;
		
	}

	public int getIdclasse() {
		return idclasse;
	}

	public void setIdclasse(int idclasse) {
		this.idclasse = idclasse;
	}

	public int getIdprofesseur() {
		return idprofesseur;
	}

	public void setIdprofesseur(int idprofesseur) {
		this.idprofesseur = idprofesseur;
	}
}
