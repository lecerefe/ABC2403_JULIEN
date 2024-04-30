import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int age;
		
		System.out.println("Saisir votre age: ");
			age = sc.nextInt();
			
			
			if (age < 5) {
				System.out.println("Trop jeune");
			}
			else if (age <= 6) {
				System.out.println("Debutant");
			}
			else if (age <= 8) {
				System.out.println("Poussin");
			}
			else if (age <= 10) {
				System.out.println("Benjamin");
			}
			else if (age <= 12) {
				System.out.println("Pupille");
			}
			else if (age <= 14) {
				System.out.println("Minime");
			}
			else if ( age <= 16) {
				System.out.println("Cadet"); 	
			}
			else if (age <= 18) {
				System.out.println("Junior");
			}
			else if (age <=34) {
				System.out.println("Sénior");
			}
			else if (age >= 35) {
				System.out.println("Vétéran");
			}
		
		sc.close();
		
		
		
	}

}
