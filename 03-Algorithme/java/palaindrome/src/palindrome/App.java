package palindrome;
import java.lang.String;
public class App {

	public static void main(String[] args) {

		String[] tab = new String[] { "K", "A", "Y", "A", "K" };

		boolean result = App.verifyPalindrome(tab);
		System.out.println(result);

	}

	public static boolean verifyPalindrome(String[] tab) {
		boolean resulta = true;
		int i = 0;
		int j = tab.length;
		while (resulta == true && i < tab.length/2) { // ou i < tab.length && i != j-1
			if (tab[i] == tab[j - 1]) {
				resulta = true;
				i++;
				j--;

			} else {
				resulta = false;
			}
		}
		return resulta;
	}
}