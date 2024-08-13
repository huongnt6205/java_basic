package chapter3andchapter4exercises;

import java.util.Scanner;

public class CountPositiveAndNegativeNumbers {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Nhập một số nguyên (Input sẽ kết thúc nếu bằng 0): ");
		int number = input.nextInt();
		int sumPositive = 0;
		int sumNegative = 0;
		int total = 0;
		int count = 0;
		
		while(number != 0) {
			if (number > 0 ) {
				sumPositive++;
				number = input.nextInt();
			} else if (number < 0){
				sumNegative++;
				number = input.nextInt();
			}
			total += number;
			count++;
		}
		System.out.println("số lượng số dương đã nhập là: " + sumPositive);
		System.out.println("Số lượng số âm đã nhập là: " + sumNegative);
		
		double average = total / count;
		System.out.println("Trung bình cộng của các số nguyên vừa nhập là: " + average);
		
		input.close();
	}

}
