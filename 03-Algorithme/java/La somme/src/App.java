import java.util.Scanner;
public class App {

	public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			int nombreDepart;
			int somme;
		
			System.out.println("Saisir un nombre premier");
						nombreDepart = sc.nextInt();
				
				somme = 0;
			for(int i = 1; i <= nombreDepart; i++) {
				somme += i;
				
			}
			System.out.println("La somme du nombre saisi est :" + somme );
	}

}
