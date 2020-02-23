import java.io.*;
import java.util.*;

public class Middling {

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(new File("middling.dat"));
		
		int n = s.nextInt();
		
		for (int i = 0; i < n; i++)
		{
			ArrayList<Double> list  = new ArrayList<Double>();
			for (int j = 0; j < 10; j++)
			{
				list.add(s.nextDouble());
			}
			ArrayList<Double> copy  = new ArrayList<Double>();
			copy.addAll(list);
			
			for (int j = 0; j < 9; j++)
			{
				copy.set(0, (copy.get(0) + copy.get(1)) / 2);
				copy.remove(1);
			}
			
			double f = copy.get(0);
			
			for (int j = 0; j < 9; j++)
			{
				list.set(9 - j, (list.get(9 - j) + list.get(8 - j)) / 2);
				list.remove(8 - j);
			}
			
			double b = list.get(0);
			int m = (int) Math.round((f + b) / 2);
			System.out.println(m);
		}
		s.close();
	}

}