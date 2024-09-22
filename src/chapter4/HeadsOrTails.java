package chapter4;

import java.util.Scanner;

public class HeadsOrTails {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Nhập số lần bạn muốn tung xúc xắc: ");
		int number = input.nextInt();
		int heads = 0;
		int tails = 0;
		//chẵn là heads, lẻ là tails
		for(int i = 1; i <= number; i++ ) {
			int random = (int) (Math.random() * number);
			if(random % 2 == 0) {
				heads++;
			} else {
				tails++;
			}
		}
		System.out.println("Số lần đồng xu ngửa là: "+ heads);
		System.out.println("Số lần đồng xu ra xấp là: " + tails);
		input.close();
	}
}
