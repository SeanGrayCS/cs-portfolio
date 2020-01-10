//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sean Gray
//Date - 10/7/19

import java.lang.Math;

public class Triangle
{
	private int sideA, sideB, sideC;
	private double perimeter;

	public Triangle(int a, int b, int c)
	{
		sideA = a;
		sideB = b;
		sideC = c;
	}

	public void calcPerimeter( )
	{
		perimeter = sideA + sideB + sideC;
	}

	public double getArea( )
	{
		double side = 0;
		side = perimeter / 2;
		double area = 0;
		area = Math.sqrt(side * (side-sideA) * (side-sideB) * (side-sideC));
		return area;
	}
}