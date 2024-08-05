package chapter4;

import java.util.Scanner;

public class SentinelValue {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Nhập một số nguyên bất kỳ(sẽ kết thúc chương trình nếu nó bằng 0): ");
		int data = input.nextInt();
		
		int sum = 0;
		while(data != 0) {
			sum += data;
			
			System.out.print("Nhập một số nguyên bất kỳ(sẽ kết thúc chương trình nếu nó bằng 0): ");
			data = input.nextInt();
		}
		System.out.println("Tổng: " + sum);
		
		input.close();
	}

}
