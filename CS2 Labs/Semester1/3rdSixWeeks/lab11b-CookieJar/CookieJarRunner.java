public class CookieJarRunner
{
	public static void main( String[] args )
	{
		CookieJar c = new CookieJar( 3000 );
		System.out.println( c.isFull( ) );	
		c.addStuff( 500 );
		System.out.println( c.isFull( ) );
		System.out.println( c.addStuff( 2000 ) );
		System.out.println( c.spaceLeft( ) );
		System.out.println( c.isFull( ) );	
		System.out.println( c.addStuff( 2000 ) );
		System.out.println( c.spaceLeft( ) );
		System.out.println( c.isFull( ) );				
	}
}