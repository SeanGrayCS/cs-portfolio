/**
 * BiggestRunner.java 2/24/2020
 *
 * @author - Sean Gray
 * @author - Period 1
 * @author - Id 902073
 *
*/

public class BiggestRunner
{
	public static void main( String[] args) throws Exception
	{
		//define matrix
		int[][] a = {{1, 2, 3}, {5, 5, 5, 5}};
		//print biggest
		System.out.println( "The biggest number is :: " + Biggest.getBig( a ) );
		//define matrix
		int[][] b = {{1, 2, 3}, {-5}, {11}, {21, 2}};
		//print biggest
		System.out.println( "The biggest number is :: " + Biggest.getBig( b ) );
		//define matrix
		int[][] c = {{1, 2}, {-5, 5}, {5, 5}, {4, 5, 6, 7}, {123124, 12312}};
		//print biggest
		System.out.println( "The biggest number is :: " + Biggest.getBig( c ) );
		//define matrix
		int[][] d = {{-20, -40}, {-234, -234234 } };
		//print biggest
		System.out.println( "The biggest number is :: " + Biggest.getBig( d ) );
	}
}



