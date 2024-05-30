package sommeDesValeursTableau;

public class App {

	public static void main(String[] args) {
	
		int[] tableau;
		int[] tableau2;
		int resultaTableau;
		
		resultaTableau = 0; 
		tableau = new int[] {4, 8, 7, 12};
		tableau2 = new int[] { 3, 6};
		
		for(int i = 0; i < tableau.length; i++) {
			
			for(int j = 0; j < tableau.length; j++) {
				resultaTableau += tableau[i] * tableau[j];
			}
		}
		System.out.println(resultaTableau);
	}

}
