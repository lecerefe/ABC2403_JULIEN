package Fonction;

import java.util.Date;
import java.text.SimpleDateFormat;

public class App {

	public static void ajouterUneTaxeUnPrix(float prix) {
		
		Prix prix = 10 ;
	}
	
	public static String prenomNom(String prenom, String nom) { // Fonction Concatenation prenom + nom

		String retour;
		retour = prenom + " " + nom;

		return retour;
	}
	
	public static void afficherJourHeurDuMoment() {

		SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		Date date = new Date();

		System.out.println(s.format(date));
	}

	public static void main(String[] args) {

		String prenom = "Julien";
		String nom = "Pecheur";
		String resultat = App.prenomNom(prenom, nom);
		System.out.println(resultat);
		float resulta2 = App.ajouterUneTaxeUnPrix(prix);
		
		
		App.afficherJourHeurDuMoment();

	}

}
