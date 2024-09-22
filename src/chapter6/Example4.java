package chapter6;

public class Example4 {

	public static void main(String[] args) {

		/**
		 * Cách tạo 1 biến tham chiếu mảng: 
		 * elementType[] arratRefVar = new  elementType[sizeArray] or
		 * elementType arratRefVar[] = new  elementType[sizeArray]
		 * Cách tạo 1 mảng:
		 *  elementType[] arrayRefvar;	 
		 *  
		 *  arrayRefVar[index] = value;
		 *  
		 *  bộ nhớ được cấp phát cho một mảng khi khai báo và khởi tào bằng từ khóa mới.
		 *  
		 *  
		 *  Cách truy cập phần tử mảng: 
		 *   truy caaph thẳng vd: myArray[2]; myArray[1];... Công thức: arrayRefVar[index]
		 *   biến chỉ mục là index bắt đầu từ 0;
		 *  
		 */
		
		/*
		 * for (elementType element: arrayRefVar) { // Process the element }
		 */
		/**************************/

		double[] myArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (double u : myArray) {
			System.out.print(u);
		}
		
		
		int x = 30;
		int[] number = new int[x];
		x = 60;
		System.out.println("x có giá trị là: " + x);
		System.out.println("Kích thước của mảng Number là: " + number.length);
		
		int list[] = {1, 2, 3, 4, 5, 6};
		for (int i = 1; i < list.length; i++)
		list[i] = list[i - 1];
		
		for (int i = 0; i < list.length; i++)
		System.out.print(list[i] + " ");
	}
}
