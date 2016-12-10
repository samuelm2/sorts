import java.util.Arrays;

public class TestCases {

	public static void main(String [] args) {
		double[] test = genRandomArray(2200000);
		double[] test2 = Arrays.copyOf(test, test.length);
		System.out.println("Unsorted Array: " + toStringy(test));
		double x = System.currentTimeMillis();
		Quicksort.quickSort(test, 0, test.length-1);
		double y = System.currentTimeMillis();
		System.out.println("Sorted Array: " + toStringy(test));
		System.out.println("Time: " + (int)(y-x) + "ms");//displays the sorting time in ms
		
		System.out.println("Unsorted Array: " + toStringy(test2));
		x = System.currentTimeMillis();
		Arrays.sort(test2);
		y = System.currentTimeMillis();
		System.out.println("Sorted Array: " + toStringy(test2));
		System.out.println("Time: " + (int)(y-x) + "ms");
	}
	public static String toStringy(double[] a) {//a modified array toString method that displays only the first 5 values of the array in order to test the sorts at high array lengths
		String result = "[";
		if(a.length < 5) return null;
		for(int i = 0; i < 5; i++) {
			result +=a[i] + ", ";
		}
		result += a[5] + "...]";
		return result;
	}
	public static double[] genRandomArray(int length) {//creates an array of whole-number doubles  with a specified length
		double[] result = new double[length];
		for(int i = 0; i<length; i++) result[i] = (int)(Math.random() * length) * 1.;
		return result;
	}

}


