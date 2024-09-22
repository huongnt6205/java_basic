package chapter6exercises;

import java.util.Arrays;
import java.util.Scanner;

public class printGcd {

	public static int gcd(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }
	
	public static int gcdArr(int... array) {
		
		int  gcd = array[0];
		
		for(int i = 0; i < array.length; i++) {
			gcd = gcd(gcd, array[i]);
			}
		return gcd;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] array = new int[5];
		System.out.print("Nhập 10 số để loại khỏi random: ");

		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}
		System.out.println(Arrays.toString(array));

		System.out.println("uoc chung lon nhat la: " + gcdArr(array));
		input.close();
	}
}
