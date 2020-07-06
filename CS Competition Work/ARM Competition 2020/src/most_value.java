import java.util.*;
import java.io.*;

public class most_value {
	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(new File("most_value.dat"));
		while (s.hasNextLine()) {
			String[] arr = s.nextLine().split(" ");
			int highCount = 0;
			String value = arr[0];
			for (int i = 0; i < arr.length; i++) {
				int count = 0;
				for (int j = 0; j < arr.length; j++) {
					if (arr[j].equals(arr[i])) {
						count++;
					}
				}
				if (count > highCount) {
					highCount = count;
					value = arr[i];
				}
			}
			int total = 0;
			int amountOfTotal = highCount * Integer.parseInt(value);
			for (int i = 0; i < arr.length; i++) {
				total += Integer.parseInt(arr[i]);
			}
			System.out.println(value + " accounts for " + amountOfTotal + " of the sets total value of " + total);
		}
		s.close();
	}
}
