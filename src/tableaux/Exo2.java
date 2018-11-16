package tableaux;
import java.util.Scanner;

public class Exo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int MIN = 0; //Valaur minimum du tableau
		int MAX = 20;//Valeur maximum du tableau
		int RANGE = MAX - MIN;
		int tableau [] = new int[10];
		int somme = 0;
		float moyenne = 0.0f;
		//Scanner sc = new Scanner(System.in);
		
		System.out.println("Debut du programme de l'exo 2 ! \r\nNous allons maintenant saisir 10 valeurs : ");
		//On vient remplir notre tableau aléatoirement (mais on peut le modifier pour que ce soit l'utilisateur qui vient saisir les valeurs)
		for (int i=0; i<10; i++) {
			//System.out.println("Veuillez saisir une note svp ");
			//note = sc.nextInt();
			//tableau[i]=note;
			//on remplit notre tableau 
			tableau[i]= (int)((Math.random() *RANGE)- (MIN));
		}
		System.out.println("Voici les notes saisies : ");
		//On parcourt notre tableau pour afficher les valeurs contenues
		for (int i=0; i<10; i++) {
			System.out.print(tableau[i]+"; ");
		}
		System.out.println("");
		//On parcourt notre tableau en additionnant les valeurs contenues
		for (int i=0; i<tableau.length; i++) {
			somme = somme + tableau[i];
		}
		System.out.println("La somme des nombres contenus dans le tableau est : "+somme);
		//On calcul la moyenne des valeurs contenues dans le tableau
		moyenne = (float) somme / (tableau.length);
		System.out.println("La moyenne des nombres contenus dans le tableau est : "+moyenne);
		//Fermeture du scanner
		//sc.close();
		System.out.println("Fin du programme de l'exo 2 ! \r\n");
	}

}
