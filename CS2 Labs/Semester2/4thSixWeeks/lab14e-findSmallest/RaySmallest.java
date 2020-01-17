//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RaySmallest
{
	public static int go(int[] ray)
	{
		int smallest = ray[0];
		for(int num : ray)
		{
			if(num < smallest)
			{
				smallest = num;
			}
		}
		return smallest;
	}
}