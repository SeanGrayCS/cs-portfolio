//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.Scanner;

public class OddToEvenRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a string of integers separated by commas: ");
		String input = keyboard.nextLine();
		int nextIndex = 0;
		int lastComma = -1;
		if(input.charAt(0) == '[')
		{
			input = input.substring(1, input.length());
		}
		if(input.charAt(input.length() - 1) == ']')
		{
			input = input.substring(0, input.length() - 1);
		}
		int count = 0;
		for(int i = 0; i < input.length(); i++)
		{
			if(input.charAt(i) == ',')
			{
				count++;
			}
			if(i == input.length() - 1)
			{
				count++;
			}
		}
		int[] ray = new int[count];
		for(int i = 0; i < input.length(); i++)
		{
			if(input.charAt(i) == ',')
			{
				ray[nextIndex] = Integer.valueOf(input.substring(lastComma + 1, i));
				lastComma = i;
				nextIndex++;
			}
			if(i == input.length() - 1)
			{
				ray[count - 1] = Integer.valueOf(input.substring(lastComma + 1, input.length()));
			}
		}
		System.out.println("Distance from first odd # to first even #: " + RayOddToEven.go(ray));
	}
}