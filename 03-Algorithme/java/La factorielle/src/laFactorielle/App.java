package laFactorielle;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int nombre;
		int factorielle;

		System.out.println("Veuillez saisir un nombre: ");
		nombre = sc.nextInt();

		factorielle = 1;

		for (int i = 1; i <= nombre; i++) {
			factorielle *= i;
		}
		System.out.println("La factorielle du nombre: " + nombre + " est: " + factorielle);
	}

}
