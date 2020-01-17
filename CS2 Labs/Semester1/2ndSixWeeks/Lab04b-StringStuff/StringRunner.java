//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sean Gray

import java.util.Scanner;

public class StringRunner
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter a word :: ");
		String word = keyboard.next();
		
		//add test cases
		StringStuff newWord = new StringStuff(word);
		System.out.println("has first last letters :: " + newWord.getFirstLastLetters());
		System.out.println("has middle letter :: " + newWord.getMiddleLetter());
		System.out.println("has same first and last letter :: " + newWord.sameFirstLastLetters());
	}
}