package tableaux;

public class Exo13 {
	// Dans cette classe on vient calculer la somme des mutltiplication de chaque valeur d'un tableau par un autre tableau
	//joke 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int MIN = 0; //Valaur minimum du tableau
		int MAX = 20;//Valeur maximum du tableau
		int RANGE = MAX - MIN;
		int nbValeurs1 = 2;
		int nbValeurs2 = 2;
		int[] tableau1 = new int[nbValeurs1];
		int[] tableau2 = new int[nbValeurs2];
		int joke = 0;
		int multi = 0;
		
		System.out.println("Debut du programme de l'exo 13 ! ");
		//On remplit les tableaux en réalisant le joke
		for (int i=0; i<nbValeurs1; i++) {
			tableau1[i] = (int)((Math.random() *RANGE)- (MIN));
		}
		for(int j=0; j<nbValeurs2; j++) {
			tableau2[j] = (int)((Math.random() *RANGE)- (MIN));
		}
		for (int i=0; i<nbValeurs1; i++) {
			for (int j=0; j<nbValeurs2; j++) {
				joke = joke + (tableau1[i]*tableau2[j]);
			}

		}
		//On vient afficher le contenu des tableaux
		System.out.println("Voici le contenu du tableau 1 :");
		for (int i=0; i<nbValeurs1; i++) {
			System.out.print(tableau1[i]+" : ");
		}
		System.out.println("\r\nVoici le contenu du tableau 2 :");
		for (int i=0; i<nbValeurs2; i++) {
			System.out.print(tableau2[i]+" : ");
		}
			
		System.out.println("\r\nVoici le résultat du joke : "+joke);
		System.out.println("\r\nFin du programme de l'exo 13 ! ");
	}

}
