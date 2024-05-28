package demoFonction;

public class App {

	public static void main(String[] args) {
			
		System.out.println("Demo sur les fonctions");
		
		App.afficherHelloPrenom();
		App.hello("Le j");
		
		int somme = App.calculerSomme(7, 3);
		System.out.println(somme);

	} // void veut dire que la fonction ne revoie pas de valeur (une procedure)  			
	/**
	 * Affiche "hello world" dans la console
	 * Utulisation : App.helloWorld();
	 */
	public static  void afficherHelloPrenom() { 
		System.out.println("Hello Wordl");
	}
	
	/*
	 * Affiche le prénom founi en arguement dans la console
	 * @param prenom Le prénom à afficher
	 */
 public static void hello(String prenom)
 	{
	 	
	 	System.out.println("Hello " + prenom);	 
	}
 	public static int calculerSomme(int a, int b) {
 		
 		int resulta = a + b;
 		return resulta;
 		
 	}
}
