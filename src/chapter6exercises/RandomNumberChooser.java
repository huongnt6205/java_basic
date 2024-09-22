package chapter6exercises;

import java.util.Arrays;
import java.util.Scanner;

public class RandomNumberChooser {

	public static int getrandom(int... array) {
		
		int random = (int) (Math.random() * 54 + 1);
		for (int i = 0; i < array.length; i++) {
			if(random == array[i]) {
				random = (int) (Math.random() * 54 + 1);
				i = -1;
			}
		}
		return random;
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		int[] array = new int[10];
		System.out.print("Nhập 10 số để loại khỏi random: ");

		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}
		System.out.println(Arrays.toString(array));

		System.out.println("số được random: " + getrandom(array));

		
		input.close();
	}
}
