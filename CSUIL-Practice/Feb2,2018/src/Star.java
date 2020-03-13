import java.util.*;
import java.io.*;

public class Star {

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(new File("star.dat"));
		int n = s.nextInt();
		for (int i = 0; i < n; i++) {
			int x = s.nextInt();
			int high = 0;
			String b = "";
			for (int j = 0; j < x; j++) {
				String m = s.next();
				int g = s.nextInt();
				if (g > high) {
					high = g;
					b = m;
				}
			}
			System.out.println(b);
		}
		s.close();
	}

}
