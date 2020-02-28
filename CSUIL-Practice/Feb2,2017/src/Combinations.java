import java.util.*;
import java.io.*;

public class Combinations {

	private int combos;

	public Combinations() {
		combos = 0;
	}

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(new File("combinations.dat"));
		int n = s.nextInt();
		for (int i = 0; i < n; i++) {
			int v = s.nextInt();
			int c = s.nextInt();
			int[] coins = new int[c];
			for (int j = 0; j < c; j++) {
				coins[j] = s.nextInt();
			}
			Combinations combo = new Combinations();
			combo.getCoinCombos(v, coins, 0, 0);
			System.out.println(combo.combos);
		}
		s.close();
	}

	public int getCoinCombos(int value, int[] coins, int firstCoinAvailable, int numCoins) {
		if (value == 0) {
			combos++;
			return 1;
		}
		if (value < 0) {
			return value + (numCoins * coins[firstCoinAvailable]);
		}
		if (firstCoinAvailable == coins.length - 1) {
			return value - coins[firstCoinAvailable];
		}
		int copyVal = value;
		int numAvailableCoin = copyVal / coins[firstCoinAvailable];
		for (int i = 0; i <= numAvailableCoin; i++) {
			value = getCoinCombos(value - (i * coins[firstCoinAvailable]), coins, firstCoinAvailable + 1, i);
			if (value == 0) {
				combos++;
			}
			value = copyVal;
		}
		return value + (numCoins * coins[firstCoinAvailable]);
	}

}