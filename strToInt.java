
public class strToInt {

	public static int convert(String str){
		boolean isNeg = false;
		int i=0;
		int num=0;
		
		if(str.charAt(0)=='-'){
			isNeg=true;
			i=1;
		}
		
		while(i<str.length()){
			num = num*10;
			num = num + str.charAt(i++)-'0';
		}
		
		if(isNeg)
			num = -num;
		
		return num;
	}
	public static void main(String[] args) {

		int finalDigit = strToInt.convert("-1234");
		System.out.println(finalDigit);
	}

}
