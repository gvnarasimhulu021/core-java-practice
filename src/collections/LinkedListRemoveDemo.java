package collections;

import java.util.LinkedList;

public class LinkedListRemoveDemo {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();

		list.add("A");
		list.add("B");
		list.add("C");

		list.removeFirst();
		list.removeLast();

		System.out.println(list);
	}
}
