package chapter3andchapter4exercises;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		//chuyển thập phân sang nhị phân
		
		System.out.print("Nhập một số dưới dạng thập phân: ");
		int decimal = input.nextInt();

		String binary = "";

		if (decimal == 0) {
			binary = "0";
		} else {
			while (decimal > 0) {
				int remainder = decimal % 2;
				binary = remainder + binary;
				decimal /= 2;
			}
		}
		System.out.println("Số nhị phân tương ứng là: " + binary);

		
		input.close();
	}

}
