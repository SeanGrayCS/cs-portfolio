/**
 * Histogram.java 1/24/20
 *
 * @author - Sean Gray
 * @author - Period 1
 * @author - Id 902073
 *
 */
import java.util.Scanner;
public class Histogram
{
	//instance variables
	private int[] numCount;

	//constructors
	public Histogram(String line, int size )
	{
		int nextInt;
		Scanner chop = new Scanner(line);
		numCount = new int[size];
		while (chop.hasNextInt()) //chops the input into a histogram
		{
			nextInt = chop.nextInt();
			if (nextInt >= 0 && nextInt < size)
			{
				numCount[nextInt] += 1;
			}
		}
	}

	//resets the Histogram
	public void reset(String line, int size)
	{
		int nextInt;
		Scanner chop = new Scanner(line);
		numCount = new int[size];
		while (chop.hasNextInt()) //chops the input into a histogram
		{
			nextInt = chop.nextInt();
			if (nextInt >= 0 && nextInt < size)
			{
				numCount[nextInt] += 1;
			}
		}
	}

	//changes one index of the Histogram
	public void changeCount( int v, int a )
	{
		if (v < numCount.length && v >= 0)
		{
			numCount[v] += a;
		}
	}

	//returns max value in the Histogram
	public int getMax()
	{
		int output = 0;
		int amount = numCount[0];
		for (int i = 0; i < numCount.length; i++) //finds the max value
		{
			if (numCount[i] > amount)
			{
				output = i;
				amount = numCount[i];
			}
		}
		return output;
	}

	public String toString()
	{
		String output = "";
		for (int i = 0; i < numCount.length; i++) //returns the Histogram in a readable format
		{
			output += i + " - " + numCount[i] + " | ";
		}
		return output;
	}
}