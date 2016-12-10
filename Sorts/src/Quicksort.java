
public class Quicksort {
	
	public static void quickSort(double[] data, int lo, int hi) {
		if(hi>lo) {
			int pivot = findMedianOfThree(data, lo, hi);
			int newPivotIndex = partition(data, lo, hi, pivot);
			quickSort(data, lo, newPivotIndex-1);
			quickSort(data, newPivotIndex+1, hi);
		}
	}
	
	public static int partition(double[] array, int lo, int hi, int pivot) {
		double pivotValue = array[pivot];
		int left = lo+1;
		int right = hi;
		swap(array, lo, pivot);
		while(left<right) {
			if(array[left]>pivotValue) {
				swap(array,left, right);
				right--;
			} else {
				left++;
			}
		}
		if(array[left] > pivotValue) left--;
		swap(array,lo, left);
		return left;
	}
	
	public static void swap(double[] array, int i , int j) {
		double temp = array[i];
		array[i] = array[j];
		array[j] = temp;
		
	}
	public static int findMedianOfThree(double[] data, int low, int high) {
		double lo = data[low];
		double mid = data[(low+high)/2];
		double hi = data[high];
		
		if(lo > mid && lo > hi) {
			return mid>hi? (low+high)/2:high;
		}
		else if (mid > lo && mid > hi) {
			return lo>hi?low:high;
		}
		else return lo>mid? low:(low + high)/2;
	}
	
}
