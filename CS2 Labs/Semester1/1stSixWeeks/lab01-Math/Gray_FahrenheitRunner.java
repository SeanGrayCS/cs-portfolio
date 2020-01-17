/**
 * @(#)Gray_FahrenheitRunner.java
 *
 *
 * @author 
 * @version 1.00 2019/9/20
 */

import java.util.Scanner;

public class Gray_FahrenheitRunner
{
	
	public static void main( String[] args )
	{
		
		Scanner kb = new Scanner( System.in );
		System.out.print( "Enter the fahrenheit value :: " );
		double f = kb.nextDouble();
		double c = (f - 32) * (5.0 / 9.0);
		System.out.println(+c+" degrees Celsius");
		
	}
	
}