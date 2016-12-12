import java.util.Arrays;

public class TestCases {

	public static void main(String [] args) {
		
		
		double[] test = genRandomArray(5000000);
		double[] test2 = Arrays.copyOf(test, test.length);
		double[] test3 = Arrays.copyOf(test, test.length);
		double[] test4 = Arrays.copyOf(test, test.length);
		double x;
		double y;
		
//		System.out.println("InsertionSort\nUnsorted Array: " + toStringy(test4));
//		x = System.currentTimeMillis();
//		InsertionSort.insertionSort(test4);
//		y = System.currentTimeMillis();
//		System.out.println("Sorted Array: " + toStringy(test4));
//		System.out.println("Time: " + (int)(y-x) + "ms\n");
		
		System.out.println("MergeSort\nUnsorted Array: " + toStringy(test2));
		x = System.currentTimeMillis();
		double[] test5 = MergeSort.mergeSort(test3);
		y = System.currentTimeMillis();
		System.out.println("Sorted Array: " + toStringy(test5));
		System.out.println("Time: " + (int)(y-x) + "ms\n");
		
		System.out.println("QuickSort\nUnsorted Array: " + toStringy(test));
		x = System.currentTimeMillis();
		Quicksort.quickSort(test, 0, test.length-1);
		y = System.currentTimeMillis();
		System.out.println("Sorted Array: " + toStringy(test));
		System.out.println("Time: " + (int)(y-x) + "ms\n");//displays the sorting time in ms
		
		
		System.out.println("Array.Sort\nUnsorted Array: " + toStringy(test2));
		x = System.currentTimeMillis();
		Arrays.sort(test2);
		y = System.currentTimeMillis();
		System.out.println("Sorted Array: " + toStringy(test2));
		System.out.println("Time: " + (int)(y-x) + "ms\n");
	}
	public static String toStringy(double[] a) {//a modified array toString method that displays only the first 5 values of the array in order to test the sorts at high array lengths
		String result = "[";

		for(int i = 0; i < 5 && i < a.length-1; i++) {
			result +=a[i] + ", ";
		}
		result += a[a.length > 5? 5:a.length-1];
		result += a.length>5?", ...]":"]";
		return result;
	}
	public static double[] genRandomArray(int length) {//creates an array of whole-number doubles  with a specified length
		double[] result = new double[length];
		for(int i = 0; i<length; i++) result[i] = (int)(Math.random() * length) * 1.;
		return result;
	}

}


