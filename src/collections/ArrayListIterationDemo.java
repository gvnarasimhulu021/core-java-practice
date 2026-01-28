package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterationDemo {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);

		// for-each loop
		for (int i : list) {
			System.out.println(i);
		}

		// iterator
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
