//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayFirst
{
	public static boolean go(int[] ray)
	{
		if(ray.length < 2)
		{
			return false;
		}
		int first = ray[0];
		for(int i = 0; i < ray.length; i++)
		{
			if((i != 0) && (ray[i] == first))
			{
				return true;
			}
		}
		return false;
	}
}