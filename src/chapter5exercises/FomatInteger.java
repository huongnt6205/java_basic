package chapter5exercises;

import java.util.Scanner;

public class FomatInteger {

	public static String format(int number, int width) {
		String numStr = Integer.toString(number);

		if (numStr.length() >= width) {
			return numStr;
		}
		
		
		StringBuilder formatNumber = new StringBuilder();
		
		for(int i = 0; i < width - numStr.length(); i++) {
			formatNumber.append('0');
		}
		formatNumber.append(numStr);
		
		return formatNumber.toString();
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Nhập một số nguyên bất kì: ");
		int number = input.nextInt();

		System.out.print("Nhập chiều rộng của số nguyen đó: ");
		int width = input.nextInt();
		
		String formatNumberInteger = format(number, width);
		
		System.out.println("format(" + number + ", " + width + ") là:  " + formatNumberInteger);
		

		input.close();
	}

}
