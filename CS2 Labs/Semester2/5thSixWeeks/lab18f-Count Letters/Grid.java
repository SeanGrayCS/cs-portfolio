/**
 * Grid.java 2/24/2020
 *
 * @author - Sean Gray
 * @author - Period 1
 * @author - Id 902073
 *
*/

public class Grid
{
	//instance variable
	private String[][] grid;

    //load vals into the rows x cols grid randomly
	public Grid(int rows, int cols, String[] vals)
	{
		grid = new String[rows][cols];
		for (int i = 0; i < rows; i++)
		{
			for (int j = 0; j < cols; j++)
			{
				grid[i][j] = vals[(int) ((Math.random() * vals.length) - .0000000000000001)];
			}
		}
	}

	//find out which of the vals occurs the most
	public String findMax(String[] vals)
	{
		//set max to first value
		int maxCount = countVals(vals[0]);
		String value = vals[0];
		for (int i = 0; i < vals.length; i++)
		{
			System.out.println(vals[i] + " count is " + countVals(vals[i]));
			if (countVals(vals[i]) > maxCount)
			{
				maxCount = countVals(vals[i]);
				value = vals[i];
			}
		}
		return "\n" + value + " occurs the most.";
	}

	//returns a count of how many times val occurs in the matrix
	private int countVals( String val )
	{
		int count = 0;
		for (String[] row : grid)
		{
			for (String col : row)
			{
				if (col.equals(val))
				{
					count++;
				}
			}
		}
		return count;
	}

	//display the grid
	public String toString()
   	{
   		String result = "";
   		//loop through each array in matrix
   		for (String[] y : grid)
   		{
   			//loop through each value in array
   			for (String x : y)
   			{
   				//concatenate value to string
   				result += x + " ";
   			}
   			result += "\n";
   		}
   		return result;
   	}
}