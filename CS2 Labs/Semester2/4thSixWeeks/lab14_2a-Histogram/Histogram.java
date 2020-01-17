//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.Scanner; 

public class Histogram
{
	private int[] numCount;

	public Histogram(String line, int size )
	{
		int nextInt;
		Scanner chop = new Scanner(line);
		numCount = new int[size];
		while(chop.hasNextInt())
		{
			nextInt = chop.nextInt();
			if(nextInt >= 0 && nextInt < size)
			{
				numCount[nextInt] += 1;
			}
		}
	}

	public void reset(String line, int size)
	{
		int nextInt;
		Scanner chop = new Scanner(line);
		numCount = new int[size];
		while(chop.hasNextInt())
		{
			nextInt = chop.nextInt();
			if(nextInt >= 0 && nextInt < size)
			{
				numCount[nextInt] += 1;
			}
		}
	}
	
	public void changeCount( int v, int a )
	{
		if(v < numCount.length && v >= 0)
		{
			numCount[v] += a;
		}
	}
	
	public int getMax()
	{
		int output = 0;
		int amount = numCount[0];
		for(int i = 0; i < numCount.length; i++)
		{
			if(numCount[i] > amount)
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
		for(int i = 0; i < numCount.length; i++)
		{
			output += i + " - " + numCount[i] + " | ";
		}
		return output;
	}
}