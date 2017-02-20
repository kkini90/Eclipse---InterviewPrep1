
public class strLength {
  static int count1=0;
 
	static int count(String str){
		char[] ch = str.toCharArray();
		for(char c:ch){
			count1++;
		}
		return count1;
	}
	public static void main(String[] args) {
		int value = strLength.count("Karthik");
		System.out.println(value);

	}

}
