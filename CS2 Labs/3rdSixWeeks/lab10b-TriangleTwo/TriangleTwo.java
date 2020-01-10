

public class TriangleTwo
{
	public static String go( int size, String let )
	{
		String output="";
		for(int i=1;i<=size;i++)
		{
	 		for(int j=size;j>=i;j--)
	 		{
	 			output = output + let;
	 		}
	 		output = output + "\n";
		}
		return output + "\n";
	}
}