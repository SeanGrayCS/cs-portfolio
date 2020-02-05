/**
 * ListTotal.java 02/05/2020
 *
 * @author - Sean Gray
 * @author - Period 1
 * @author - Id 902073
 */

import java.util.List;

public class ListTotal
{
	public static int go(List<Integer> ray)
	{
		int total = 0;
		for (Integer num : ray) //sum each Integer num in List ray
		{
			total += num;
		}
		return total;
	}
}