package exerciceHaireVolume;


import java.util.Scanner; // Importation de l'outi scanner

import java.lang.Math; //importation du langage mathematique

public class App {

	public static void main(String[] args) {

		Scanner sc; // Declaration de la variable scanner
		int rayon; // Declaration de la variable rayon
        double aire; // Declaration de la variable de type double "aire" avec assiniation de la valeur PI
        sc = new Scanner(System.in); // Ouverture du scanner
        System.out.print("Entrez le rayon de la sphere : "); // Demander a l'utilisateur de saisire un rayon 
        rayon = sc.nextInt();
        aire = 4 * Math.PI * (Math.pow(rayon, 2)); // Calcule de l'aire d'une sphere
        System.out.println("L'aire de la sphere : "+aire); // Affichage du resulta 
        
        sc.close(); // Fermeture du scanner 
	
	
	}
}