package chapter6exercises;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoSortedLists {
	
	public static void sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int min = arr[i];
			int minIndex = i;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < min) {
					min = arr[j];
					minIndex = j; 
				}					
			}

			if (minIndex != i) {
				arr[minIndex] = arr[i];
				arr[i] = min;
			}
		}
	}

	public static int[] merge(int[] arr1, int[] arr2)  {
		int[] arr3 = new int[arr1.length + arr2.length];
		
		for (int i = 0; i < arr1.length; i++) {
			arr3[i] = arr1[i];			
		}

		for (int i = 0; i < arr2.length; i++) {
//			for(int j = arr1.length; j < arr2.length; j++) {
//				arr3[j] = arr2[i];					
//			}
			arr3[arr1.length + i] = arr2[i];
		}
		sort(arr3);
		
		return arr3;
	}

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter size of array: ");
		int size = input.nextInt();

		int[] arr1 = new int[size];
		int[] arr2 = new int[size];

		System.out.println("Enter value of array one: ");
		for (int i = 0; i < size; i++) {
			arr1[i] = input.nextInt();
		}
		System.out.println("Enter value of array two: ");
		for (int i = 0; i < size; i++) {
			arr2[i] = input.nextInt();
		}

		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));

		int[] arr = merge(arr1, arr2);
		
		System.out.println(Arrays.toString(arr));
		
		input.close();
	}
}
