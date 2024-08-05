package chapter4;

import java.util.Scanner;

public class TestNumberMax {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Nhập số nguyên: ");
		int number = input.nextInt();
		
		int max = number;
		
		while (number != 0) {
			number = input.nextInt();
			if (number > max)
				max = number;
		}
		System.out.println("Số lớn nhất là " + max);
		System.out.println("number " + number);
		
		input.close();

	}

}
