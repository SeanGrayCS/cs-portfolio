//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class OddToEvenRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		int[] ray = new int[100];
		System.out.print("Enter a string of integers separated by commas: ");
		String input = keyboard.nextLine();
		int nextIndex = 0;
		int lastComma = -1;
		if(input.length()>0)
		{
			if(input.charAt(0) == '[')
			{
				input = input.substring(1, input.length());
			}
			if(input.charAt(input.length() - 1) == ']')
			{
				input = input.substring(0, input.length() - 1);
			}
			for(int i = 0; i < input.length(); i++)
			{
				if(input.charAt(i) == ',')
				{
					ray[nextIndex] = Integer.valueOf(input.substring(lastComma + 1, i));
					lastComma = i;
					nextIndex++;
				}
				if(i == input.length())
				{
					ray[99] = Integer.valueOf(input.substring(lastComma + 1, input.length()));
				}
			}
			System.out.println(RayFirst.go(ray));
		}
		else
		{
			System.out.println(false);
		}
	}
}