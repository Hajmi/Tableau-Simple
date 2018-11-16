package tableaux;

import java.util.Scanner;

public class Exo10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nbValeur = 0; //Variable pour mémoriser le nombre de valeur à saisir par l'utilsateur
		int note = 0; //Variable pour mémoriser la valeur saisie par l'utilisateur
		int indice = 0; //Variable pour mémoriser le nombre de valeurs au dessus de la moyenne

		int somme = 0;
		float moyenne = 0.0f;
		Scanner sc = new Scanner(System.in);
		System.out.println("Début du programme de l'exo 10 !\r\n");
		System.out.println("Veuillez saisir le nombre de notes à saisir svp ");
		nbValeur = sc.nextInt();
		int tableau[]  = new int[nbValeur];
		//On vient remplir notre tableau avec les valeurs saisies par l'utilisateur
		for (int i=0; i<tableau.length; i++) {
			System.out.println("Veuillez saisir une note à insérer dans votre tableau svp ");
			note = sc.nextInt();
			tableau[i] = note;
		}
		//On calcule la somme des notes du tableau
		for (int j=0; j<tableau.length; j++) {
			somme+=tableau[j];
		}
		//On calcule la moyenne des notes du tableau
		moyenne = (float)somme / tableau.length;
		//On renvoie le nombre de note au dessus de moyenne 
		for (int k=0; k<tableau.length; k++) {
			if (tableau[k] >moyenne)
				indice++;
		}
		System.out.println("La moyenne est : "+moyenne+" Le nombre de valeur au dessus de la moyenne est : "+indice);
		//Fermeture du scanner
		sc.close();
		System.out.println("Fin du programme de l'exo 10 ! ");
	}

}
