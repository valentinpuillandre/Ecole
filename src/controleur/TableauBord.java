package controleur;

public class TableauBord {

	private int idclasse;
	private String nom_etudiant, prenom_etudiant, niveau;
	
	public TableauBord(int idclasse ,String nom_etudiant, String prenom_etudiant, String niveau) {
		
		this.idclasse = idclasse;
		this.nom_etudiant = nom_etudiant;
		this.prenom_etudiant = prenom_etudiant;
		this.niveau = niveau;
		
	}

	public int getIdclasse() {
		return idclasse;
	}

	public void setIdclasse(int idclasse) {
		this.idclasse = idclasse;
	}

	public String getNom_etudiant() {
		return nom_etudiant;
	}

	public void setNom_etudiant(String nom_etudiant) {
		this.nom_etudiant = nom_etudiant;
	}

	public String getPrenom_etudiant() {
		return prenom_etudiant;
	}

	public void setPrenom_etudiant(String prenom_etudiant) {
		this.prenom_etudiant = prenom_etudiant;
	}

	public String getNiveau() {
		return niveau;
	}

	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}
}
