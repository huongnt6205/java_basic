package chapter3andchapter4exercises;

import java.util.Scanner;

public class ComputePI {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Nhập số nguyên: ");
		int number = input.nextInt();
		
		System.out.print("Nhập số nguyên i: ");
		int i = input.nextInt(); //i = 10000, 20000, 100000
		double pi = 0;
//		for(int j = 1; j < number; j += 2 ) {
//			pi = 4 * ( (1/j) + (Math.pow((-1), (i + 1)) / (2 * i - 1)));
//		}
		input.close();
		
		for(i = 1; i<= number; i++ ) {
			double s = Math.pow((-1), (i + 1)) / (2 * i - 1);	
			pi += s;
		}
		pi *= 4;	
		System.out.println("Kết quả của PI là: " + pi);
		
	}

}
