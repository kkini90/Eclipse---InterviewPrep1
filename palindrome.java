
public class palindrome {

	public static boolean check(String str){
		char[] charSet = str.toCharArray();
		int length = str.length();
		for(int i=0;i<length/2;i++){
			if(charSet[i] != charSet[length-i-1]){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(palindrome.check("maM"));
	}

}
