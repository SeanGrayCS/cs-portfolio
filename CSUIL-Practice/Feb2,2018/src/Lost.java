import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Lost {

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(new File("lost.dat"));
		int n = s.nextInt();
		for (int i = 0; i < n; i++) {
			int r = s.nextInt();
			int c = s.nextInt();
			int y = 0, x = 0;
			String[][] mat = new String[r][c];
			for (int j = 0; j < r; j++) {
				mat[j] = s.next().split("");
			}
			for (int j = 0; j < r; j++) {
				for (int k = 0; k < c; k++) {
					if (mat[j][k].equals("S")) {
						y = j;
						x = k;
					}
				}
			}
			int count = findPath(y, x, mat, 0);
			if (count > 0) {
				System.out.println(count);
			} else {
				System.out.println("Not Possible");
			}
		}
		s.close();
	}

	public static int findPath(int startY, int startX, String[][] mat, int steps) {
		if (startY < 0 || startX < 0) {
			return 0;
		}
		if (mat[startY][startX].equals("E")) {
			return steps;
		}
		if (mat[startY][startX].equals("#")) {
			return 0;
		}
		mat[startY][startX] = "#";
		int best = Integer.MAX_VALUE;
		int north = findPath(startY - 1, startX, mat, steps + 1);
		if (north != 0) {
			best = Math.min(best, north);
		}

		int east = findPath(startY, startX + 1, mat, steps + 1);
		if (east != 0) {
			best = Math.min(best, east);
		}

		int south = findPath(startY + 1, startX, mat, steps + 1);
		if (south != 0) {
			best = Math.min(best, south);
		}

		int west = findPath(startY, startX - 1, mat, steps + 1);
		if (west != 0) {
			best = Math.min(best, west);
		}
		if (north != Integer.MAX_VALUE && east != Integer.MAX_VALUE && south != Integer.MAX_VALUE
				&& west != Integer.MAX_VALUE && best == Integer.MAX_VALUE) {
			best = 0;
		}
		mat[startY][startX] = ".";
		return best;
	}
}
