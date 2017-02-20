
public class numformat {

	public static void main(String[] args) {
		long num = 1234567;
		long remainder=0;
		int count=0;
		StringBuilder sb = new StringBuilder();
		
		while(num!=0){
			remainder=num%10;
			num=num/10;
			if(count==3){
				count=0;
				sb.append(",");
			}
			sb.append(remainder);
			count++;	
		}
		
		String str = sb.toString();
		for(int i=str.length()-1;i>=0;i--){
			System.out.println(str.charAt(i)); 
		}
	}

}
