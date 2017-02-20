public class strPermutation {
	
	//Permutations of a string
	
	private final String in; 
	private boolean[] used;
	private StringBuilder out = new StringBuilder();
	
	public strPermutation(String str){
		in = str;
		used = new boolean[in.length()];
	}
	public void permute(){		
		if(in.length() ==  out.length()){
			System.out.println(out);
			return;
		}
		for(int i=0;i<in.length();++i){
			if(used[i])continue;
			out.append(in.charAt(i));
			used[i]=true;
			permute();
			used[i]=false;
			out.setLength(out.length()-1);
		}
	}
	
	public static void main(String[] args){
    	strPermutation c= new strPermutation("abc");
    	c.permute();
    }
}

//Time : n*n!
//http://www.geeksforgeeks.org/write-a-c-program-to-print-all-permutations-of-a-given-string/
//follow up https://leetcode.com/problems/letter-combinations-of-a-phone-number/