package chapter6;

import java.util.Arrays;

public class ExampleSelectionSort {
	
	public static void swap(int index1, int index2, double[] arr) {
		
		double temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
		
	}
	
	public static void selectionSort(double[] arr) {
		for(int i = 0; i < arr.length; i++) {
			int minIndex = i;
			
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			if(minIndex != i) {
				swap(i, minIndex, arr);
			}
		}
		
	}
//	
//	public static void printArr(double[] arr) {
//		for(double num: arr) {
//			System.out.print(num + " ");
//		}
//		System.out.println();
//	}
//	
	public static void main(String[] args) {
		
		double[] arr = {3.4, 5, 3, 3.5, 2.2, 1.9, 2};
		System.out.println("Mảng ban đầu: arr[] = " + Arrays.toString(arr));
		
		selectionSort(arr);	
		System.out.println("Mảng sau khi được sắp xếp: arr[] = " + Arrays.toString(arr));
	}
}
