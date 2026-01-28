package strings;

public class CountCharacters {
	public static void main(String[] args) {
		String s = "Java is powerful";
		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ') {
				count++;
			}
		}

		System.out.println("Characters count: " + count);
	}
}
