import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int i;
		int n;
		String resultat;
		long nbPrecedent;
		long nbCourant;
		long nbSuivant;

		i = 2;
		resultat = "0.1";
		nbCourant = 0;
		nbPrecedent = 1;

		System.out.println("Suite de Fibonacci. Combien de nombre de la suite souhaitez-vous afficher ? ");
		n = sc.nextInt();

		if (n > 2) {
			while (i < n) {
				nbSuivant = nbPrecedent + nbCourant;
				resultat = resultat + " " + nbSuivant;
				nbPrecedent = nbCourant;
				nbCourant = nbSuivant;
				i = i + 1;
			}

		} else {
			n = 2;
		}
		System.out.println("Les " + n + "premiers nombre de la suite de Fibonacci sont: " + resultat);
	}
}
