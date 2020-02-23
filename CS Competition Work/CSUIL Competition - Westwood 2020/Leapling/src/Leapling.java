import java.io.*;
import java.util.*;

public class Leapling {

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(new File("leapling.dat"));
		int n = s.nextInt();
		 for (int i = 0; i < n; i++)
		 {
			 int[] day = {2, 29, s.nextInt()};
			 String[] m = s.next().split("/");
			 if (Integer.parseInt(m[0]) > 2)
			 {
				 int numYears = (Integer.parseInt(m[2]) - day[2]) / 4;
				 System.out.println(numYears);
			 }
			 else if (Integer.parseInt(m[0]) == 1)
			 {
				 int numYears = (Integer.parseInt(m[2]) - 1 - day[2]) / 4;
				 System.out.println(numYears);				 
			 }
			 else if (Integer.parseInt(m[1]) == 29){
				 int numYears = (Integer.parseInt(m[2]) - day[2]) / 4;
				 System.out.println(numYears);
			 }
			 else {
				 int numYears = (Integer.parseInt(m[2]) - 1 - day[2]) / 4;
				 System.out.println(numYears);
			 }
		 }
		 s.close();
	}

}