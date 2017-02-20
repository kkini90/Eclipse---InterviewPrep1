
public class NumPalindrome {
	
	public static void main(String[] args) {
		int n =122;
		int reverse = NumPalindrome.check(n);
		if(reverse == n){
			System.out.println("Palindrome");
		}else{
			System.out.println("Not palindrome");
		}
	}

	private static int check(int number) {
		int remainder,reverse =0 ;
		while(number !=0){
			 remainder = number%10;
			 reverse = reverse *10 + remainder;
			number/=10;		
		}
		return reverse;		
	}
}
