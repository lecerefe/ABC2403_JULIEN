import java.util.Scanner; 


public class App {

	public static void main(String[] args) {
		
		int nombre;
		Scanner sc;
		sc = new Scanner(System.in);
		
		System.out.println("Veillez Saisir un nombre");
		nombre = sc.nextInt();
		
		if(nombre < 0)
		{
			System.out.println("Le nombre est Negatif");
		}
		else {
			System.out.println("Le nombre est Positif");
		}
		
		sc.close();
		
	}

}
