package strings;

public class ReplaceCharacter {
	public static void main(String[] args) {
		String s = "java";
		char oldChar = 'a';
		char newChar = 'o';

		String result = s.replace(oldChar, newChar);

		System.out.println(result);
	}
}
