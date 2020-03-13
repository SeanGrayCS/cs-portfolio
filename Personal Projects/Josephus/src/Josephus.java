import java.util.ArrayList;

public class Josephus {
	public static void main(String[] args) {
		int numPositions = 127;
		for (int i = 1; i <= numPositions; i++) {
			ArrayList<Integer> positions = new ArrayList<Integer>();
			for (int j = 1; j <= i; j++) {
				positions.add(j);
			}
			System.out.print(i + ": ");
			findPosition(positions, true);
			System.out.print("\n");
		}
	}

	public static void findPosition(ArrayList<Integer> positions, boolean removeEven) {
		if (positions.size() == 1) {
			System.out.print(positions.get(0));
			return;
		}
		if (removeEven) {
			int last = 1;
			for (int i = 1; i < positions.size(); i += 2) {
				positions.set(i, 0);
				last = i;
			}
			if (last != positions.size() - 1) {
				removeEven = false;
			}
		} else {
			int last = 0;
			for (int i = 0; i < positions.size(); i += 2) {
				positions.set(i, 0);
				last = i;
			}
			if (last == positions.size() - 1) {
				removeEven = true;
			}
		}
		for (int i = 0; i < positions.size(); i++) {
			if (positions.get(i) == 0) {
				positions.remove(i);
			}
		}
		findPosition(positions, removeEven);
	}
}