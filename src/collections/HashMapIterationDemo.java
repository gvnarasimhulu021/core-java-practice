package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapIterationDemo {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();

		map.put(101, "Narsi");
		map.put(102, "Joy");
		map.put(103, "Java");

		for (Integer key : map.keySet()) {
			System.out.println(key + " " + map.get(key));
		}
	}
}
