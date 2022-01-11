package controleur;

public class Etudiant {

	private int idetudiant,idclasse;
	private String nom_etudiant,prenom_etudiant,adresse_etudiant,email_etudiant,tel_etudiant;
	public Etudiant (int idetudiant ,String nom_etudiant, String prenom_etudiant,String adresse_etudiant, String email_etudiant,String tel_etudiant, int idclasse ) 
	{
		this.idetudiant = idetudiant;
		this.nom_etudiant = nom_etudiant;
		this.prenom_etudiant = prenom_etudiant;
		this.adresse_etudiant = adresse_etudiant;
		this.email_etudiant = email_etudiant;
		this.tel_etudiant = tel_etudiant;
		this.idclasse = idclasse;
	}
	public int getIdetudiant() {
		return idetudiant;
	}
	public void setIdetudiant(int idetudiant) {
		this.idetudiant = idetudiant;
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
	public String getAdresse_etudiant() {
		return adresse_etudiant;
	}
	public void setAdresse_etudiant(String adresse_etudiant) {
		this.adresse_etudiant = adresse_etudiant;
	}
	public String getEmail_etudiant() {
		return email_etudiant;
	}
	public void setEmail_etudiant(String email_etudiant) {
		this.email_etudiant = email_etudiant;
	}
	public String getTel_etudiant() {
		return tel_etudiant;
	}
	public void setTel_etudiant(String tel_etudiant) {
		this.tel_etudiant = tel_etudiant;
	}
}
