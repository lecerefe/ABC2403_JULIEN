package lesFruitEstLegumes;

import java.util.*;

public class APp {



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			String saisieUtilisateur;
			String[] legumesPrix = new String[1];
			String[] legumesPrix2;
			
			
			do {
				System.out.println("Saisir un fruit est son prix: ");
						saisieUtilisateur = sc.nextLine();
						
				if(!saisieUtilisateur.equalsIgnoreCase("go")) {
					
					legumesPrix[legumesPrix.length - 1] = saisieUtilisateur;
					legumesPrix2 = new String[legumesPrix.length + 1];
					System.arraycopy(legumesPrix2,0, legumesPrix, 0, legumesPrix.length);
					
					legumesPrix2 = legumesPrix;
				}
						
				
			}while (!saisieUtilisateur.equalsIgnoreCase("go"));
		
			for(int i = 0; i < legumesPrix.length; i++) {
				System.out.println(legumesPrix[i]);
			}
			/*for(int i = legumesPrix.length - 1; i >= 0; i--) {
				
			}*/
		
	
	}

}