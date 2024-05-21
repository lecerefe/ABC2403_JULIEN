package Es_tuMajeur;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int age;

		System.out.println("Veuillez saisir votre age: ");
		age = sc.nextInt();

		if (age < 18 && age > 0) {
			System.out.println("Vous êtes mineur");
		} else if (age <= 0) {
			System.out.println("Vous n’êtes pas encore né");
		} else {
			System.out.println("Vous êtes majeur");
		}
		sc.close();
	}
	
	

}
