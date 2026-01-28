package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Product {
	int price;
	String name;

	Product(int price, String name) {
		this.price = price;
		this.name = name;
	}
}

class PriceComparator implements Comparator<Product> {
	public int compare(Product p1, Product p2) {
		return p1.price - p2.price;
	}
}

public class ComparatorByIdDemo {
	public static void main(String[] args) {
		ArrayList<Product> list = new ArrayList<>();

		list.add(new Product(500, "Mouse"));
		list.add(new Product(200, "Pen"));
		list.add(new Product(1000, "Keyboard"));

		Collections.sort(list, new PriceComparator());

		for (Product p : list) {
			System.out.println(p.price + " " + p.name);
		}
	}
}
