
public class PrintPairSum {

	static void find(int [] array,int sum){
		for(int i=0;i<array.length;i++){
			int first = array[i];
			for(int j=i+1;j<array.length;j++){
				int second = array[j];
				if(first+ second== sum){
					System.out.println("Pair :"+ first +","+second);
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] array = new int[]{5,8,2,1};
		PrintPairSum.find(array,10);
	}
}
