package chapter4;

import java.util.Scanner;

public class TestDoWhile {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		/******************/
		int data;
		int sum = 0;
		
		do {
			System.out.println("Nhập số nguyên bất kỳ(sẽ kết thúc nếu nhập 0): ");
			data = input.nextInt();
			
			sum += data;
		} while (data != 0);
		
		System.out.println("Tổng: " + sum);
		
		
		/*********************/
		int number, max;
		System.out.println("Nhập số nguyên: ");
		number = input.nextInt();
		max = 0;
		
		do {
			System.out.println("Nhập số nguyên: ");
			number  = input.nextInt();
			if(number > max) {
				max = number;
			}
		} while (number != 0);
		
		System.out.println("Số lớn nhất là: " + max);
		System.out.println("number" + number);
		
		input.close();

	}

}
