
public class Fib {
	
	public static void main(String[] args) {
		int n =10;//first 10 terms
		int i =0;
		for(int c=1 ;c<=n ;c++){
			System.out.println(fib(i));
			i++;
		}
	}

	private static int fib(int n) {
		if(n==0) return 0;
		else if(n==1) return 1;
		else return(fib(n-1) + fib(n-2));		
	}
}
