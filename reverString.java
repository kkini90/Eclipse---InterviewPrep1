
public class reverString {

	private static void reverse(String str){
		
		char[] charStr = new char[str.length()];
		
		for(int i=0;i<str.length();i++){
			charStr[i]= str.charAt(i);
		}
		//char[] charStr = str.toCharArray();
		for(int i=str.length()-1;i>=0;i--){
			System.out.println(charStr[i]);
		}
	}
	
	public static void main(String[] args) {
		reverString.reverse("this is karthik");

	}

}
