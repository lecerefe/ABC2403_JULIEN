package tableau;

public class App {

	public static void main(String[] args) {
		
		int a;
		a = 1;
		int b = 2;
		
		int[] tableau; // Declaration de la variable tableau
		int[] tableau2;
		
		
		
		tableau = new int[3]; // initialitation du tableau est chois du nombre de colone

		tableau2 = new int[] {1, 3, 5, 7, 9};	// initialitation en fournissant d'abord les valeur dans les colone	
			
		tableau[0] = 3;
		tableau[1] = 5;
		tableau[2] = 22;
		
		
		
		for(int i = 0; i < tableau.length; i++) {
			System.out.println("Element" + i + " de tableau =" + tableau[i]);
		}
		
	}

}
