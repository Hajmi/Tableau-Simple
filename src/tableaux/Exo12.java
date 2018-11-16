package tableaux;

public class Exo12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int MIN = 0; //Valaur minimum du tableau
		int MAX = 20;//Valeur maximum du tableau
		int RANGE = MAX - MIN;
		int nbValeurs = 8;
		int[] tableau1 = new int[nbValeurs];
		int[] tableau2 = new int[nbValeurs];
		int[] tableau3 = new int[nbValeurs];
		
		System.out.println("Debut du programme de l'exo 12 ! ");
		//On remplit les tableaux
		for (int i=0; i<nbValeurs; i++) {
			tableau1[i] = (int)((Math.random() *RANGE)- (MIN));
			tableau2[i] = (int)((Math.random() *RANGE)- (MIN));
			tableau3[i] = tableau1[i] + tableau2[i];
		}
		//On vient afficher le contenu des tableaux
		System.out.println("Voici le contenu du tableau 1 :");
		for (int i=0; i<nbValeurs; i++) {
			System.out.print(tableau1[i]+" : ");
		}
		System.out.println("\r\nVoici le contenu du tableau 2 :");
		for (int i=0; i<nbValeurs; i++) {
			System.out.print(tableau2[i]+" : ");
		}
		System.out.println("\r\nVoici le contenu du tableau 3 qui est la samme du tableau 1 et 2 :");
		for (int i=0; i<nbValeurs; i++) {
			System.out.print(tableau3[i]+" : ");
		}
		
		System.out.println("\r\nFin du programme de l'exo 12 ! ");

	}

}
