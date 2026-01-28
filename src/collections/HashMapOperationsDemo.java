package collections;

import java.util.HashMap;

public class HashMapOperationsDemo {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();

		map.put("Java", 8);
		map.put("Spring", 5);

		map.put("Java", 11); // update

		map.remove("Spring");

		System.out.println(map.containsKey("Java"));
		System.out.println(map);
	}
}
