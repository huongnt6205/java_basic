package chapter2;
//chuyen doi độ thanh độ C

import java.util.Scanner;

public class OperatorPrecedence {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Nhập vào nhiệt độ ở dạng độ F là: ");
		double fahrenheit = input.nextDouble();
		
		double celsius = (5.0 / 9) * (fahrenheit - 32);
		System.out.println("Nhiệt độ sau khi chuyển sang độ C là:" + celsius);
		
		input.close();
	}

}
