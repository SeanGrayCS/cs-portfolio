import java.util.*;
import java.io.*;

public class Students {
	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(new File("students.dat"));
		int n = s.nextInt();
		for (int i = 0; i < n; i++) {
			int x = s.nextInt();
			ArrayList<Integer> grades = new ArrayList<Integer>();
			TreeMap<Integer, String> map = new TreeMap<Integer, String>();
			ArrayList<String> names = new ArrayList<String>();
			for (int j = 0; j < x; j++) {
				names.add(s.next());
				grades.add(s.nextInt());
				map.put(grades.get(j), names.get(j));
			}
			Collections.sort(grades);
			
			for (int j = x - 1; j >= 0; j--) {
				System.out.println(map.get(grades.get(j)) + " " + grades.get(j));
			}
			if (i != n -1)
				System.out.println();
		}
		s.close();
	}
}
