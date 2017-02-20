import java.util.HashSet;
import java.util.Iterator;

public class add3num {

	public static void main(String[] args) {
		boolean value = check();
		System.out.println(value);
	}

	private static boolean check() {

		int[] array = new int[] { 1, 2, 3 };
		HashSet<Integer> hashSet = new HashSet<Integer>();
		for (Integer num : array) {
			hashSet.add(num);
		}

		for (int i = 0; i < array.length-1; i++) {
			for (int j = i+1; j < array.length; j++) {
				if (hashSet.contains(-array[i] - array[j]))
					return true;
			}
		}
		return false;
	}
}
