public class OddEvenCounter
{
	private String line;

   public OddEvenCounter()
   {
   	 line = "0";
   }

   public OddEvenCounter(String s)
   {
   		line = s;
   }

	public void setLine(String s)
	{
		line = s;
	}

	public int getEvenCount()
	{
		int count = 0;
		int num = 0;
		for(int i=0;i<line.length();i++)
		{
			if(line.charAt(i) == ' ')
			{
				if(((Integer.valueOf(line.substring(num, i))) % 2) == 0)
				{
					count++;
				}
				num = i+1;
			}
			else if(i == line.length() - 1)
			{
				if(((Integer.valueOf(line.substring(num, line.length()))) % 2) == 0)
				{
					count++;
				}
			}
		}
		return count;
	}

	public int getOddCount()
	{
		int count = 0;
		int num = 0;
		for(int i=0;i<line.length();i++)
		{
			if(line.charAt(i) == ' ')
			{
				if(((Integer.valueOf(line.substring(num, i))) % 2) == 1)
				{
					count++;
				}
				num = i+1;
			}
			else if(i == line.length() - 1)
			{
				if(((Integer.valueOf(line.substring(num, line.length()))) % 2) == 1)
				{
					count++;
				}
			}
		}
		return count;
	}

	public String toString()
	{
		return line;
	}
}