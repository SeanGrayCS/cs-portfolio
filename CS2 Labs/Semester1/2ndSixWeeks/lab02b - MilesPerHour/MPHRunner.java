//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sean Gray

import java.util.Scanner;

public class MPHRunner
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter the distance :: ");
		int dist = keyboard.nextInt();

		System.out.print("Enter the hours :: ");
		int hrs = keyboard.nextInt();

		System.out.print("Enter the minutes :: ");
		int mins = keyboard.nextInt();
		
		String milePlural = "mile";
		if(dist != 1) {
			milePlural = "miles";
		}
		String hourPlural = "hour";
		if(hrs != 1) {
			hourPlural = "hours";
		}
		String minutePlural = "minute";
		if(mins != 1) {
			minutePlural = "minutes";
		}
		
		long mph = MilesPerHour.getMPH(dist, hrs, mins);
		System.out.println(dist+" "+milePlural+" in "+hrs+" "+hourPlural+" and "+mins+" "+minutePlural+" = "+mph+" MPH.");

	}
}

/*
 
Sample Output : 
Enter the distance :: 45
Enter the hours :: 0
Enter the minutes :: 32

45 miles in 0 hour and 32 minutes = 84 MPH.




Enter the distance :: 96
Enter the hours :: 1
Enter the minutes :: 43

96 miles in 1 hour and 43 minutes = 56 MPH.




Enter the distance :: 100
Enter the hours :: 2
Enter the minutes :: 25

100 miles in 2 hour and 25 minutes = 41 MPH.




Enter the distance :: 50
Enter the hours :: 2
Enter the minutes :: 25

50 miles in 2 hour and 25 minutes = 21 MPH.

*/