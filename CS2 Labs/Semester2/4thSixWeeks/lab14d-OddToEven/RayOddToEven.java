//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	public static int go(int[] ray)
	{
		if(ray.length < 2)
		{
			return -1;
		}
		boolean oddFound = false;
		int oddIndex = 0;
		for(int i = 0; i <ray.length; i++)
		{
			if(oddFound)
			{
				if((ray[i] % 2) == 0)
				{
					return i - oddIndex;
				}
			}
			if(!oddFound){
				if((ray[i] % 2) == 1)
				{
					oddIndex = i;
					oddFound = true;
				}
			}
		}
		return -1;
	}
}