
public class PrintPair2 {
	//O(nlogn) with O(1) space
	public static void getPairs(int[] input, int sum)
	{
		java.util.Arrays.sort(input);
		int start = 0;
		int end = input.length-1;

		while(start<end)
		{
			int s = input[start]+input[end];
			if(s == sum){
				System.out.println(input[start] +","+input[end]);
				start++;
				end--;
			}else{ 
				if(s < sum){
			           start++;
				}else{
		        	   end--;
		           }
			}
		}		
	}
	public static void main(String[] args) {
		int[] input = new int[]{1,2,3,4};
		PrintPair2.getPairs(input, 7);
	}
}
