import java.util.Scanner;

public class App {
	
	final static double P1 = 0.10;
	final static double P2 = 0.09;
	final static double P3 = 0.08;

	public static void main(String[] args) {
		Scanner  sc;
		int nombreDeCopies;
		double montantDeLaFacture;
		sc = new Scanner(System.in);
		
		System.out.println("Saisir me nombre de photocopies");
		nombreDeCopies = sc.nextInt();
		
		if (nombreDeCopies <= 10) {
			montantDeLaFacture = nombreDeCopies * App.P1;
		}
		
		else if (nombreDeCopies <=30) {
			montantDeLaFacture = 10 * App.P1;
		}
		
		

	}

}
