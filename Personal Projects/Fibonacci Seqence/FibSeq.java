/**
 * FibSeq.java 2/2/20
 *
 * @author - Sean Gray
 *
 * @version - 1.00
 */

import java.math.BigInteger;

public class FibSeq
{
    public static void main(String[] args)
    {
    	//prints first 100 numbers of the fibonacci sequence
    	BigInteger[] fib = new BigInteger[100];
    	fib[0] = BigInteger.valueOf(1);
    	fib[1] = BigInteger.valueOf(1);
    	System.out.println(0 + ": " + 1);
    	System.out.println(1 + ": " + 1);
    	for (int i = 2; i < fib.length; i++)
    	{
    		fib[i] = fib[i - 1].add(fib[i - 2]);
    		System.out.println(i + ": " + fib[i]);
    	}
    }
}