/**
 * Grid.java 2/24/2020
 *
 * @author - Sean Gray
 * @author - Period 1
 * @author - Id 902073
 *
*/

import java.io.IOException;
import java.util.Scanner;

public class GridRunner
{
	public static void main( String[] args) throws IOException
	{
		//make scanner
		Scanner s = new Scanner(System.in);
		//get inputs
		System.out.println("Enter a string of values separated by spaces for the grid: ");
		String input = s.nextLine();
		System.out.println("Enter number of rows: ");
		int rows = s.nextInt();
		System.out.println("Enter number of columns: ");
		int cols = s.nextInt();
		//make array and grid
		String[] arr = input.split(" ");
		Grid grid = new Grid(rows, cols, arr);
		//print grid
		System.out.println("\nGrid:");
		System.out.println(grid);
		//find max count
		System.out.println(grid.findMax(arr));
	}
}