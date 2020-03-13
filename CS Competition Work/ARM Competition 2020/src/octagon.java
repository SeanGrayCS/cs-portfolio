import java.util.*;
import java.io.*;
import java.text.*;

public class octagon {
	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(new File("octagon.dat"));
		DecimalFormat df = new DecimalFormat("0.00");
		int n = s.nextInt();
		for (int i = 0; i < n; i++) {
			double area = s.nextDouble();
			double side = area/(2 * (1 + Math.sqrt(2)));
			side = Math.sqrt(side);
			System.out.println(df.format(side));
		}
		s.close();
	}
}
