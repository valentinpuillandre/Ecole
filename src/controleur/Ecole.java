package controleur;


import vue.Console;

public class Ecole {



private C_Prof unControleurProf = new C_Prof();
private C_Etudiant unControleurEtudiant = new C_Etudiant();


public void menuGeneral ()
{
int choix = 0;
do{
System.out.println("________Menu General de l'Ecole__________");
System.out.println("1- Gérer les Professeurs");
System.out.println("2- Gérer les Etudiants");
System.out.println("3- Gérer les Classes");
System.out.println("4- Gérer les Matieres");
System.out.println("5- Statistiques ");
System.out.println("0- Quitter ");
System.out.println("Votre choix ");
choix = Console.saisirInt();
switch(choix)
{
case 1 : unControleurProf.menuProf(); break;
case 2 : unControleurEtudiant.menuEtudiant();break;
case 3 : break;
case 4 : break;
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
