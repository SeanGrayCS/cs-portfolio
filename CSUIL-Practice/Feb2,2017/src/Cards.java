import java.util.*;
import java.io.*;

public class Cards {

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(new File("cards.dat"));
		int n = s.nextInt();
		for (int i = 0; i < n; i++) {
			String m = s.next();
			int j = 0;
			while (j < m.length()) {
				if ((Character.getNumericValue(m.charAt(j))) < 10) {
					if (j == 0) {
						m = m.substring(1);
						j--;
					} else {
						m = m.substring(0, j) + m.substring(j + 1);
						j--;
					}
				}
				j++;
			}
			System.out.println(52 - m.length());
		}
		s.close();
	}

}
