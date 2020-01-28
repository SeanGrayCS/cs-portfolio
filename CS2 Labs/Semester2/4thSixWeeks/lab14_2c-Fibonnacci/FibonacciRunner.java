/**
 * FibonacciRunner.java 1/24/20
 *
 * @author - Sean Gray
 * @author - Period 1
 * @author - Id 902073
 *
 */
public class FibonacciRunner
{
	public static void main(String[] args)
	{
		//add test cases
		Fibonacci f = new Fibonacci(50); //creates the Fibonacci
		System.out.println(f.getNum(1)); //tests different indexes
		System.out.println(f.getNum(2));
		System.out.println(f.getNum(3));
		System.out.println(f.getNum(4));
		System.out.println(f.getNum(5));
		System.out.println(f.getNum(6));
		System.out.println(f.getNum(11));
		System.out.println(f.getNum(16));
		System.out.println(f.getNum(21));
		System.out.println(f.getNum(31));
		System.out.println(f.getNum(41));
		System.out.println(f.getNum(46));
		f.setSize(1); //sets a new size
		System.out.println(f.getNum(1));
		f.setSize(2); //sets a new size
		System.out.println(f.getNum(1));
		System.out.println(f.getNum(2));
		System.out.println(f.getNum(3));
	}
}