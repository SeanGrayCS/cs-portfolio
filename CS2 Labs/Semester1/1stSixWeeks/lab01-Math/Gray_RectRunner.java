/**
 * @(#)Gray_RectRunner.java
 *
 *
 * @author 
 * @version 1.00 2019/9/20
 */

import java.util.Scanner;

public class Gray_RectRunner
{
	
	public static void main(String[] args )
	{
		
		Scanner kb = new Scanner( System.in );
		System.out.print( "Enter the length :: " );
		double length = kb.nextDouble();
		System.out.print( "Enter the width :: " );		
		double width = kb.nextDouble();
		double perimeter = (length * 2) + (width * 2);
		
		System.out.println("The perimeter is: "+perimeter+" ");
		
	}
	
}