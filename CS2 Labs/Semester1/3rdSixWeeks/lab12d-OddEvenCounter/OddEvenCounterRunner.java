import java.util.Scanner;

public class OddEvenCounterRunner
{
   	public static void main(String args[])
   	{
   		Scanner keyboard = new Scanner(System.in);
   		System.out.println("Enter your line: ");
   		String line = keyboard.nextLine();
   		OddEvenCounter counter = new OddEvenCounter(line);
   		System.out.println(line);
   		System.out.println("even count = " + counter.getEvenCount());
   		System.out.println("odd count = " + counter.getOddCount());
	}
}