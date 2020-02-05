/**
 * ListSumFirst.java 02/05/2020
 *
 * @author - Sean Gray
 * @author - Period 1
 * @author - Id 902073
 */

import java.util.List;

public class ListSumFirst
{
	public static int go( List<Integer> ray)
	{
		int total = 0;
		int first = ray.get(0);
		boolean counted = false;
		for (Integer num : ray) //sum each Integer num in List ray
		{
			if (num > first)
			{
				total += num;
				counted = true; //make true once a number is greater than the first
			}
		}
		if (!counted) //check if a number was higher than first
			return -1;
		return total;
	}
}