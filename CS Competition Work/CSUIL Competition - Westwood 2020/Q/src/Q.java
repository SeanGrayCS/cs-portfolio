import java.util.*;
import java.io.*;

public class Q {

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(new File("q.dat"));
		int n = s.nextInt();
		ArrayList<Integer> l = new ArrayList<Integer>();
		
		for (int i = 0; i < n; i++)
		{
			l.clear();
			int num = s.nextInt();
			l.add(1);
			l.add(1);
			
			for (int j = 2; j < num; j++)
			{
				l.add(l.get(j - l.get(j - 1)) + l.get(j - l.get(j - 2)));
			}
			System.out.println(l.get(num - 1));
		}
		s.close();
	}

}