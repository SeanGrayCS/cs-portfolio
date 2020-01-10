import java.util.Scanner;

public class MultTableRunner
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		int mult = keyboard.nextInt();
		int times = keyboard.nextInt();
		System.out.println(mult);
		System.out.println(times);
		
		MultTable table = new MultTable(mult, times);
		System.out.println("multiplication table for " + mult);
		System.out.println(table.toString());
	}
}