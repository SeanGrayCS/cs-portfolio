//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sean Gray

import static java.lang.System.*;

public class RomanNumeral
{
	private Integer number;
	private String roman;

	private final static int[] NUMBERS= {1000,900,500,400,100,90,50,40,10,9,5,4,1};

	private final static String[] LETTERS = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

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

	public void setNumber(Integer num)
	{
		number = num;
	}

	public void setRoman(String rom)
	{
		roman = rom;
	}

	public Integer getNumber()
	{
		number = 0;
		int i = 0;
		while(i < roman.length())
		{
			for(int j = 0; j < LETTERS.length; j++)
			{
				if((i + LETTERS[j].length()) <= roman.length())
				{
					if(LETTERS[j].equals(roman.substring(i, i + LETTERS[j].length())))
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

	public String toString()
	{
		roman = "";
		for(int i = 0; i < NUMBERS.length; i++)
		{
			while(NUMBERS[i] <= number)
			{
				roman += LETTERS[i];
				number -= NUMBERS[i];
			}
		}
		return roman + "\n";
	}
}