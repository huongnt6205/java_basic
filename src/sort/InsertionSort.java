package sort;

import java.util.Arrays;

public class InsertionSort {

	public static void insertionSorts(double[] arr) {
		
		for (int i = 1; i < arr.length; i++) {
			double currentElement = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > currentElement) {
				arr[j + 1] = arr[j];
				j--;
			}

			arr[j + 1] = currentElement;
		}
	}

//	  public static void printArray(double[] arr) {
//	        for (double num : arr) {
//	            System.out.print(num + " ");
//	        }
//	        System.out.println();
//	    }
	
	public static void main(String[] args) {

		double[] arr = { 3.4, 5, 3, 3.5, 2.2, 1.9, 2 };

		System.out.println("Mảng ban đầu: arr[] = " + Arrays.toString(arr));

		insertionSorts(arr);
		System.out.println("Mảng sau khi được sắp xếp: arr[] = " + Arrays.toString(arr));
	}
}

/**
 *  int maxIndex = i;
            for (int j = i + 1; j < score.length; j++) {
                if (score[j] > score[maxIndex]) {
                    maxIndex = j;
                
 */
