package chapter6;

import java.util.Arrays;

public class Example5 {

	public static int[] reverse(int[] list) {
		int[] result = new int[list.length];

		/**
		 * for (int i = 0; i < list.length; i++) {
		 * 	 result[i] = list[i]; 
		 *  }
		 * for (int i = 0, j = result.length - 1; i < j; i++, j--) { 
		 *	 	int temp = result[i]; 
		 *		result[i] =result[j];
		 * 	 	result[j] = temp; 
		 *  }
		 * 
		 */

		for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
			result[j] = list[i];
		}

		return result;
	}

	public static void main(String[] args) {

		int[] list1 = { 1, 2, 3, 4, 5, 6 };
		int[] list2 = reverse(list1);

		System.out.println("Mảng ban đầu: " + Arrays.toString(list1));
		System.out.println("Mảng đảo ngược: " + Arrays.toString(list2));
	}
}
