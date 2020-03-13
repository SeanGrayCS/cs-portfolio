import java.util.*;
import java.io.*;

public class rearrange {
	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(new File("rearrange.dat"));
		while (s.hasNextLine()) {
			String[] arr = s.nextLine().split(" ");
			for (int i = 0; i < arr.length; i++) {
				if (arr[i].length() > 2) {
					if ((arr[i].length() % 2) == 1) {
						String first = arr[i].substring(0, 1);
						String last = arr[i].substring(arr[i].length() - 1);
						arr[i] = last + arr[i].substring(1, arr[i].length() - 1) + first;
					} else {
						String mL = arr[i].substring((arr[i].length() / 2) - 1, arr[i].length() / 2);
						String mR = arr[i].substring(arr[i].length() / 2, (arr[i].length() / 2) + 1);
						String first = arr[i].substring(0, 1);
						String last = arr[i].substring(arr[i].length() - 1);
						arr[i] = mL + arr[i].substring(1, (arr[i].length() / 2) - 1) + first + last + arr[i].substring((arr[i].length() / 2) + 1, arr[i].length() - 1) + mR;
					}
				}
				if (i != arr.length - 1)
					System.out.print(arr[i] + " ");
				else {
					System.out.print(arr[i] + "\n");
				}
			}
		}
		s.close();
	}
}
