
import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class SocialRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("social.dat"));
		int numLines = file.nextInt();
		String social;
		Social num = new Social();
		for(int i = 0; i<numLines;i++)
		{
			social = file.next();
			num.setSocial(social);
			System.out.println("SS# " + social + " has a sum of " + num.getSum());
		}
	}
}