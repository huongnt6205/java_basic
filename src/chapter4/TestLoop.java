package chapter4;

import java.util.Scanner; 

public class TestLoop {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Nhập number: ");
		int number = input.nextInt();
		
		while(number < 10) {
			System.out.println("Chào mừng đến với Eclipse!");
			number++;
		}
		
		int sum = 0, i = 1;
		while (i < 10) {
		sum = sum + i;
		i++;
		}
		System.out.println("\nsum is " + sum);
		
		input.close();
	}
}
