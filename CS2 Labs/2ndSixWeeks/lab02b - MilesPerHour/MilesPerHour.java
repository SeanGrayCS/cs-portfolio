//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sean Gray

public class MilesPerHour
{
	public static long getMPH(int dist, int hrs, int mins )
	{
		
		double mph = 0;
		double hours = hrs;
		double minutes = mins;
		double hoursAndMinutes = hours + (minutes/60.0);
		mph = distance / hoursAndMinutes;
		long MPH = Math.round(mph);
		return MPH;
		
	}
}

