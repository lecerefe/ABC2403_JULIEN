import java.util.Scanner;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		

		int pre10mierNombreEntier; 
		
		int deuxiemeNombreEntier;
		
		float moyenneDesDeuxNombre;
		
		
		Scanner sc;
		
		sc = new Scanner(System.in); 
		
		System.out.println("Bonjour Veillez saisire un nombre: ");
	
		
		int premierNombreEntier = sc.nextInt();
		
		System.out.println("Veillez saisire un deuxieme nombre ");
		
		deuxiemeNombreEntier = sc.nextInt();
		
		sc.close();
		
		moyenneDesDeuxNombre = (premierNombreEntier + deuxiemeNombreEntier) / 2.0F;
				
				
		System.out.println(moyenneDesDeuxNombre);
	}

}
