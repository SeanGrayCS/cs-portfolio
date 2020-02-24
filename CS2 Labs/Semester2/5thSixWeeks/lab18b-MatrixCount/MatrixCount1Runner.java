/**
 * MatrixCount1Runner.java 2/24/2020
 *
 * @author - Sean Gray
 * @author - Period 1
 * @author - Id 902073
 *
*/

public class MatrixCount1Runner
{
	public static void main( String[] args) throws Exception
	{
		//make MatrixCount1 Object to print the matrix
		MatrixCount1 m = new MatrixCount1();
		//print results of counts
		System.out.println("Matrix values");
		System.out.println(m);
		System.out.println("The 7 count is :: " + MatrixCount1.count(7));
		System.out.println("The 7 count is :: " + MatrixCount1.count(8));
		System.out.println("The 7 count is :: " + MatrixCount1.count(6));
		System.out.println("The 7 count is :: " + MatrixCount1.count(21));
	}
}



