
public class Quicksort {
	
	public static void quickSort(double[] data, int lo, int hi) {
		if(hi>lo) {
			int pivot = findMedianOfThree(data, lo, hi);//passes the findMedianOfThree value as  the pivot in order to find the pivot that will most likely prevent O(n^2) case
			int newPivotIndex = partition(data, lo, hi, pivot);
			quickSort(data, lo, newPivotIndex-1);
			quickSort(data, newPivotIndex+1, hi);
		}
	}
	
	public static int partition(double[] array, int lo, int hi, int pivot) {//partition that uses a  the value of a given index to as the pivot
		double pivotValue = array[pivot];
		int left = lo+1;
		int right = hi;
		swap(array, lo, pivot);//temporarily puts the pivot in the first slot of the section that is being partitioned
		while(left<right) {
			if(array[left]>pivotValue) {
				swap(array,left, right);
				right--;
			} else {
				left++;
			}
		}
		if(array[left] > pivotValue) left--;//if the center value is more than the pivot, decrement the slot that will be swapped with the pivot
		swap(array,lo, left);//returns the pivot to its final resting point
		return left;
	}
	
	public static void swap(double[] array, int i , int j) {
		double temp = array[i];
		array[i] = array[j];
		array[j] = temp;
		
	}
	public static int findMedianOfThree(double[] data, int low, int high) {//returns the index of the median of the lowest, middle, and highest value of an array
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
