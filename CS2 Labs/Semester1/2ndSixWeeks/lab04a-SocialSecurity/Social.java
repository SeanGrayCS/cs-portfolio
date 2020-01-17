//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Sean Gray
//Date - 10/21/19
//Class - 1
//Lab  - Social Security


public class Social
{
   private String socialNum;
   private int sum;

	public Social()
	{
	}

	public Social(String soc)
	{
		socialNum = soc;
		sum = 0;
	}

	public void setWord(String w)
	{
		socialNum = w;
		sum = 0;
	}

	public void chopAndAdd()
	{
		String sub = socialNum;
		int firstIndex = socialNum.indexOf('-');
		int lastIndex = socialNum.lastIndexOf('-');
		sub = socialNum.substring(0, firstIndex);
		sum += Integer.parseInt(sub);
		sub = socialNum.substring(firstIndex + 1, lastIndex);
		sum += Integer.parseInt(sub);
		sub = socialNum.substring(lastIndex + 1, socialNum.length());
		sum += Integer.parseInt(sub);
	}

	public String toString()
	{
		return "SS# " + socialNum + " has a total of " + sum + "\n";
	}
}