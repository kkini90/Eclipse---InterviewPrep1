
public class Anagram1 {
	
	static boolean check(String s,String t){
		if(s.length()!=t.length()){
			return false;
		}
		int[] letters = new int[256];
		
		char[] charSet = s.toCharArray();
		for(char c : charSet){ 
			letters[c]++;
		}
		
		for(int i=0;i<t.length();i++){
			int val =(int)t.charAt(i);
			if(--letters[val]<0){
				return false;
			}
		}
		return true;
		
	}
	public static void main(String[] args) {
		System.out.println(Anagram1.check("dog","god"));
	}
}
