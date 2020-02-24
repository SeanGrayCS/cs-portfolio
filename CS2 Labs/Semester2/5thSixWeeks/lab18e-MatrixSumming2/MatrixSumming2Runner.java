/**
 * MatrixSumming1Runner.java 2/24/2020
 *
 * @author - Sean Gray
 * @author - Period 1
 * @author - Id 902073
 *
*/

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class MatrixSumming2Runner
{
	public static void main( String[] args ) throws IOException
	{
		//make Scanner
		Scanner file = new Scanner(new File("matsum.dat"));
		//scan in n
		int n = file.nextInt();
		//make MatrixSumming1 Object to print the matrix
		MatrixSumming2 m = new MatrixSumming2();
		System.out.println("Matrix values");
		System.out.println(m);
		//print sums
		for (int i = 0; i < n; i++)
		{
			int r = file.nextInt();
			int c = file.nextInt();
			System.out.println("The sum of " + r + ", " + c + " is " + m.sum(r, c) + ".");
		}
	}
}



