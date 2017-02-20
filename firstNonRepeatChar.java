import java.util.HashMap;


public class firstNonRepeatChar {

	public static Character check(String str){
		
		HashMap<Character,Integer> charMap =  new HashMap<Character,Integer>();
		for(int i=0;i<str.length();i++){
			Character c = str.charAt(i);
			if(charMap.containsKey(c)){
				charMap.put(c, charMap.get(c) + 1);
			}else{
				charMap.put(c, 1);
			}
		}
		
		for(int i=0;i<str.length();i++){
			Character c = str.charAt(i);
			if(charMap.get(c) == 1){
				return c;
			}
		}		
		return null;
	}
	public static void main(String[] args) {
		Character c = firstNonRepeatChar.check("teeter");
		System.out.println(c);

	}

}
