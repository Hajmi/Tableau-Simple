package tableaux;
import java.util.Scanner;

public class Exo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nbValeur=0;
		int note=0;
		int indice=0;
		//On vient ouvrir le scanner pour la saisie de l'utilisateur
		Scanner sc = new Scanner(System.in);
		System.out.println("Debut du programme de l'exo 3 ! \r\n");
		System.out.println("Veuillez saisir la grandeur de votre tableau svp ");
		nbValeur = sc.nextInt(); //La valeur de la grandeur saisie par l'utilisateur est affecté a la variable
		int tableau [] = new int[nbValeur];
		int tableauInverse[] = new int[nbValeur];
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
		//On vient crée un tableau dans lequel nous affectons toute les valeurs du tableau précédent mais dans l'ordre inverse
		indice = (tableau.length)-1; //La variable indice nous permet de parcourir le tableau de la fin à son début 
		System.out.println("\r\nVoici les valeurs saisies dans l'ordre inverse : ");
		for (int i=0; i<tableau.length; i++) {
			tableauInverse[i]= tableau[indice];
			indice--;
			System.out.print(tableauInverse[i]+" ");
		}
		//Fermeture du scanner
		sc.close();
		System.out.println("\r\nFin du programme de l'exo 3 ! \r\n");
	}

}
