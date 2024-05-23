import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int plusPetit;
		int plusGrand;
		int nombre;
		int i;
		int numero;
		
		plusPetit = 1000;
		plusGrand = 0;
		numero = 1;

		for (i = 0; i < 20; i++) {
			System.out.println("Entre le nombre numero: " + numero);
			nombre = sc.nextInt();
			numero++;

			if (nombre > plusGrand) {
				plusGrand = nombre;
			}
			if (nombre < plusPetit) {
				plusPetit = nombre;
			}
		}
		System.out.println("Le plus grand des nombre saisi est : " + plusGrand + " " + plusPetit + "était le nombre le plus petit qui a été saisi");

		sc.close();
	}
	
}
