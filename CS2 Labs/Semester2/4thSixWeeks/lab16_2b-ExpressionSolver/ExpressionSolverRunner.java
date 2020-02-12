/**
 * ExpressionSolverRunner.java 2/11/2020
 *
 * @author - Sean Gray
 * @author - Period 1
 * @author - Id 902073
 *
 */

import static java.lang.Integer.*;


public class ExpressionSolverRunner
{
	public static void main(String[] args)
	{
		ExpressionSolver test = new ExpressionSolver("3 + 5"); //make ExpressionSolver test with the first values
		//test and print each value set
		System.out.println(test);
		test.setExpression("3 * 5");
		System.out.println(test);
		test.setExpression("3 - 5");
		System.out.println(test);
		test.setExpression("3 / 5");
		System.out.println(test);
		test.setExpression("5 / 5 * 2 + 8 / 2 + 5");
		System.out.println(test);
		test.setExpression("5 * 5 + 2 / 2 - 8 + 5 * 5 - 2");
		System.out.println(test);
	}
}