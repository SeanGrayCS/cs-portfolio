import java.util.Scanner;

public class WordRunner
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter your word: ");
		Word word = new Word(keyboard.next());
		
		System.out.println(word.getFirstChar());
		System.out.println(word.getLastChar());
		System.out.println(word.getBackWards());		
	}
}