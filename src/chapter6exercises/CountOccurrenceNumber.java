package chapter6exercises;

import java.util.Arrays;
import java.util.Scanner;

public class CountOccurrenceNumber {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int[] myArray = new int[10];
		System.out.println("Nhập các phần tử của mảng: ");
//		for(int i = 0; i < myArray.length; i++) {
//			System.out.printf("myArray[%d] = ", i);
//			myArray[i] = input.nextInt();
//		}		
//		int[] arr = { 2, 5, 6, 5, 4, 3, 23, 43, 2, 0 };
		
		
		int num;
		
		do {
			num = input.nextInt();
			if(num >= 1 && num <= 100) {
				myArray[num - 1]++;
			}
			
		}while(num != 0);
		
		
		
		System.out.println(Arrays.toString(myArray));
		
		input.close();
	}
}
