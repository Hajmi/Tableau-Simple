package tableaux;

public class Exo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int MIN = 0; //Valaur minimum du tableau
		int MAX = 20;//Valeur maximum du tableau
		int RANGE = MAX - MIN;
		int nbValeurs = 0;
		System.out.println("Debut du programme de l'exo 11 ! \r\nNous allons maintenant remplir notre tableau : ");
		nbValeurs = (int)((Math.random() *RANGE)- (MIN));
		int[] tableau = new int[nbValeurs];
		//On vient remplir notre tableau aléatoirement 
		for (int i=0; i<tableau.length; i++) {
			tableau[i]= (int)((Math.random() *RANGE)- (MIN));
		}
		System.out.println("Voici les notes saisies : ");
		//On parcourt notre tableau pour afficher les valeurs contenues 
		for (int i=0; i<tableau.length; i++) {
			System.out.print(tableau[i]+"; ");
		}
		System.out.println("\r\nVoici les notes saisies augmentées de 1 : ");
		//On parcourt notre tableau pour afficher les valeurs contenues après avoir été augmentées de 1
		for (int i=0; i<tableau.length; i++) {
			tableau[i]+=1;
			System.out.print(tableau[i]+"; ");
		}
		
		System.out.println("\r\nFin du programme de l'exo 11 ! ");
	}

}
