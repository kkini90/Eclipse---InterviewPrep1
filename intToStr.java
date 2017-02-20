
public class intToStr {
	
	private static final int MAXDIGITS = 10;
	
	public static String convert(int num){
		boolean isNeg = false;
		char[] temp = new char[ MAXDIGITS +1 ];
		int i=0;
		
		if(num<0){
			isNeg= true;
			num = -num;
		}
		
		while(num!=0){
			char charNum =(char)((num%10) + '0');
			temp[i++] = charNum;
			num/=10;
		}
		
		StringBuilder sb = new StringBuilder();
		
		if(isNeg){
			sb.append("-");
		}
		
		while(i>0){
			sb.append(temp[--i]);
		}
		
		return sb.toString();
	}
	
	public static void main(String[] args) {
		String str = intToStr.convert(-1234);
		System.out.println(str);
	
	}

}
