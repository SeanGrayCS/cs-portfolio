/**
 * Biggest.java 2/24/2020
 *
 * @author - Sean Gray
 * @author - Period 1
 * @author - Id 902073
 *
*/

public class Biggest
{
    public static int getBig(int[][] m)
    {
    	//starts biggest at first value
    	int biggest = m[0][0];
    	//loop through each array in matrix
		for (int[] y : m)
		{
			//loop through each value in array
			for (int x : y)
			{
				//changes biggest to value if value is larger
				if (x > biggest)
					biggest = x;
			}
		}
		return biggest;
    }
}
