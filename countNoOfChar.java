import java.util.HashMap;
import java.util.Map;


public class countNoOfChar {

	static void count(String name){
		char ch[]=new char[name.length()];
		HashMap<Character, Integer> map= new HashMap<Character,Integer>();
		for (int i=0;i<name.length();i++){
			ch[i]=name.charAt(i);
			if(map.containsKey(ch[i])){
				map.put(ch[i], map.get(ch[i])+1);
					
			}else{
				map.put(ch[i], 1);
			}
			
		}
		//Prints hashmap entry value
		for(Map.Entry<Character, Integer> entry : map.entrySet()){
			System.out.print(entry.getKey().toString()+ ":");
			System.out.println(entry.getValue());
		}
		
	}
	public static void main(String[] args) {
		countNoOfChar.count("abbcccdddd");
	}
}
