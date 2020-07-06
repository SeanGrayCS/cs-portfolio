import java.util.*;
import java.io.*;

public class card_sort {
	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(new File("card_sort.dat"));
		ArrayList<String[]> list = new ArrayList<String[]>();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		ArrayList<Integer> power = new ArrayList<Integer>();
		while (s.hasNextLine()) {
			String[] arr2 = s.nextLine().split("/");
			list.add(arr2);
			map.put(Integer.parseInt(arr2[1]) + Integer.parseInt(arr2[2]), list.size() - 1);
			power.add(Integer.parseInt(arr2[1]) + Integer.parseInt(arr2[2]));
		}
		Collections.sort(power);
		int last = power.get(0);
		int better = Integer.parseInt(list.get(0)[2]);
		for (int i = 1; i < power.size(); i++) {
			if (power.get(i) == last) {
				if (Integer.parseInt(list.get(map.get(power.get(i)))[2]) > better) {
					int store = power.get(i - 1);
					power.set(i - 1, power.get(i));
					power.set(i, store);
				}
			}
			last = power.get(i);
			better = Integer.parseInt(list.get(map.get(power.get(i)))[2]);
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.println(power.get(i) + " (" + list.get(map.get(power.get(i)))[0] + "/" + list.get(map.get(power.get(i)))[1] + "/" +
					list.get(map.get(power.get(i)))[2] + ")");
		}
		s.close();
	}
}