/**
 * Fibonacci.java 1/24/20
 *
 * @author - Sean Gray
 * @author - Period 1
 * @author - Id 902073
 *
 */
public class Fibonacci
{
	//instance variables
	private int size;
	private int[] fib;

	//constructors
	public Fibonacci(int s)
	{
		size = s;
		fib = new int[size];
		if (size > 0) //creates the array
		{
			fib[0] = 1;
			if (size > 1)
			{
				fib[1] = 1;
				for (int i = 2; i < size; i++)
				{
					fib[i] = fib[i - 1] + fib[i - 2];
				}
			}
		}
	}

	//set method
	public void setSize(int s)
	{
		size = s;
		fib = new int[size];
		if (size > 0) //creates the array
		{
			fib[0] = 1;
			if (size > 1)
			{
				fib[1] = 1;
				for (int i = 2; i < size; i++)
				{
					fib[i] = fib[i - 1] + fib[i - 2];
				}
			}
		}
	}

	//get method
	public int getNum(int in)
	{
		if (in > size) //checks for index out of range
		{
			return -1;
		}
		return fib[in - 1]; //returns the number
	}

	//toString
	public String toString()
	{
		return "" + size;
	}
}