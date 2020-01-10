public class CarRunner
{
	public static void main( String[] args )
	{
		Car c = new Car( 9000, 3000 );
		System.out.println( c.timeForOilChange( ) );	
		c.addMiles( 2000 );
		System.out.println( c.timeForOilChange( ) );	
		c.addMiles( 2000 );
		System.out.println( c.timeForOilChange( ) );						
	}
}