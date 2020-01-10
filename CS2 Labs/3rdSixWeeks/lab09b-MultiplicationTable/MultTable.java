

public class MultTable
{
	private int number;
	private int stop;

	public MultTable(int n, int s)
	{
		number = n;
		stop = s;
	}

	public String toString()
	{
		String table = "";
		int multNumber = 0;
		for(int i=1; i<=stop; i++)
		{
			multNumber = number * i;
			table = table + i + "\t" + multNumber + "\n";
		}
		return table;
	}
}