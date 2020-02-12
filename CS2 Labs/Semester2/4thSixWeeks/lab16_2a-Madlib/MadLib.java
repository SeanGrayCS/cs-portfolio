/**
 * MadLib.java 2/11/2020
 *
 * @author - Sean Gray
 * @author - Period 1
 * @author - Id 902073
 *
 */

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import static java.lang.System.*;
import java.lang.Math;

public class MadLib
{
	private ArrayList<String> verbs;
	private ArrayList<String> nouns;
	private ArrayList<String> adjectives;
	private String lib;

	public MadLib()
	{
		//initialize instance variables
		verbs = new ArrayList<String>();
		nouns = new ArrayList<String>();
		adjectives = new ArrayList<String>();
		lib = "no story";
	}

	public MadLib(String fileName)
	{
		//initialize instance variables
		verbs = new ArrayList<String>();
		nouns = new ArrayList<String>();
		adjectives = new ArrayList<String>();
		//load stuff
		try
		{
			Scanner file = new Scanner(new File(fileName));
			lib = file.nextLine();
		}
		catch (Exception e)
		{
			out.println("Houston we have a problem!");
		}
		loadNouns();
		loadVerbs();
		loadAdjectives();
	}

	public void loadNouns()
	{
		//scan in nouns
		try
		{
			Scanner file = new Scanner(new File("nouns.dat"));
			while (file.hasNext())
			{
				nouns.add(file.next());
			}
		}
		catch (Exception e)
		{
			out.println("Nouns failed to load!");
		}
	}

	public void loadVerbs()
	{
		//scan in verbs
		try
		{
			Scanner file = new Scanner(new File("verbs.dat"));
			while (file.hasNext())
			{
				verbs.add(file.next());
			}
		}
		catch (Exception e)
		{
			out.println("Verbs failed to load!");
		}
	}

	public void loadAdjectives()
	{
		//scan in adjectives
		try
		{
			Scanner file = new Scanner(new File("adjectives.dat"));
			while (file.hasNext())
			{
				adjectives.add(file.next());
			}
		}
		catch (Exception e)
		{
			out.println("Adjectives failed to load!");
		}
	}

	public String getRandomVerb()
	{
		//find a random verb from verbs
		String v = verbs.get((int) ((Math.random()) * verbs.size()));
		return v;
	}

	public String getRandomNoun()
	{
		//find a random noun from nouns
		String n = nouns.get((int) ((Math.random()) * nouns.size()));
		return n;
	}

	public String getRandomAdjective()
	{
		//find a random adjective from adjectives
		String a = adjectives.get((int) ((Math.random()) * adjectives.size()));
		return a;
	}

	public String toString()
	{
		String mad = "";
		String store = "";
		Scanner chop = new Scanner(lib);
		while (chop.hasNext())
		{
			store = chop.next();
			if(store.equals("#"))
			{
				mad += getRandomNoun() + " ";
			}
			else if(store.equals("@"))
			{
				mad += getRandomVerb() + " ";
			}
			else if(store.equals("&"))
			{
				mad += getRandomAdjective() + " ";
			}
			else
			{
				mad += store + " ";
			}
		}
		return mad;
	}
}