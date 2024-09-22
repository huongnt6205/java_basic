package chapter7;

public class Example4 {

	public static void main(String[] args) {

		System.out.println("Which row has the largest sum");

		int[][] arr = new int[5][5];

		int maxRow = 0;
		int indexOfMaxRow = 0;

		for (int col = 0; col < arr[0].length; col++) {
			maxRow += arr[0][col];
		}

		for (int row = 1; row < arr.length; row++) {

			int totalOfThisRow = 0;
			
			for (int col = 0; col < arr[0].length; col++) {
				arr[row][col] = (int) (Math.random() * 100);
				totalOfThisRow += arr[row][col];
			}
			
			if (totalOfThisRow > maxRow) {
				maxRow = totalOfThisRow;
				indexOfMaxRow = row;
			}
		}
		System.out.println("Row" + indexOfMaxRow + " has the array sum of " + maxRow);
	}
}
