import java.util.*;
import java.io.*;

public class Robbery {
	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(new File("robbery.dat"));
		int n = s.nextInt();
		for (int i = 0; i < n; i++) {
			int w = s.nextInt();
			int o = s.nextInt();
			int[] vals = new int[o];
			int[] weights = new int[o];
			for (int j = 0; j < o; j++) {
				vals[j] = s.nextInt();
			}
			for (int j = 0; j < o; j++) {
				weights[j] = s.nextInt();
			}
			int value = findMaxValue(w, 0, vals, weights, 0);
			System.out.println(value);
		}
		s.close();
	}

	public static int findMaxValue(int weight, int value, int[] vals, int[] weights, int steps) {
		if (steps == weights.length - 1) {
			return value + vals[steps];
		}
		if (weight < 0) {
			return value;
		}
		int best = Integer.MIN_VALUE;
		int path = findMaxValue(weight - weights[steps], value + vals[steps], vals, weights, steps + 1);
		if (weight >= 0) {
			if (path > best) {
				best = path;
			}
		}
		return best;
	}
}
