package chapter6exercises;

import java.util.Arrays;
import java.util.Scanner;

public class PartitionOfList {

	public static int partition(int[] arr) {

		int pivot = arr[0];
		int low = 1;
		int high = arr.length - 1;

		while (low <= high) {
			
			while (low <= high && arr[low] <= pivot) {
				low++;
			}
			while (low <= high && arr[high] > pivot) {
				high--;
			}
			if (low < high) {
				int temp = arr[low];
				arr[low] = arr[high];
				arr[high] = temp;
			}
			arr[0] = arr[high];
			arr[high] = pivot;

		}
		return high;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter size: ");
		int size = input.nextInt();

		int[] arr = new int[size];

		System.out.print("Enter number of Array: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.nextInt();
		}
		
		System.out.println("Original arrays: " + Arrays.toString(arr));

		int pivotIndex = partition(arr);
		
		System.out.println("The list after partitioning: " + Arrays.toString(arr));		
        System.out.println("\nPivot index: " + pivotIndex);

				
		input.close();
	}
}
