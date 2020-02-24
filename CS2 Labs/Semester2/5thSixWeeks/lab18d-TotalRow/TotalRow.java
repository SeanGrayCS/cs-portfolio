/**
 * TotalRow.java 2/24/2020
 *
 * @author - Sean Gray
 * @author - Period 1
 * @author - Id 902073
 *
*/

import java.util.List;
import java.util.ArrayList;

public class TotalRow
{
    public static List<Integer> getRowTotals( int[][] m )
    {
    	//make ArrayList
    	List<Integer> l = new ArrayList<Integer>();
    	for (int[] y : m)
    	{
    		int sum = 0;
    		for (int x : y)
    		{
    			sum += x;
    		}
    		l.add(sum);
    	}
		return l;
    }
}
