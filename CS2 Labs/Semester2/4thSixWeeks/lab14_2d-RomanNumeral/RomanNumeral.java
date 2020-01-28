/**
 * RomanNumeral.java 1/28/20
 *
 * @author - Sean Gray
 * @author - Period 1
 * @author - Id 902073
 *
 */
import static java.lang.System.*;

public class RomanNumeral
{
	//class variables
	private static final int[] NUMBERS = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
	private static final String[] LETTERS = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
	//instance variables
	private Integer number;
	private String roman;

	//constructors
	public RomanNumeral(String str)
	{
		number = 0;
		roman = str;
	}

	public RomanNumeral(Integer orig)
	{
		number = orig;
		roman = "";
	}

	//mutators
	public void setNumber(Integer num)
	{
		number = num; //changes number
	}

	public void setRoman(String rom)
	{
		roman = rom; //changes roman numeral
	}

	//returns number from roman numeral
	public Integer getNumber()
	{
		number = 0;
		int i = 0;
		while (i < roman.length()) //finds number
		{
			for (int j = 0; j < LETTERS.length; j++)
			{
				if ((i + LETTERS[j].length()) <= roman.length())
				{
					if (LETTERS[j].equals(roman.substring(i, i + LETTERS[j].length())))
					{
						number += NUMBERS[j];
						i += LETTERS[j].length();
						i--;
						break;
					}
				}
			}
			i++;
		}
		return number;
	}

	//returns roman numeral from number
	public String toString()
	{
		roman = "";
		for (int i = 0; i < NUMBERS.length; i++) //finds roman numeral
		{
			while (NUMBERS[i] <= number)
			{
				roman += LETTERS[i];
				number -= NUMBERS[i];
			}
		}
		return roman + "\n";
	}
}