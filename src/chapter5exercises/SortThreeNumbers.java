package chapter5exercises;

import java.util.Scanner;

public class SortThreeNumbers {
	
	public static void displaySortAscending(int num1, int num2, int num3) {
		int temp = 0;
		
		if(num1 > num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		if(num1 > num3) {
			temp = num1; 
			num1 = num3;
			num3 = temp;
		}
		if(num2 > num3) {
			temp = num2;
			num2 = num3;
			num3 = temp;
		}
		System.out.println(num1 + " " + num2 + " " + num3);
	}
	
	public static void displaySortDescending(int num1, int num2, int num3) {
		int temp = 0;
		
		if(num1 < num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		if(num1 < num3) {
			temp = num1;
			num1 = num3;
			num3 = temp;
		}
		if(num2 < num3) {
			temp = num2; 
			num2 = num3;
			num3 = temp;
		}
		System.out.println(num1 + " " + num2 + " " + num3);
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Nhập 3 số nguyên để săp xếp nó: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		
		
		System.out.print("Dãy số sau khi được sắp xếp tăng dần là: ");
		displaySortAscending(num1, num2, num3);
		
		System.out.print("\nDãy số sau khi được sắp xếp giảm dần là: ");
		displaySortDescending(num1, num2, num3);
		
		
		input.close();
	}
}
