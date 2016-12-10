import java.util.Arrays;

public class TestCases {

	public static void main(String [] args) {
		double[] test = MergeSort.genRandomArray(2200000);
		double[] test2 = Arrays.copyOf(test, test.length);
		System.out.println("Unsorted Array: " + toStringy(test));
		double x = System.currentTimeMillis();
		Quicksort.quickSort(test, 0, test.length-1);
		double y = System.currentTimeMillis();
		System.out.println("Sorted Array: " + toStringy(test));
		System.out.println("Time: " + (int)(y-x) + "ms");
		
		System.out.println("Unsorted Array: " + toStringy(test2));
		x = System.currentTimeMillis();
		Arrays.sort(test2);
		y = System.currentTimeMillis();
		System.out.println("Sorted Array: " + toStringy(test2));
		System.out.println("Time: " + (int)(y-x) + "ms");
	}
	public static String toStringy(double[] a) {
		String result = "[";
		if(a.length < 5) return null;
		for(int i = 0; i < 5; i++) {
			result +=a[i] + ", ";
		}
		result += a[5] + "...]";
		return result;
	}

}


