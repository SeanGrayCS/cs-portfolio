/**
 * TotalRowRunner.java 2/24/2020
 *
 * @author - Sean Gray
 * @author - Period 1
 * @author - Id 902073
 *
*/

public class TotalRowRunner
{
	public static void main( String[] args) throws Exception
	{
		//make matrix
		int[][] a = {{1, 2, 3}, {5, 5, 5, 5}};
		//print row totals
		System.out.println("Row totals are :: " + TotalRow.getRowTotals(a));
		//make matrix
		int[][] b = {{1, 2, 3}, {5}, {1}, {2, 2}};
		//print row totals
		System.out.println("Row totals are :: " + TotalRow.getRowTotals(b));
		//make matrix
		int[][] c = {{1, 2}, {5, 5}, {5, 5}, {4, 5, 6, 7}, {123124, 12312}};
		//print row totals
		System.out.println("Row totals are :: " + TotalRow.getRowTotals(c));
	}
}