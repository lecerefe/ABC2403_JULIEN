public class App {

	public static void main(String[] args) {
		
		int[] tableau;
		int cunter;
		int i;
		
		
		i = 0;
		cunter = 1;
		tableau = new int[5];
		
		tableau[0] = 5;
		tableau[1] = 13;	
		tableau[2] = 19;
		tableau[3] = 20;
		tableau[4]	= 15;	
		
		
		while(i < tableau.length) {
		System.out.println("Element " + cunter + " de tableau = " + tableau[i]);
				i++;	
				cunter++;
				
		}
	}  

}
