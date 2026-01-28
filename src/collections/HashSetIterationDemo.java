package collections;

import java.util.HashSet;

public class HashSetIterationDemo {
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();

		set.add(10);
		set.add(20);
		set.add(30);

		for (int i : set) {
			System.out.println(i);
		}
	}
}
