package controleur;

public class Professeur {
	
	private int idprofesseur ,idmatiere ;
	private String nom_prof ,prenom_prof ,matiere_prof ,email_prof ,tel_prof ;
	public Professeur (int idprofesseur ,String nom_prof, String prenom_prof,String matiere_prof, String email_prof,String tel_prof, int idmatiere ) 
	{
		this.idprofesseur  = idprofesseur ;
		this.nom_prof  = nom_prof;
		this.prenom_prof  = prenom_prof;
		this.matiere_prof  = matiere_prof;
		this.email_prof  = email_prof;
		this.tel_prof  = tel_prof;
		this.idmatiere  = idmatiere;
	}
	public int getIdprofesseur() {
		return idprofesseur;
	}
	public void setIdprofesseur(int idprofesseur) {
		this.idprofesseur = idprofesseur;
	}
	public int getIdmatiere() {
		return idmatiere;
	}
	public void setIdmatiere(int idmatiere) {
		this.idmatiere = idmatiere;
	}
	public String getNom_prof() {
		return nom_prof;
	}
	public void setNom_prof(String nom_prof) {
		this.nom_prof = nom_prof;
	}
	public String getPrenom_prof() {
		return prenom_prof;
	}
	public void setPrenom_prof(String prenom_prof) {
		this.prenom_prof = prenom_prof;
	}
	public String getMatiere_prof() {
		return matiere_prof;
	}
	public void setMatiere_prof(String matiere_prof) {
		this.matiere_prof = matiere_prof;
	}
	public String getEmail_prof() {
		return email_prof;
	}
	public void setEmail_prof(String email_prof) {
		this.email_prof = email_prof;
	}
	public String getTel_prof() {
		return tel_prof;
	}
	public void setTel_prof(String tel_prof) {
		this.tel_prof = tel_prof;
	}
}
