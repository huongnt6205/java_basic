package chapter2exercises;

import java.util.Scanner;

public class HexagonArea {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Nhập chiều dìa các cạnh của hình lục giác: ");
		double s = input.nextDouble();
		
		double areaHexagon = ((3 * Math.sqrt(3)) / 2) * Math.pow(s,2);
		System.out.println("Diện tích hình lục giác là: " + areaHexagon);
		
		input.close();
	}

}
