//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sean Gray

public class Fibonacci
{
	//instance variable
	private int size;
	private int[] fib;

	//constructors
	public Fibonacci(int s) {
		size = s;
		fib = new int[size];
	}
	
	//set method
	public void setSize(int s) {
		size = s;
		fib = new int[size];
	}
	
	//get method
	public int getNum(int in) {
		if(in > size)
		{
			return -1;
		}
		if(size > 0)
		{
			fib[0] = 1;
			if(size > 1)
			{
				fib[1] = 1;
				for(int i = 2; i < size; i++)
				{
					fib[i] = fib[i-1] + fib[i-2];
				}
			}
		}
		return fib[in-1];
	}
	
	//toString
	public String toString() {
		return "" + size;
	}
}