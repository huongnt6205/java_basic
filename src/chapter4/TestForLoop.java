package chapter4;

import java.util.Scanner;

public class TestForLoop {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
			/****************/
			for (int i = 0; i <= 100; i++) {
			    System.out.println(i);
			}
			/******************/  
			int number, sum = 0, count;
			for (count = 0; count < 5; count++) {
			    System.out.println("Nhập một số nguyên: ");
			    number = input.nextInt();
			    sum += number;
			}
			System.out.println("sum is " + sum);
			System.out.println("count is " + count);
			
			/********************/
			/**
			 * Sum of numbers from 0 to 1000 using a long variable to avoid overflow
			 */
			
			long s = 0;
			int i = 0;
			while(i <= 100) {
			    s = s + i;
			    i++;
			    System.out.println("Tổng: " + s);
			}
			
			input.close();
		}
    }
}
