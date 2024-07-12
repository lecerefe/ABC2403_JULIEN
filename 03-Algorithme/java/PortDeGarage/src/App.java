
public class App {

	public static void main(String[] args) {
		
		PorteDeGarage porteGarage = new PorteDeGarage();

		boolean resulta = porteGarage.deverouiler();
		
		PorteDeGarage porteGarage2 = new PorteDeGarage(true, 100, 100, 0);
		
		boolean resukt = porteGarage2.verouiller();
	}

}
