package tableaux;
import java.util.Scanner;

public class Exo9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nbValeur = 0; //Variable pour mémoriser le nombre de valeur à saisir par l'utilsateur
		int note = 0; //Variable pour mémoriser la valeur saisie par l'utilisateur
		int indice = 0; //Variable pour mémoriser la position de la valeur souhaitée
		int maximum = Integer.MIN_VALUE; //Variable pour déterminer la valeur minimum de type "Int"
		Scanner sc = new Scanner(System.in);
		System.out.println("Début du programme de l'exo 9 !\r\n");
		System.out.println("Veuillez saisir le nombre de valeurs à saisir svp ");
		nbValeur = sc.nextInt();
		int tableau[]  = new int[nbValeur];
		//On vient remplir notre tableau avec les valeurs saisies par l'utilisateur
		for (int i=0; i<tableau.length; i++) {
			System.out.println("Veuillez saisir une valeur à insérer dans votre tableau svp ");
			note = sc.nextInt();
			tableau[i] = note;
		}
		//On vient parcourir notre tableau en affichant les valeurs contenues
		System.out.println("\r\nVoici les valeurs saisies : ");
		for (int i=0; i<tableau.length; i++) {
			System.out.print(tableau[i]+" : ");
		}
		//On vient chercher la valeur maximum en renvoyant ça position
		for (int j=0; j<tableau.length; j++) {
			if (tableau[j] > maximum) {
				maximum = tableau[j];
				indice = j+1;
			}
		}
		System.out.println("\r\nLa valeur la plus grande du tableau est : "+maximum+" \r\nLa position de la valeur la plus grande est : "+indice);
		//fermeture du scanner
		sc.close();
		System.out.println("Fin du programme de l'exo 9 ! ");
	}

}
