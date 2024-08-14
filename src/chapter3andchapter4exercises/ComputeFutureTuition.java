package chapter3andchapter4exercises;

import java.util.Scanner;

public class ComputeFutureTuition {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Nhập học phí của năm nay: ");
		double tution = input.nextInt(); 	//10,000
		
		for(int year = 1; year <= 10; year++) {
			tution *= (1 + 0.05);
//			tution = tution + (tution * 0.05); 
		}
		System.out.printf("Học phí sau 10 năm là: %.2f$", tution);
		
		double total = 0;
		for(int year = 0; year < 4; year++) {
			 total += tution;
			 tution *= (1 + 0.05);
		}
		
		System.out.printf("\nTổng chi phí 4 năm từ 10 năm sau là: %.2f $ ", total);
		
		input.close();
	}

}
