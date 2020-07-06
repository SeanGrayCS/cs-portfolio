import java.util.*;
import java.io.*;
import java.text.*;

public class register {
	public static void main(String[] args) throws IOException {
		DecimalFormat df = new DecimalFormat("0.00");
		Scanner s = new Scanner(new File("register.dat"));
		while (s.hasNextLine()) {
			String[] arr = s.nextLine().split(" ");
			int total = (int) (Double.parseDouble(arr[0]) * 100);
			long val = Long.parseLong(arr[1]);
			total -= ((int) (val * 2000));
			val = Long.parseLong(arr[2]);
			total -= ((int) (val * 1000));
			val = Long.parseLong(arr[3]);
			total -= ((int) (val * 500));
			val = Long.parseLong(arr[4]);
			total -= ((int) (val * 100));
			val = Long.parseLong(arr[5]);
			total -= ((int) (val * 25));
			val = Long.parseLong(arr[6]);
			total -= ((int) (val * 10));
			val = Long.parseLong(arr[7]);
			total -= ((int) (val * 5));
			val = Long.parseLong(arr[8]);
			total -= ((int) (val * 1));
			double dTotal = total;
			dTotal = dTotal / 100;
			String sTotal = df.format(dTotal);
			if (dTotal == 0.00) {
				System.out.println("Correct");
			} else if (dTotal < 0.00) {
				System.out.println("Over $" + (sTotal.substring(1)));
			} else {
				System.out.println("Missing $" + sTotal);
			}
		}
		s.close();
	}
}
