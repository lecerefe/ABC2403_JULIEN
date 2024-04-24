package introduction;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		String prenom; // Déclaration d'une variable " prenom" type "chaine de caractères"
		
		Scanner sc; // Déclaration d'une variable de type Scanner (penser à ajouter la ligne d'impot (cf ligne 3))
		
		sc = new Scanner(System.in); // Initialisation d'un nouveau Scanner
		
		
		System.out.println("Bonjour, veuillez saisir votre prénom: "); // Affichage
		
		
		prenom = sc.nextLine(); // Demande à lutilisateur une saisie.
		// Lorsque l'utilisateur validera avec la  touche " entée", la saisi est récupérée dans la variable à gauche du singe "="
			
		System.out.println("Bonjour " + prenom); // Affichage
		
		
		sc.close(); // Fermeture du Scanner (OBLIGATOIRE)

	}

}
