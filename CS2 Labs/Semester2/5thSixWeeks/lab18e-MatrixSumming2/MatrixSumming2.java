/**
 * MatrixSumming2.java 2/24/2020
 *
 * @author - Sean Gray
 * @author - Period 1
 * @author - Id 902073
 *
*/

public class MatrixSumming2
{
	//instance variable
    private int[][] m = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 0}, {6, 7, 1, 2, 5}, {6, 7, 8, 9, 0}, {5, 4, 3, 2, 1}}; //load in the matrix values
    public int sum( int r, int c )
    {
    	int total = 0;
    	for (int i = 0; i < m.length; i++)
    	{
    		for (int j = 0; j < m[i].length; j++)
    		{
    			if ((i >= (r - 1) && i <= (r + 1)) && (j >= (c - 1) && j <= (c + 1)))
    				total += m[i][j];
    		}
    	}
    	return total;
    }

    public String toString()
   	{
   		String result = "";
   		//loop through each array in matrix
   		for (int[] y : m)
   		{
   			//loop through each value in array
   			for (int x : y)
   			{
   				//concatenate value to string
   				result += x + "  ";
   			}
   			result += "\n";
   		}
   		return result;
   	}
}
