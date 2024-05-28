import java.util.Scanner;

public class App {

	
	public static void main(String[] args) {
		
		int cd1;
		int cd2;
		int cd3;
		int cd4;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Saisier le % de suffrages du premiere candidat: ");
			cd1 = sc.nextInt();
			
		System.out.println("Saisier le % de suffrages du deuxieme candidat: ");
			cd2 = sc.nextInt();
		
		System.out.println("Saisier le % de suffrages du troisieme candidat: ");
			cd3 = sc.nextInt();
			
		System.out.println("Saisier le % de suffrages du quatrieme candidat: ");
			cd4 = sc.nextInt();
			
			if (cd1 > 50) {
				
				System.out.println("Il est elu");
			}
			
			else {
				System.out.println("On passe au deuxieme tours");
			}
}
	
}
