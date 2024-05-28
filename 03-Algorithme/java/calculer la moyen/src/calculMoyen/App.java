package calculMoyen;

public class App {

	public static void main(String[] args) {
		
		int[] valeurs = new int[] {1, 3, 5, 7, 3, 4, 2, 4, 22};
		
		
		App.calculerMoyenne(valeurs, 0);
	}
	public static void calculerMoyenne(int[] tableau, int somme) {
		
		for(int i = 0; i < tableau.length; i++) {
	
			somme += tableau[i];
	
		}

		float moyenne = (float)somme / (float)tableau.length;
		
		System.out.println(moyenne);
	}
 }