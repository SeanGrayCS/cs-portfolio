/**
 * ListOddToEven.java 02/05/2020
 *
 * @author - Sean Gray
 * @author - Period 1
 * @author - Id 902073
 */

import java.util.List;
import java.util.ArrayList;

public class ListOddToEven
{
	public static int go(List<Integer> ray)
	{
		ArrayList<Integer> rayList = new ArrayList<Integer>(); //put List ray into an ArrayList
		rayList.addAll(ray);
		int oddIndex = 0; //instantiate variables
		int evenIndex = 0;
		boolean hasOdd = false;
		boolean hasEven = false;
		for (int i = 0; i < rayList.size(); i++)
		{
			if (rayList.get(i) % 2 == 1 && !hasOdd) //find the first odd
			{
				oddIndex = i;
				hasOdd = true;
			}
			if (rayList.get(i) % 2 == 0 && hasOdd) //write over each even after the first odd with the next even
			{
				evenIndex = i;
				hasEven = true;
			}
		}
		if (!hasOdd || !hasEven) //return -1 if there were no odds or no evens after odds
			return -1;
		return evenIndex - oddIndex; //return the distance
	}
}