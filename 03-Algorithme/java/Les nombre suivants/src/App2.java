import java.util.*;

public class App2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int nombreDepart;
		int i;

		System.out.println("Saisir un nombre de depart");
		nombreDepart = sc.nextInt();

		i = nombreDepart;

		while (i <= nombreDepart + 10) {
			i++;
			System.out.println(i);
		}
		sc.close();
	}

}
