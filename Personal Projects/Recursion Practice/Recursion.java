public class Recursion {
	public static void main(String[] args) {
		moveStack(100, 1, 2, 3);
	}
	
	public static void moveStack(int disks, int from, int to, int extraTower) {
		if (disks == 0)
			return;
		moveStack(disks - 1, from, extraTower, to);
		System.out.println(from + " " + to);
		moveStack(disks - 1, extraTower, to, from);
	}
}
