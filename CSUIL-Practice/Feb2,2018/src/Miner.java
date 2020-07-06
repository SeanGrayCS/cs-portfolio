import java.util.*;
import java.io.*;

public class Miner {
	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(new File("miner.dat"));
		int n = s.nextInt();
		for (int i = 0; i < n; i++) {
			String m = s.next();
			String pass = "";
			for (int j = 0; j < m.length(); j++) {
				if ((m.charAt(j) == 'p') && (m.charAt(j + 1) == ':')) {
					for (int k = j + 2; k < m.length(); k++) {
						if ((m.charAt(k) == ':') && (m.charAt(k + 1) == 'p'))
							break;
						pass += m.charAt(k);
					}
				}
			}
			System.out.println(pass);
		}
		s.close();
	}
}
