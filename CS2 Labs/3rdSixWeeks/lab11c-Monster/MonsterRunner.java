

import java.util.Scanner;

public class MonsterRunner
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		//ask for name and size
		System.out.println("Enter 1st monster's name: ");
		String name = keyboard.next();
		System.out.println("Enter 1st monster's size: ");
		int size = keyboard.nextInt();
		//instantiate monster one
		Monster one = new Monster(name, size);
		//ask for name and size
		System.out.println("Enter 2nd monster's name: ");
		name = keyboard.next();
		System.out.println("Enter 2nd monster's size: ");
		size = keyboard.nextInt();
		//instantiate monster two
		Monster two = new Monster(name, size);	
		if(one.isBigger(two))
		{
			System.out.println("Monster one is bigger than Monster two.");
		}
		else if(one.isSmaller(two))
		{
			System.out.println("Monster one is smaller than Monster two.");
		}
		if(one.namesTheSame(two))
		{
			System.out.println("Monster one has the same name as Monster two.");
		}
	}
}