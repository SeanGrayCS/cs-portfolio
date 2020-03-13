import java.util.*;
import java.io.*;
import java.text.*;

public class Area {
	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(new File("area.dat"));
		int n = s.nextInt();
		DecimalFormat df = new DecimalFormat("0.00");
		for (int i = 0; i < n; i++) {
			double l = s.nextDouble();
			double w = s.nextDouble();
			String result = df.format((Math.round((l * w) * 100.0)) / 100.0);
			System.out.println(result);
		}
		s.close();
	}
}
