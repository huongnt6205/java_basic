package sort;

import java.util.Arrays;

public class SelectionSort {

	public void swap(int index1, int index2, int[] arr) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}

	public int findMinIndex(int startIndex, int[] arr) {

		int minIndex = startIndex;

		for (int i = startIndex + 1; i < arr.length; i++) {
			if (arr[minIndex] > arr[i]) {
				minIndex = i;
			}
			
		}
		return minIndex;
	}

	public void sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int minIndex = findMinIndex(i, arr);
			swap(i, minIndex, arr);
		}
	}

	public void display(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 2, 5, 7 };

		SelectionSort selectSort = new SelectionSort();
//		System.out.println(selectSort.findMinIndex(2, arr));
		selectSort.sort(arr);
		selectSort.display(arr);
	}

}
