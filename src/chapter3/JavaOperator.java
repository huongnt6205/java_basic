package chapter3;

import java.util.Scanner;

public class JavaOperator {
	public static void main(String[] args) {
		System.out.println("Các toán tử uso sánh trong java là: <, <=, >, >=, ==, !=");
		
		System.out.println('a' < 'b');
		System.out.println('a' <= 'A');
		System.out.println('a' > 'b');
		System.out.println('a' >= 'A');
//		System.out.println('a' == 'a');
		System.out.println('a' != 'b');
		
		/**********************/
		Scanner input = new Scanner(System.in);
		
		System.out.print("Nhập số tiền: ");
		double pay = input.nextDouble();
		System.out.print("Nhập số điểm: ");
		int score = input.nextInt();
		
		if( score > 90) {
			pay = pay  * (1 + 0.03);
		}
		System.out.println("Tổng số lương là: " + pay);
		
		/***************/
		System.out.print("Nhấp số tiền: ");
		double pays = input.nextDouble();
		System.out.println("Nhấp số điểm: ");
		int scores = input.nextInt();
		if(scores > 90) {
			pays = pays * (1 + 0.03);
		}else {
			pays = pays * (1 + 0.01);
		}
		System.out.println("Tổng số lương là: " + pays);
		input.close();
	}
}	
