import java.util.*;
import java.io.*;

public class DryRun {
	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(new File("pr00.dat"));
		int n = s.nextInt();
		for (int i = 0; i < n; i++) {
			int x = s.nextInt();
			System.out.println(x + 1);
		}
		s.close();
	}
}
