package chapter7;

public class Example1 {

	public static void main(String[] args) {
		// Cach tao magn 2 chieu:

		// elementType[][] arrayRefVar;
		double[][] arr1;
		arr1 = new double[5][5];
		
		// elementType arrayRefVar[][];
		double arr2[][];
				
		// gán giá trị:
		arr1[2][4] = 9;
		
		arr2 = new double[][]{
			{1, 2, 3, 4, 5},
			{4, 5, 6, 4},
			{7, 8, 9}
		};
		
		System.out.println(arr2.length);
		System.out.println(arr2[0].length);
		System.out.println(arr2[1].length);
		
		//
		int[][] triangleArr = new int[5][];
		triangleArr[0] = new int[5];
		triangleArr[1] = new int[10];
		triangleArr[2] = new int[2];
		triangleArr[3] = new int[7];
		triangleArr[4] = new int[1];
		
		
		
		int[][] array = new int[5][6];
		int[] x = {1, 2};
		array[0] = x;
		System.out.println("array[0][1] is " + array[0][1]);
		
	}
}
