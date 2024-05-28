package lePlusGrandV2;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int nombreCs;
		int nombre;
		int plusGrand;
		int plusPetit;
		int numero;
		int i;

		i = 0;
		plusPetit = 1000;
		plusGrand = 0;
		numero = 1;

		System.out.println("Saisir combien de nombre vous avez besois");
		nombreCs = sc.nextInt();

		while (i < nombreCs) {
			System.out.println("Saisir le nonbre: " + numero);
			nombre = sc.nextInt();

			if (nombre > plusGrand) {
				plusGrand = nombre;
				if (nombre < plusPetit) {
					plusPetit = nombre;
				}

				i++;
				numero++;
			}

		}
		System.out.println("Le plsu grand nombres saisi est: " + plusGrand + " " + plusPetit
				+ "etait le nombres le plus petit saisi");

		sc.close();
	}

}
