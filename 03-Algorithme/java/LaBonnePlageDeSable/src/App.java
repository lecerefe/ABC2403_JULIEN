import java.util.*;
public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nombre;
		
		do {
			System.out.println("Saisir un nombre entre 1 et 3: ");
						nombre = sc.nextInt();

		}while(nombre <1 || nombre >3); {
			System.out.println("Bravo, vous avez réussi");				
		}
	}
		}

