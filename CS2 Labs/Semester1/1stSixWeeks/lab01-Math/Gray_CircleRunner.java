/**
 * @(#)Gray_CircleRunner.java
 *
 *
 * @author 
 * @version 1.00 2019/9/20
 */

import java.util.Scanner;

public class Gray_CircleRunner
{
	public static void main( String[] args )
	{
		Scanner kb = new Scanner( System.in );
		System.out.print( "Enter the radius :: " );
		double radius = kb.nextDouble();
		double area = Math.PI * Math.pow(radius, 2);
		System.out.println("Area of your circle is: "+area+" ");
		
	}
}
