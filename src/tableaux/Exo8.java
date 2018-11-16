package tableaux;

import java.util.Scanner;

public class Exo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nbValeur = 0;
		int note = 0;
		int multTrois = 0;
		int nMunltiTrois = 0;
		//On vient ouvrir le scanner pour la saisie de l'utilisateur
		Scanner sc = new Scanner(System.in);
		System.out.println("Debut du programme de l'exo 8 ! \r\n");
		System.out.println("Veuillez saisir la nombre de valeurs à saisir svp ");
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
			System.out.print(tableau[i]+" ");
		}
		//On vient parcourir notre tableau en affichant les valeurs multiple de 3 ou non
		for (int i=0; i<tableau.length; i++) {
			if (tableau[i] % 3 == 0 )
				multTrois++;
			else
				nMunltiTrois++;	
		}
		System.out.println("\r\nLe nombre de valeurs multiple de 3 : "+multTrois+" \r\nLe nombre de valeurs non multiple de 3 : "+nMunltiTrois);
		//Fermeture du scanner
		sc.close();
		System.out.println("Fin du programme de l'exo 8 ! ");
	}

}
