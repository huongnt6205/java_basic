package chapter6;

import java.util.Arrays;

public class copyArrays {

	public static void main(String[] args) {

		int[] sourceArray = { 2, 3, 1, 5, 10 };
		int[] targetArray = new int[sourceArray.length];

		for (int i = 0; i < sourceArray.length; i++) {
			targetArray[i] = sourceArray[i];
		}

		int[] source = { 3, 4, 5 };

		int[] t = new int[source.length];

		System.arraycopy(source, 0, t, 0, source.length);

		System.out.println("Target array: " + Arrays.toString(t));

		for (int i : t) {
			System.out.print(i + " ");
		}
	}
}
