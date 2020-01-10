//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sean Gray
//Date - 1/9/20

public class RaySumLast
{
	public static int go(int[] ray)
	{
		int length = ray.length;
		int last = ray[length - 1];
		int total = 0;
		boolean numGo = false;
		for(int num : ray)
		{
			if(num > last)
			{
				total += num;
				numGo = true;
			}
		}
		if(numGo)
		{
			return total;
		}
		return -1;
	}
}