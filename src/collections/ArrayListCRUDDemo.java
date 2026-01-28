package collections;

import java.util.ArrayList;

public class ArrayListCRUDDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");

        list.remove("Python");     // delete
        list.set(1, "Spring");     // update

        System.out.println(list);
    }
}

