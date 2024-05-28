import java.util.Scanner;

public class App {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		Float prix;
		Float total;
		Float montantpaye;
		Float renduMonnaie;
		int billets5Euro;
		int piece2Euro;
		int piece50Cents;
		int piece20Cents;
		int piece10Cents;
	

		do {
			System.out.println("Saisir un prix");
					 prix = sc.nextFloat();
		
					 
					 
		}while (prix != 0);
		
		
		System.out.println("Voici le total : " + total);
		sc.close();
	}
		
}
