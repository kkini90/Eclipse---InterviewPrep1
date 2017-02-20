public class removechar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String remove = "k";
		String str = "karthik kini";

		char[] s = str.toCharArray();
		char[] r = remove.toCharArray();

		boolean[] flags = new boolean[128];
		int dst = 0;

		for (int i = 0; i < r.length; i++) {
			flags[r[i]] = true;
		}
		for (int i = 0; i < s.length; ++i) {
			if (!flags[s[i]]) {
				s[dst++] = s[i];
			}
		}
		s[dst] = '\0';
		int z=0;
		while(s[z] != '\0'){
			System.out.println(s[z]);
			z++;
		}			
	}
}
