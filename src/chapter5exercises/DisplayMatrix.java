package chapter5exercises;

import java.util.Scanner;

public class DisplayMatrix {

	public static void printMatrix(int n) {
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				int num = (int) (Math.random() * 2);

				System.out.print(num + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Nhập n: ");
		int n = input.nextInt();
		
		printMatrix(n);
		
		input.close();
	}
}
