import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int c;

		System.out.println("Saisir trois nombres entier: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		if (a >= b && a >= c) {
			if (b >= c) {
				System.out.println("Ordre décroissant: " + a + " " + b + " " + c);
			} else {
				System.out.println("Ordre décroissant: " + a + " " + c + " " + b);
			}
		} else if (b >= a && b >= c) {
			if (a >= c) {
				System.out.println("Ordre décroissant: " + b + " " + a + " " + c);
			} else {
				System.out.println("Ordre décroissant: " + b + " " + c + " " + a);
			}
			if (a >= b) {
				System.out.println("Ordre décroissant: " + c + " " + a + " " + b);
			} else {
				System.out.println("Ordre décroissant: " + c + " " + b + " " + a);
			}
		}

	}

}
