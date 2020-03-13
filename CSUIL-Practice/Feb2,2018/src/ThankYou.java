import java.util.*;
import java.io.*;

public class ThankYou {

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(new File("thankyou.dat"));
		int n = s.nextInt();
		s.nextLine();
		for (int i = 0; i < n; i++) {
			String m = s.nextLine();
			System.out.println("Thank You " + m);
		}
		s.close();
	}

}
