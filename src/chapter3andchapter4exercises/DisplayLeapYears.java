package chapter3andchapter4exercises;

import java.util.Scanner;

public class DisplayLeapYears {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Nhập năm đầu của thế kỷ XXI: ");
		int startYears = input.nextInt();
		
		System.out.print("Nhập năm kết thúc thế kỷ XXI: ");
		int endYears = input.nextInt();
		
		int count = 0;
		for(int year = startYears; year <= endYears; year++) {
			if ((year % 4 == 0 && year % 100 != 0 ) || ( year % 400 == 0)) {
				System.out.print(year + " ");
				count++;
				if(count % 10 == 0) {
					System.out.println();
				}
			}
		}
		input.close();
	}

}
