package chapter4;

import java.util.Scanner;

public class OccurrenceOfMaxNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Nhập số nguyên(nếu nhập 0 chương trình sẽ kết thúc): ");
		int number = input.nextInt();
		int max = 0;
		int count = 1;
		do {
//			System.out.println("Nhập số nguyên(nếu nhập 0 chương trình sẽ kết thúc): ");
			if(number == 0) {
				break;
			}
				
			number = input.nextInt();
			if(number > max) {
				max = number;
				count = 1;
			} else if(number == max) {
				count++;
			}
		} while(number != 0);
		System.out.println("Số lớn nhất trong dãy số là: " + max + " với số lần xuất hiện là: " + count);
		
		input.close();
	}

}
