/**
 * ListLast.java 02/05/2020
 *
 * @author - Sean Gray
 * @author - Period 1
 * @author - Id 902073
 */

import java.util.List;
import java.util.ArrayList;

public class ListLast
{
	public static boolean go( List<Integer> ray)
	{
		boolean repeat = false;
		ArrayList<Integer> rayList = new ArrayList<Integer>();
		rayList.addAll(ray);
		int last = rayList.get(rayList.size() - 1);
		rayList.remove(rayList.size() - 1); //remove last number
		for (Integer num : rayList) //loop through each number in ray
		{
			if (num == last)
				repeat = true; //make true once a number is equal to the last
		}
		return repeat;
	}
}