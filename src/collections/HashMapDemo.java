package collections;

import java.util.HashMap;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();

		map.put(1, "Java");
		map.put(2, "Spring");
		map.put(3, "SQL");

		System.out.println(map);
		System.out.println(map.get(2));
	}
}
