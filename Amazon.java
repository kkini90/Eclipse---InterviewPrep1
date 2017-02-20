public class Amazon {

	public static void main(String[] args) {
		int seqLimit = 1;
		int limit = 0;
		int count =0;
			
		for( int  i=0 ;i<=seqLimit ;i++){
			int num = i;int r;
			while(num !=0){
				r = num %10;
				if(r ==limit)count++;
				num/=10;
			}
		}		
		System.out.println(count);
	}
}
