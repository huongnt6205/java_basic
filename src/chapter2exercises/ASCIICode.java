package chapter2exercises;

import java.util.Scanner;

public class ASCIICode {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Nhập mã ASCII từ 0 - 127: ");
		int asciiCode = input.nextInt();
		
		System.out.println((char)asciiCode);
		
		input.close();
	}
}
