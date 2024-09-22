package chapter6exercises;

import java.util.Arrays;
import java.util.Scanner;

public class EliminateDuplicates {

	public static int[] eliminateDuplicates(int[] array) {
		
		int[] newArr = new int[array.length];
		int size = 0;
		
		for(int i = 0; i < array.length; i++) {
			
			boolean isDiplicate = false;
			
			for(int j = 0; j < size; j++) {
				if(array[i] == newArr[j]) {
					isDiplicate = true;
					break;
				}
			}
			
			if(!isDiplicate) {
				newArr[size++] = array[i];
			}
			
		}
		
		return Arrays.copyOf(newArr, size);
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int[] array = new int[10];

		System.out.print("Enter ten number integer: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}

		System.out.print("Mảng ban đầu: ");
		System.out.println(Arrays.toString(array));

		int[] result = eliminateDuplicates(array);
		System.out.println("Mảng sau khi được loại bỏ phẩn tử trùng lặp là: " + Arrays.toString(result));
		

		input.close();
	}
}
