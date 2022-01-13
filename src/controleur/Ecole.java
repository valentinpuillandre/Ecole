package controleur;


import vue.Console; 

public class Ecole {



private C_Professeur unControleurProfesseur = new C_Professeur();
private C_Etudiant unControleurEtudiant = new C_Etudiant();
private C_Matiere unControleurMatiere = new C_Matiere();
private C_Classe unControleurClasse = new C_Classe();



public void menuGeneral ()
{
int choix = 0;
do{
System.out.println("________Menu General de l'Ecole__________");
System.out.println("1- G�rer les Professeurs");
System.out.println("2- G�rer les Etudiants");
System.out.println("3- G�rer les Classes");
System.out.println("4- G�rer les Matieres");
System.out.println("5- Statistiques ");
System.out.println("0- Quitter ");
System.out.println("Votre choix ");
choix = Console.saisirInt();
switch(choix)
{
case 1 : unControleurProfesseur.menuProfesseur(); break;
case 2 : unControleurEtudiant.menuEtudiant();break;
case 3 : unControleurClasse.menuClasse(); break;
case 4 : unControleurMatiere.menuMatiere(); break;
case 5 : break;
case 6 : break;
}
}
while (choix !=0);

}



public static void main(String[] args) {
Ecole iris = new Ecole ();
iris. menuGeneral ();
}



}
