package tableaux;

import java.util.Scanner;

public class Exo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nbValeur=0;
		int note=0;
		boolean croissant = true; //Variable booelan pour vérifier si le tableau est croissant
        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;
		//On vient ouvrir le scanner pour la saisie de l'utilisateur
		Scanner sc = new Scanner(System.in);
		System.out.println("Debut du programme de l'exo 4 ! \r\n");
		System.out.println("Veuillez saisir la grandeur de votre tableau svp ");
		nbValeur = sc.nextInt(); //La valeur de la grandeur saisie par l'utilisateur est affecté a la variable
		int tableau [] = new int[nbValeur];
		//On vient saisir les valeurs à insérer dans notre tableau
		for (int i=0; i<nbValeur; i++) {
			System.out.println("Veuillez saisir une valeur à insérer dans votre tableau svp ");
			note = sc.nextInt();
			tableau[i]=note;
		}
		//On vient parcourir notre tableau en affichant les valeurs contenues
		System.out.println("\r\nVoici les valeurs saisies : ");
		for (int i=0; i<tableau.length; i++) {
			System.out.print(tableau[i]+" : ");
		}
		
		//On vient parcourir le tableau en comparant ses valeurs
		for (int i=0; i<(tableau.length)-1; i++) {
			if (tableau[i] > tableau[i+1])
					croissant = false; //si une valeur d'un rang infèrieur est plus grande que la valeur du rang suivant on est dans un tableau non croissant
		}
		//On vient vérifier si on est croissant puis on l'affiche
		if (croissant == true)
			System.out.println("\r\nl'ordre est croissant");
		else
			System.out.println("\r\nl'ordre n'est pas croissant");
		//On cherche la plus grande valeur du tableau
		for (int i=0; i<tableau.length; i++) {
			if ((tableau[i] > maximum))
				maximum = tableau[i];
		}
		System.out.println("Voici le plus grand élément du tableau :\r\n"+maximum);
		//On cherche la plus petite valeur du tableau
		for (int i=0; i<tableau.length; i++) {
			if ((tableau[i] < minimum))
				minimum = tableau[i];
		}
		System.out.println("Voici le plus grand élément du tableau :\r\n"+minimum);
		//Fermeture du scanner	
		sc.close();
		System.out.println("Fin du programme de l'exo 4 ! ");
	}

}
