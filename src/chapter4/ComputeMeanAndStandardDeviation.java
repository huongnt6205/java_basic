package chapter4;

import java.util.Scanner;

public class ComputeMeanAndStandardDeviation {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double sum = 0;
		double mean = 0;
		double sumSquared = 0;
		System.out.print("Nhập 10 số ngẫu nhiên: ");
		
		for (int i = 1; i <= 10; i++) {
			double number = input.nextDouble();
			sum += number;
			
			sumSquared += Math.pow(number, 2);
			
		}
		mean = sum / 10;
		System.out.println("The mean: " + mean);
		
				
		double deviation = Math.sqrt((sumSquared - (Math.pow(sum, 2) / 10)) / (10 - 1));
		System.out.println("Độ lêch lệch là: " + deviation);
		input.close();
	}

}
