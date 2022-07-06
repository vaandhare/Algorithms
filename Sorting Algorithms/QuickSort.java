/*
 * QuickSort is a Divide and Conquer algorithm
 * It picks an element as pivot and partitions the given array around the picked pivot. 
 * There are many different versions of quickSort that pick pivot in different ways. such as, always pick first element as pivot, 
 * always pick last element as pivot, Pick a random element as pivot, Pick median as pivot.
 * 
 * Time Complexity = O(nLogn)
 */



public class QuickSort {

	static void swap(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	static int partition(int[] arr, int l, int r) {

		int pivot = arr[r]; 
		int index = l - 1; //Index of smaller element indicates the right position of pivot

		while(l < r) {

			if(arr[l] < pivot) {
				index++;
				swap(arr, index, l);
			}
			l++;
		}

		swap(arr, index+1, r);
		
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
		return index+1;
	}

	static void quickSort(int[] arr, int l, int r) {
		int pivotIndex = 0;

		if(l < r) {
			pivotIndex = partition(arr, l, r);

			quickSort(arr, l, pivotIndex-1);
			quickSort(arr, pivotIndex+1, r);
		}
	}
	
	public static void main(String args[]) {
		int arr[] = {39, 7, 12, 49, 27, 13};

		quickSort(arr, 0, arr.length - 1);

		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
	}

}
