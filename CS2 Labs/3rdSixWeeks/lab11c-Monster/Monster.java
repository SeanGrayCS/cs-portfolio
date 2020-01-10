public class Monster
{
	private String name;
	private int size;
	public Monster(String n, int s)
	{
		name = n;
		size = s;
	}
	public boolean isBigger(Object m)
	{
		Monster other = (Monster)m;
		return size > other.getSize();
	}
	public boolean isSmaller(Object m)
	{
		Monster other = (Monster)m;
		return size < other.getSize();
	}
	public boolean namesTheSame(Object m)
	{
		Monster other = (Monster)m;
		return name == other.toString();
	}
	public int getSize()
	{
		return size;
	}
	public String toString()
	{
		return name;
	}
}

//design your Monster class
//write all code for your Monster class here
//test your Monster class with the MonsterRunner