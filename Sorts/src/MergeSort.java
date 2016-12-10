
public class MergeSort {
	public static double[] merge(double[] a, double[] b) {
		double[] result = new double[a.length + b.length];
		int i = 0;
		int j = 0;
		int k = 0;
		while(k < b.length && j < a.length ) {
			if(a[j] >= b[k]) result[i++] = b[k++];
			else result[i++] = a[j++];

		}
		while(k < b.length) result[i++] = b[k++];
		while(j < a.length) result[i++] = a[j++];
		return result;
		
	}
	public static double[] mergeSort(double[] array) {
		if(array.length == 0 || array.length == 1) return array;
		double[] left = new double[array.length/2];
		double[] right = new double[(array.length%2 == 1) ? array.length/2 + 1: array.length/2];
		for(int i = 0; i < array.length; i++) {
			if(i < array.length/2) left[i] = array[i];
			else right[i-left.length] = array[i];
		}
		left = mergeSort(left);
		right = mergeSort(right);
		return merge(left, right);
	}
	
	public static double[] genRandomArray(int length) {
		double[] result = new double[length];
		for(int i = 0; i<length; i++) result[i] = (int)(Math.random() * length) * 1.;
		return result;
	}
	
}
