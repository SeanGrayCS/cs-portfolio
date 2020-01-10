

public class Social
{
   private String socialNum;

	public Social()
	{
		socialNum = "";
	}

	public Social(String soc)
	{
		socialNum = soc;
	}

	public void setSocial(String soc)
	{
		socialNum = soc;
	}

	public int getSum()
	{
		int sum = 0;
		int num = 0;
		for(int i = 0; i<socialNum.length(); i++)
		{
			if(socialNum.charAt(i) == '-')
			{
				sum += Integer.valueOf(socialNum.substring(num, i));
				num = i+1;
			}
			else if(i == socialNum.length() - 1)
			{
				sum += Integer.valueOf(socialNum.substring(num, socialNum.length()));
			}
		}
		return sum;
	}

	public String toString()
	{
		return socialNum;
	}
}