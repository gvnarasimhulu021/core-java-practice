package collections;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("Java");
        set.add("Spring");
        set.add("Java");   // duplicate
        set.add("SQL");

        System.out.println(set);
    }
}

