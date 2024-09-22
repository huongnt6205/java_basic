package chapter4;

import java.util.Scanner;

public class SquareMonteCarloSimulation {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Nhập số lần ném phi tiêu: ");
		int simulations = input.nextInt();

		double dartsInOddRegions = 0;
		double dartsInEvenAreas = 0;

		for (int k = 1; k <= simulations; k++) {
			double x = Math.random() * 10 - 5;
			double y = Math.random() * 10 - 5;

			if (x < 0 && y < 0) {
				dartsInOddRegions++;
			} else if(x > 0 && y < 0) {
				dartsInOddRegions++;
			}
			else if (x < 0 && y > 0) {
				dartsInEvenAreas++;
			} else if (x > 0 && y > 0) {
				if (y > x) {
					dartsInOddRegions++;
				} else {
					dartsInEvenAreas++;
				}
			}
		}
		double probabilityOdd = (double) dartsInOddRegions / simulations;
		double probabilityEven = (double) dartsInEvenAreas / simulations;

		System.out.printf("Xác suất để phi tiêu nằm vùng số chẵn là: %.3f \n", probabilityEven);
		System.out.printf("Xác suất để phi tiêu nằm vùng số lẻ là: %.3f", probabilityOdd);

		input.close();
	}

}
