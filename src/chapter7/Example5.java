package chapter7;

import java.util.Arrays;

public class Example5 {
	
	public static void main(String[] args) {
		
		int[][] arr = new int[5][5];
	
        int value = 1;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                arr[row][col] = value++;
            }
        }
        
		for (int row = 1; row < arr.length; row++) {
			for (int col = 0; col < arr[0].length; col++) {
				
				int i1 = (int)(Math.random() * arr.length);
				int j1 = (int)(Math.random() * arr[row].length);
				
				int temp = arr[row][col];
				arr[row][col] = arr[i1][j1];
				arr[i1][j1] = temp;
			}
		}
		
		System.out.println(Arrays.deepToString(arr));
	}
}
