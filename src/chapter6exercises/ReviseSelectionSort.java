package chapter6exercises;

import java.util.Arrays;

public class ReviseSelectionSort {

	public static void selectionSort(double[] arr) {
		for(int i = 0; i < arr.length - 1; i++) {
			
			double max = arr[i];
			int maxIndex = i;
			
			for(int j = i + 1; j < arr.length; j++) {
				if(max < arr[j]) {
					max = arr[j];
					maxIndex = j;
				}
			}
			
			if(maxIndex != i) {
				arr[maxIndex] = arr[i];
				arr[i] = max;
			}
			
		}
	}
	public static void main(String[] args) {
		
		double[] arr = {1.6, 7.3, 7, 10.5, 6, 2.1, 4, 9, 0.5, 8.9};
		
		System.out.println("Original array: " + Arrays.toString(arr));
		
		selectionSort(arr); 
		System.out.println("Sorted array: " + Arrays.toString(arr));
	}
}
