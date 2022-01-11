package controleur;

public class Classe {
	
	private int idclasse;
	private String niveau;
	public Classe (int idclasse ,String niveau) 
	{
		this.idclasse  = idclasse ;
		this.niveau = niveau;
		
	}
	public int getIdclasse() {
		return idclasse;
	}
	public void setIdclasse(int idclasse) {
		this.idclasse = idclasse;
	}
	public String getNiveau() {
		return niveau;
	}
	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}
}
