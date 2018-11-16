package tableaux;

public class Exo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Création d'un tableau avec dix éléments
		int tableau [] = new int[10];
		System.out.println("Debut du programme de l'exo 1 ! ");
		//On réalise une boucle pour parcourir le tableau et le remplir afin d'afficher la valeur contenue
		for (int i=0; i<10; i++) {
			tableau[i]=i;
			//On affiche la valeur contenue dans le tableau
			System.out.println(tableau[i]);
		}
		System.out.println("Fin du programme de l'exo 1 ! \r\n");
	}

}
