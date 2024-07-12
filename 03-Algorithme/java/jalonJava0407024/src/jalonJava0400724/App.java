package jalonJava0400724;

public class App {

	public static void main(String[] args) {
		
		String [] tab = new String[] {"Riri" ,"Fifi", "Loulou", "et" , "Picsou"};
		System.out.print(concatenation(tab));
	}
	public static String concatenation(String tab[]) {
		String result = "";
		for(int i = 0; i < tab.length; i++) {
		result += tab[i] + " ";
		}
		return result;
	}
	
}
