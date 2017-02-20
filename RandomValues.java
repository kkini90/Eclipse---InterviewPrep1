import java.util.HashSet;
import java.util.Set;


public class RandomValues {
	
	static void print(int[] array,int sum){		
		findPair(array,sum);
	}
	//O(n) with O(n) space
	private static void findPair(int[] random, int sum) {
		if(random.length <2)return;
		Set s = new HashSet(random.length);
		
		for(int num :random){
			int target = sum - num;
			
			if(!s.contains(target)){
				s.add(num);
			}else{
				System.out.println(target + "," + num);
			}
		}		
	}

	public static void main(String[] args) {
		RandomValues.print(getRandomArray(9),10);
	}

	private static int[] getRandomArray(int length) {
		int[] array = new int[length];
		
		for(int i=0;i<length;i++){
			array[i] = (int)(Math.random()*15);
		}
		for(int i=0;i<length;i++){
			 System.out.println(array[i]);
		}
		return array;
	}
}
//http://javarevisited.blogspot.com/2014/08/how-to-find-all-pairs-in-array-of-integers-whose-sum-equal-given-number-java.html