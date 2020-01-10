import java.util.Scanner;

public class TriangleTwoRunner
{

	public static void main( String args[] )
   {
   	Scanner keyboard = new Scanner(System.in);
   	String choice = "";
		do{
			System.out.print("Enter the size of the triangle : ");
			int big = keyboard.nextInt();
			System.out.print("Enter a letter : ");
			String value = keyboard.next();
			System.out.println(TriangleTwo.go(big, value));
			System.out.print("Do you want to enter more data? ");
			choice = keyboard.next();
			}while(choice.equals("Y")||choice.equals("y"));
	
	}
}