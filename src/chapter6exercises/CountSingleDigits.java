package chapter6exercises;

import java.util.Arrays;

public class CountSingleDigits {

	public static void main(String[] args) {

		int[] arr = new int[10];
		int[] count = new int[10];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10);
			int index = arr[i];
			count[index]++;
		}
		System.out.println(Arrays.toString(arr));
		
		for(int i = 1; i < count.length; i++) {
			System.out.println(i + " xuất hiện " +count[i]+ " lần.");
		}
	}
}
