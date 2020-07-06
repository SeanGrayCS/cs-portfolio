import java.util.*;
import java.io.*;

public class album_length {
	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(new File("album_length.dat"));
		int n = s.nextInt();
		int totalMin = 0;
		int totalSec = 0;
		s.nextLine();
		for (int i = 0; i < n; i++) {
			String[] arr = s.nextLine().split(" ");
			String[] m = arr[arr.length - 1].split(":");
			totalMin += Integer.parseInt(m[0]);
			totalSec += Integer.parseInt(m[1]);
		}
		if (totalSec > 59) {
			totalMin += totalSec / 60;
			totalSec %= 60;
		}
		String sec = "";
		if (totalSec < 10) {
			sec = "0" + totalSec;
		} else {
			sec = "" + totalSec;
		}
		System.out.println("The album length is " + totalMin + ":" + sec);
		s.close();
	}
}
