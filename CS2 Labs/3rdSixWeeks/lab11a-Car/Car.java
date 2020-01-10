public class Car
{
	private int milesDriven;
	private int milesChange;
	private int lastChange;
	public Car(int d,int c)
	{
		milesDriven = d;
		milesChange = c;
		lastChange = 0;
	}
	public void addMiles(int m)
	{
		milesDriven += m;
	}
	public boolean timeForOilChange()
	{
		if(milesDriven>=(lastChange + milesChange))
		{
			lastChange = milesDriven;
			return true;
		}
		return false;
	}
}