
public class spaceCountStr {
	
	static int count=0;
	public static int check(String str){
		 char ch[]= new char[str.length()];
		 for (int i=0;i<str.length();i++){
			 ch[i]=str.charAt(i);
			 if((i>0 && ch[i]!=' ' && ch[i-1]== ' ') ||(i==0 && ch[0]!=' ')){
				 count++;
			 }			 
		 }		
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println(spaceCountStr.check(" This is karthik kini a"));

	}

}
