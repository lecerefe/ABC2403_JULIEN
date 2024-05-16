package maBicyclette;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Boolean beauTemps;
		Boolean veloOk;
		Boolean reparationsImmediates;
		Boolean livrePossede;
		Boolean livreDispoBibliotheque;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entrée si il fait beau ou pas");
		
		beauTemps = sc.nextBoolean();
		
	if (beauTemps == true) {
		System.out.println("Je vais me ballader");
		
		System.out.println("Le velo est il en etat ?");
		
		veloOk = sc.nextBoolean();
		
	if (veloOk == true) {
		System.out.println("j' irai me ballader à bicyclette");
	}
	
	else {
		System.out.println("Je vais chez le garagiste");
		
	
	System.out.println("Les reparation son t'il immediate");
	}
	reparationsImmediates = sc.nextBoolean();
	
	if (reparationsImmediates == true) {
		System.out.println("J' irai me ballader à bicyclette");
	}
	else {
		System.out.println("J' irai ceuillir des joncs");
	}
	
	}
	else {
		System.out.println("Je vais lire un livre");
		
		System.out.println("Je possede GoT ?");
		
		livrePossede = sc.nextBoolean();
		
	if (livrePossede == false) {
		System.out.println("Je vais a la bibliothèque");
		
		System.out.println("Le livre est t' il disponible en biblioteque");
		
		livreDispoBibliotheque = sc.nextBoolean();
		
	if (livreDispoBibliotheque == true) {
	System.out.println("J' emprunte GoT");
	   }
	else  {
		System.out.println("J' emprunte un roman policier");
	}
		System.out.println("Je rentre chez moi");	
	}
	else {
		System.out.println("Je lis GoT");
		}
	System.out.println("Lecture de mon livre dans le fauteil");
		}
	sc.close();
	  }
	} 

