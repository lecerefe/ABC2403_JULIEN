import java.util.Scanner;

public class App {

	
	
	public static void main(String[] args) {
	
	int A;// Déclaration de la variable A
	
	int B;// Déclaration de la variable B
	
	System.out.print("Entrez deux nombres"); // Demender a l utilisateur de saisir deux nombre
	
	Scanner sc = new Scanner(System.in);
		
		A = sc.nextInt(); 
		B = sc.nextInt();

	
	System.out.println("Avant la permutation: a = "+A+" et b = "+B); // Ecrire la valeur de A et B avant la permutation
	
	A = A + B; /* operation pour inverser les valeur*/ 
	B = A - B;
	A = A - B;
	
	System.out.println("Aprés la permutation: a = "+A+" et b = "+B); // Ecrire la valeur de A et B apres la permutation
	
	sc.close();
	


	}

}
