
public class Anagram {
	public static String sort(String s) {
		char[] content = s.toCharArray();
		java.util.Arrays.sort(content);
		return new String(content);
	}

	static boolean check(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		return sort(s).equals(sort(t));
	}

	public static void main(String[] args) {
		boolean value = Anagram.check("dig", "god");
		System.out.println(value);
	}
}
