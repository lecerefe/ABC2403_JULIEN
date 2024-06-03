import java.lang.Math;

public class App {
/// fonction moyenne d un tableau
	public static float calculerMoyenne(int[] tableau) {

		int somme = 0;

		for (int i = 0; i < tableau.length; i++) {
			somme += tableau[i];

		}
		float moyenne = (float) somme / tableau.length;

		return moyenne;
	}

	public static int rechercheMaxCarrer(int[] tableau,IntRef  indice) {
		int maxAuCarrer = 0;
		
		for (int i = 0; i < tableau.length; i++) {
			if (tableau[i] > maxAuCarrer) {
				maxAuCarrer = tableau[i];
				indice.value=i ;
			}
		}
		maxAuCarrer =(int) Math.pow(maxAuCarrer,2);
		
		return maxAuCarrer;
	}
	
	public static void main(String[] args) {

		int[] numbers = new int[] { 2, 4, 1, 8, 6, 14, 23, 25, 7, 42 };
		int plusGrand = 0;
		int auCarrer = 0;

		System.out.println("Bienvenue dans le programme de calcul du tableau d'entier ");

		float moyenne = calculerMoyenne(numbers);

		System.out.println("la moyenne du tableau numbers est : " + moyenne);

		int posiTableau = 0;
		 IntRef monindice=new IntRef(posiTableau);
		int max = rechercheMaxCarrer(numbers, monindice);
		/*
		 * for (int i = 0; i < numbers.length; i++) {
		 * 
		 * if (plusGrand < numbers[i]) { plusGrand = numbers[i]; } }
		 */
		/* auCarrer = (plusGrand * plusGrand); */

		System.out.println("Valeur la plus grande au carré " + "(" + max + ")" + " elle se trouve a l'indice : " + monindice.value);

	}
	 
		
	
}
public class IntRef { 
	public int value;
	public IntRef( int _unentier)
	{ value=_unentier;}

}
