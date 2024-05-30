package lesCourses;

import java.util.*;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Integer[] tableau = {1, 4, 5, 10, 20, 22, 25, 30, 32};
		
		
	       System.out.println("Le tableau avant l'ajouts d' un nouvelle element : " + Arrays.toString(tableau));
	       tableau = addElement(tableau, 7);
	       Arrays.sort(tableau);
	       System.out.println("Le tableau apres l'ajouts d' un nouvelle element: " + Arrays.toString(tableau));
	   }
	
	private static <X> X[] addElement(X[] tableau, X element) {
	       X[] tableau1 = Arrays.copyOf(tableau, tableau.length + 1);
	       tableau1[tableau.length] = element;
	       return tableau1;
	   }
}