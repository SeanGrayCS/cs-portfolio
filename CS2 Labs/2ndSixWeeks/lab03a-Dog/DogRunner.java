//(c) A+ Computer Science
//www.apluscompsci.com

public class DogRunner
{
	public static void main( String[] args )
	{
		Dog rover = new Dog("Rover");
		System.out.println(rover.getPeopleAge(7));
		rover.increaseAgeByOne();
		rover.increaseAgeByOne();
		System.out.println(rover.getPeopleAge(11));
		System.out.println(rover.getName());
		rover.increaseAgeByOne();
		rover.increaseAgeByOne();
		rover.increaseAgeByOne();
		rover.increaseAgeByOne();
		System.out.println(rover.getPeopleAge(8));
		Dog bob = new Dog("Bob", 3);
		System.out.println(bob.getName());
		System.out.println(bob.getPeopleAge(5));
	}
}