package strings;

public class CountWords {
    public static void main(String[] args) {
        String s = "Java is easy";
        String[] words = s.split(" ");

        System.out.println("Words count: " + words.length);
    }
}

