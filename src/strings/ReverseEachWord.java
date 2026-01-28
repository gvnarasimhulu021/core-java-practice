package strings;

public class ReverseEachWord {
	public static void main(String[] args) {
		String s = "Java is easy";
		String[] words = s.split(" ");

		for (String word : words) {
			String rev = "";
			for (int i = word.length() - 1; i >= 0; i--) {
				rev += word.charAt(i);
			}
			System.out.print(rev + " ");
		}
	}
}
