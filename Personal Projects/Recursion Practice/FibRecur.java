
public class FibRecur {

	public static void main(String[] args) {
		fibonacci(1, 1, 46);
	}
	
	public static void fibonacci(int first, int second, int kth) {
		if (kth == 1)
		{
			System.out.println(first);
			return;
		}
		fibonacci(second, first + second, kth - 1);
	}
}
