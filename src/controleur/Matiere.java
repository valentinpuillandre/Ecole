package controleur;

public class Matiere {

	private int idmatiere;
	private String nom_matiere;
	public Matiere (int idmatiere ,String nom_matiere) 
	{
		this.idmatiere  = idmatiere ;
		this.nom_matiere = nom_matiere;
		
	}
	public int getIdmatiere() {
		return idmatiere;
	}
	public void setIdmatiere(int idmatiere) {
		this.idmatiere = idmatiere;
	}
	public String getNom_matiere() {
		return nom_matiere;
	}
	public void setNom_matiere(String nom_matiere) {
		this.nom_matiere = nom_matiere;
	}
}
