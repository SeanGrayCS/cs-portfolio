
//design your CookieJar class
//write all code for your CookieJar class here
//test your CookieJar class with the CookieJarRunner

public class CookieJar
{
	private int capacity;
	private int cookies;
	public CookieJar(int c)
	{
		capacity = c;
		cookies = 0;
	}
	public int addStuff(int s)
	{
		if((cookies + s)<=capacity)
		{
			cookies += s;
			return 0;
		}
		int cookiesLeft = (s + cookies) - capacity;
		cookies = capacity;
		return cookiesLeft;
	}
	public boolean isFull()
	{
		return cookies>=capacity;
	}
	public int spaceLeft()
	{
		return capacity - cookies;
	}
}