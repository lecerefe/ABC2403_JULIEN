package laForceBrut;

public class App {

	public static void main(String[] args) {
		String[] names = { "pomme", "orange", "banane", "melon", "poir" };
		int[] taills = { 2, 3, 1, 4, 1 };
		int[] profits = { 4, 5, 3, 7, 3 };

		int meilleurProfit = 0;
		for (int i = 0; i < 5; i++) {
			for (int a = i + 1; a < 5; a++) {
				int taill = taills[i] + taills[a];
				int profit = profits[i] + profits[a];
				System.out.println(names[i] + "\t" + names[a] + "\t" + taill + "\t" + profit);
				if ((profit > meilleurProfit) && (taill <= 5)) {
					meilleurProfit = profit;
				}
			}
		}
		System.out.println("Le meilleur profit est : " + meilleurProfit);
	}
}
