 
import java.util.*;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int  nombre;

		do {
			System.out.println("Veillez saisir un nombre entre 10 est 20: ");
			nombre = sc.nextInt();

			if (nombre < 10) {
				System.out.println("Plus grand ! ");
			} else if (nombre > 20) {
				System.out.println("Plus petit ! ");
			}

		} while (nombre < 10 || nombre > 20);
		{
			System.out.println("Yes, you did it ! ");
		}
	}

}
