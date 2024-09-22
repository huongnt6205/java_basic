package chapter6;

import java.util.Scanner;

public class BinarySearchsKey {

	public static void printkey(int key, int[] arr) {

		int left = 0;
		int right = arr.length - 1;
		
		while(left <= right) {
			
			int mid = left + (right - left) / 2;
			
			if( arr[mid] == key) {
				System.out.println("Key found at index: " + mid);
				return;
			}
			 
			if(key < arr[mid]) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
			
		}
		System.out.println("Key not found in the array!");
		
	}

	public static void main(String[] args) {

		int[] arr = { 2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79 };

		Scanner input = new Scanner(System.in);

		System.out.print("Enter key: ");
		int key = input.nextInt();
		
		System.out.print("index key is: ");
		printkey(key, arr);

		input.close();
	}
}
