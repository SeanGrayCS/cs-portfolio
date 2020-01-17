//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sean Gray

public class StringStuff
{
	private String word;

	public StringStuff( String w )
	{
		word = w;
	}

 	public String getFirstLastLetters()
 	{
 		return "" + word.charAt(0) + word.charAt(word.length() - 1);
	}
	
 	public String getMiddleLetter()
 	{
 		return "" + word.charAt(word.length() / 2);
	}	
	
 	public boolean sameFirstLastLetters()
 	{
 		return word.substring(0,1).equals(word.substring(word.length()-1));
	}	

 	public String toString()
 	{
 		return "" + word;
	}
}