//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Sean Gray



public class SocialRunner
{
	public static void main( String args[] )
	{
		//add test cases
		Social SSN = new Social("456-56-234");
		SSN.chopAndAdd();
		System.out.println(SSN.toString());
		SSN.setWord("1-1-1");
		SSN.chopAndAdd();
		System.out.println(SSN.toString());
		SSN.setWord("102-2-12");
		SSN.chopAndAdd();
		System.out.println(SSN.toString());
		SSN.setWord("0-0-0");
		SSN.chopAndAdd();
		System.out.println(SSN.toString());

	}
}