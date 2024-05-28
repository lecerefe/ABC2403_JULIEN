package tableauPositifNegatif;

import java.util.Scanner;

public class App {
	
	public static int ma1erFonction(String question) {
		
		System.out.println();
		Scanner sc = new Scanner(System.in);
		int valeur = sc.nextInt();
		sc.close();
		return valeur;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int tailleTableau;
		int i;
		int positif;
		int negatif;
		int[] tableau;

		positif = 0;
		negatif = 0;

	

		tailleTableau = App.ma1erFonction("Entrer le nombre de valeurs que vous siuhaitez saisir : ");
		
		tableau = new int[tailleTableau];

		for (i = 0; i < tailleTableau; i++) {
			System.out.println("Saisisez la valeur N°" + (i + 1) + "/" + tailleTableau);
			tableau[i] = sc.nextInt();

			if (tableau[i] >= 0) {
				positif++;
			} else {
				negatif++;
			}
		}
		System.out.println("Vous avez saisi: " + positif + " nombre positifs");
		System.out.println("Vous avez saisi: " + negatif + " nombre negatifs");

		sc.close();
	}

}
