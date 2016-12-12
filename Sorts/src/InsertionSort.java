
public class InsertionSort {
	public static void insertionSort(double[] array) {
		
		for(int i = 1; i<array.length; i++) {
			int j = i;
			while(j>0 && array[j-1] > array[j]) {//swaps array[j] through the array comparing each number with the one before it until j reaches where it is supposed to be
				Quicksort.swap(array, j, j-1);//using the swap method from Quicksort
				j--;
			}
		}
	}
}
