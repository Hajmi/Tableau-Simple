package tableaux;

public class ManipTableau {
	
	public static void main(String[] args) {
		int tableau[] = {0,5,7,12,25};
		int tableau2[][] = {{0,2,4,6},{10,12,14,16}};
		int tableauNonTrie[] = {4,8,2,7,12,25,13};
		afficheTableau(tableauNonTrie);
		triTableau(tableauNonTrie);
		afficheTableau(tableauNonTrie);
			
	}
	
	public static void remplirTableau1D (int tab[]) {
		
		for (int i = 0; i < tab.length; i++) {
			tab[i]=0;
		}

	}
	public static void remplirTableau2D (int tab[][]) {
		
		for (int i = 0; i < tab.length; i++) {
			for(int j = 0; j < tab[i].length; j++) {
				tab[i][j]=0;
			}
		}
	}
	
	public static void afficheTableau (int tab[]) {
		for (int i = 0; i < tab.length; i++) {
			System.out.print(tab[i]+" ");
		}
		System.out.println();
		
	}
	
	public static void afficheTableau2 (int tab[][]) {
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++){
				System.out.print(tab[i][j]+ " ");	
			}
			System.out.println();
		}
	}
	
	public static void triTableau (int tab[]) {
		int temp = 0;
		int posmini = 0;
		for (int i = 0; i < tab.length; i++) {
			posmini =i;
			for (int j = i+1; j < tab.length; j++){
				if (tab[j] < tab[posmini]) {
					posmini=j;
				}
			}
			temp=tab[posmini];
			tab[posmini]=tab[i];
			tab[i]=temp;
		}
		
	}	
	
	
	
	
}
