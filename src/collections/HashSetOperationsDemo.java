package collections;

import java.util.HashSet;

public class HashSetOperationsDemo {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();

		set.add("A");
		set.add("B");
		set.add("C");

		set.remove("B");

		System.out.println("Contains A? " + set.contains("A"));
		System.out.println(set);
	}
}
