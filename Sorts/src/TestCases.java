import java.util.Arrays;

public class TestCases {

	public static void main(String [] args) {
		double[] test = MergeSort.genRandomArray(50000000);
		System.out.println("Unsorted Array: " + MergeSort.toStringy(test));
		double x = System.currentTimeMillis();
		double[] result = MergeSort.mergeSort(test);
		double y = System.currentTimeMillis();
		System.out.println("Sorted Array: " + MergeSort.toStringy(result));
		System.out.println("Time: " + (int)(y-x) + "ms");
		
		System.out.println("Unsorted Array: " + MergeSort.toStringy(test));
		x = System.currentTimeMillis();
		Arrays.sort(test);
		y = System.currentTimeMillis();
		System.out.println("Sorted Array: " + MergeSort.toStringy(test));
		System.out.println("Time: " + (int)(y-x) + "ms");
	}
		

}


