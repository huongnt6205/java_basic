package chapter4;

import java.util.Scanner;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
//		System.out.print("Nhap so nguyen thu nhat: ");
//		int n1 = input.nextInt();
//		
//		System.out.print("Nhap so nguyen thu hai: ");
//		int n2 = input.nextInt();
//		
//		int gcd = 1;
//		int k = 2;
//		
//		while(k <= n1 && k <= n2) {
//			if(n1 % k == 0 && n2 % k == 0) 
//				gcd = k;
//			k++;
//		}
//		
//		System.out.println(" Uoc chung lon nhat cua " + n1 + " va " + n2 + " la: " + gcd);
		
		System.out.print("Nhap so nguyen thu nhat: ");
		int n1 = input.nextInt();
		
		System.out.print("Nhap so nguyen thu hai: ");
		int n2 = input.nextInt();
		
		int gcd = 1;
		
		for(int d = Math.min(n1, n2); d >= 1; d--) {
				if(n1 % d == 0 && n2 % d == 0) {
					gcd = d;
					break;
			}
		}
		System.out.println("Uoc chung lon nhat cua " + n1 + " va " + n2 + " la: " + gcd);
		input.close();
	}

}
