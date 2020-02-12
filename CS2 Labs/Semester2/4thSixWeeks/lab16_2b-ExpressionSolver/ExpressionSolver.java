/**
 * ExpressionSolver.java 2/11/2020
 *
 * @author - Sean Gray
 * @author - Period 1
 * @author - Id 902073
 *
 */

import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.Integer.*;


public class ExpressionSolver
{
	//instance variables
	private ArrayList<String> vals;
	private String orig;
	private int total;

	//constructor
	public ExpressionSolver(String s)
	{
		total = 0;
		orig = s;
		vals = new ArrayList<String>();
		Scanner chop = new Scanner(s);
		while (chop.hasNext())
		{
			vals.add(chop.next());
		}
		solveExpression();
	}

	//mutator method to change the expression
	public void setExpression(String s)
	{
		//set original string and vals
		orig = s;
		vals.clear();
		Scanner chop = new Scanner(s);
		while (chop.hasNext())
		{
			vals.add(chop.next());
		}
		solveExpression();
	}

	//solves expression using a copy of vals, and saves total to instance variable total
	public void solveExpression()
	{
		//create variables used during solving
		int op;
		int first;
		int second;
		int calc;
		boolean times = false;
		boolean add = false;
		int mult = vals.indexOf("*");
		int div = vals.indexOf("/");
		int plus = vals.indexOf("+");
		int minus = vals.indexOf("-");
		//solve for multiply and divide
		while ((vals.size() > 0) && ((mult != -1) || (div != -1)))
		{
			if (div == -1 || (mult < div && mult != -1)) //multiply
			{
				op = mult;
				times = true;
			}
			else //divide
			{
				times = false;
				op = div;
			}
			first = Integer.parseInt(vals.get(op - 1));
			second = Integer.parseInt(vals.get(op + 1));
			//calculate
			if (times)
				calc = first * second;
			else
				calc = first / second;
			vals.remove(op - 1);
			vals.remove(op - 1);
			vals.set(op - 1, "" + calc);
			mult = vals.indexOf("*");
			div = vals.indexOf("/");
		}
		plus = vals.indexOf("+");
		minus = vals.indexOf("-");
		//solve for adding and subtracting
		while ((vals.size() > 0) && ((plus != -1) || (minus != -1)))
		{
			if (minus == -1 || (plus < minus && plus != -1)) //add
			{
				op = plus;
				add = true;
			}
			else //subtract
			{
				add = false;
				op = minus;
			}
			first = Integer.parseInt(vals.get(op - 1));
			second = Integer.parseInt(vals.get(op + 1));
			//calculate
			if (add)
				calc = first + second;
			else
				calc = first - second;
			vals.remove(op - 1);
			vals.remove(op - 1);
			vals.set(op - 1, "" + calc);
			plus = vals.indexOf("+");
			minus = vals.indexOf("-");
		}
		total = Integer.parseInt(vals.get(0));
	}

	public String toString()
	{
		//add total to original string
		orig += " = " + total;
		return orig;
	}
}