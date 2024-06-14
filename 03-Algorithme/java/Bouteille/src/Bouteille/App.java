package Bouteille;


public class App {

	public static void main(String[] args) {
		
		Bouteille bouteille1 = new Bouteille();
		
		Bouteille bouteille2 = new Bouteille(1.2f, 0.8f, true, "H2O");
		
		Bouteille bouteille3 = new Bouteille(bouteille2);
		
		float contenanceEnCLDeBouteille2 = bouteille2.donneContenanceEnCL();
		
		Bouteille bouteille4 = new Bouteille(1.2f, 0.8f, true, "H2O");
		
		boolean result = bouteille4.remplissage(0.2f);
		
		Bouteille bouteille5 = new Bouteille(1.2f, 0.8f, true, "H2O");	
		
		boolean result1 = bouteille5.vidage(0.9f);
	}
	
}
