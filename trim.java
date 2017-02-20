
public class trim {

	static int i,j;
	public static void main(String[] args) {
		alltrim("  karthik   ");

	}
	
	static void alltrim(String str){
		 
		for(i=0;i<str.length();i++){
			char ch = str.charAt(i);
			if(ch!=' ')break;
		}
		for(j=str.length()-1;j>=0;j--){
			char ch = str.charAt(j);
			if(ch!=' ')break;
		}
		
		for(int k=i;k<=j;k++){
			System.out.println(str.charAt(k));
		}		
	}
}
