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
	}

	public RomanNumeral(Integer orig)
	{
		number = orig;
		roman = "";
		for (int i = 0; i < NUMBERS.length; i++) //finds roman numeral
		{
			while (NUMBERS[i] <= number)
			{
				roman += LETTERS[i];
				number -= NUMBERS[i];
			}
		}
	}

	//mutators
	public void setNumber(Integer num)
	{
		number = num; //changes number
		roman = "";
		for (int i = 0; i < NUMBERS.length; i++) //finds roman numeral
		{
			while (NUMBERS[i] <= number)
			{
				roman += LETTERS[i];
				number -= NUMBERS[i];
			}
		}
	}

	public void setRoman(String rom)
	{
		roman = rom; //changes roman numeral
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
	}

	//returns number from roman numeral
	public Integer getNumber()
	{
		return number;
	}

	//returns roman numeral from number
	public String toString()
	{
		return roman + "\n";
	}
}