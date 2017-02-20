public class ReverseString {

	static void reverse(String str) {
		char char_set[] = str.toCharArray();
		char dest_set[] = new char[str.length()];
		
		int tokenReadPos = str.length() - 1;
		int writePos = 0;
		int wordEnd, wordStart;

		while (tokenReadPos >= 0) {
			if (char_set[tokenReadPos] == ' ') {
				dest_set[writePos++] = char_set[tokenReadPos--];
			} else {
				wordEnd = tokenReadPos;

				while (char_set[tokenReadPos] != ' ' && tokenReadPos >= 0)
					tokenReadPos--;
				wordStart = tokenReadPos + 1;
				while (wordStart <= wordEnd)
					dest_set[writePos++] = char_set[wordStart++];
			}
		}

		tokenReadPos = 0;
		while (tokenReadPos < dest_set.length) {
			System.out.print(dest_set[tokenReadPos]);
			tokenReadPos++;
		}

	}

	public static void main(String[] args) {
		ReverseString.reverse(" This is Karthik ");

	}

}
