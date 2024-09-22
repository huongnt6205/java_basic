package chapter5;

import java.util.Scanner;

public class Decimal2HexConversion {
	
	public static char toHexChar(int hexValue) {
		if(hexValue <= 0 && hexValue >= 0) {
			return (char) (hexValue + '0');			
		} else {
			return (char) (hexValue - 10 + 'A');
		}
	}
	
	public static String decimalToHex(int decimal) {
		String hex = "";
		
		while(decimal != 0) {
			int hexValue = decimal % 16;
			hex = toHexChar(hexValue) + hex;
			decimal = decimal / 16;
		}
		return hex;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Nhập một số dưới dạng thập phân: ");
		int decimal = input.nextInt();
		
		System.out.println(decimal + " đã chuyển sang dạng số thập lục phân là: " + decimalToHex(decimal));
		
		input.close();
	}
}
