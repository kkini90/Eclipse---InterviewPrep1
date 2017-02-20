
public class replaceSpace {
	
	static void check(char[] charSet,int length){
		int spaceCount=0,newLength=0;
	
		
		for(int i=0;i<length;i++){
			if(charSet[i] == ' '){
				spaceCount++;
			}
		}
		 newLength = length + spaceCount*2;
		 charSet[newLength]='\0';
		 for(int i=length-1;i>=0;i--){
				if(charSet[i] == ' '){
					charSet[newLength -1] = '0';
					charSet[newLength -2] = '2';
					charSet[newLength -3] = '%';
					newLength=newLength-3;
				}else{
					charSet[newLength-1]=charSet[i];
					newLength--;
				}
			}
		 for( char c : charSet){
			 System.out.println(c);
		 }
		 
	}
	public static void main(String[] args) {
		
		char charSet[] = "t h".toCharArray();
		replaceSpace.check(charSet,3);

	}

}
