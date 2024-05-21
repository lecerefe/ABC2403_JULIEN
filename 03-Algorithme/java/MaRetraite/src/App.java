import java.util.*;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int age;

		System.out.println("Veuillez saisir un age");
		age = sc.nextInt();

		if (age == 60) {
			System.out.println("C'est le moment de prendre sa retraite");
		} else if(age < 0 || age > 100) {
			System.out.println("La valeur fournie n'est pas un âge valide");
		} else if (age < 60) {
			System.out.println("Il vous reste: " + (60 - age) + " années avant la retraite");
		} else if (age >= 60) {
			System.out.println("Vous êtes à la retraite depuis: " + (age - 60) + " années");
		
		}
		sc.close();
	}

}
