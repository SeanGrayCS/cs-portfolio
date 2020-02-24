/**
 * MatrixSumming1.java 2/24/2020
 *
 * @author - Sean Gray
 * @author - Period 1
 * @author - Id 902073
 *
*/

public class MatrixSumming1
{
	//instance variable
    private static int[][] m = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 0}, {6, 7, 1, 2, 5}, {6, 7, 8, 9, 0}, {5, 4, 3, 2, 1}};
    public static int sum(  )
    {
    	int total = 0;
    	//loop through each array in matrix
		for (int[] y : m)
		{
			//loop through each value in array
			for (int x : y)
			{
				//add value to x
				total += x;
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