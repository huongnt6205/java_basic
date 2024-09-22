package chapter6;

public class Example2 {

	public static void main(String[] args) {

//		int[] myArray = new int[10];

//		System.out.print("\nmyArray = {");
//		for(int i = 0; i < myArray.length;i++) {
//			myArray[i] = (int) (Math.random() * 100);
//			System.out.print(myArray[i] + ", ");
//		}
//		System.out.println("}");
//	

//		for(int i = 0; i < myArray.length; i++) {
//			myArray[i] = (int) (Math.random() * 100); 
//		}
//		
//		for(int i = 0; i < myArray.length; i++) {
//			int j = (int) (Math.random() * myArray.length);
//			
//			int temp = myArray[0];
//			
//			if(temp > myArray[j])
//				temp = myArray[i];
//				myArray[i] = myArray[j];
//				myArray[j] = temp;
//				
//			System.out.print( temp + " ");
//		}
//		

		double[] myArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		double temp = myArray[0];

		for (int i = 1; i < myArray.length; i++) {
			myArray[i - 1] = myArray[i];
		}
		myArray[myArray.length - 1] = (int) temp;

		System.out.print("\nmyArray = {");
		for (int i = 0; i < myArray.length; i++) {
			System.out.print(myArray[i] + ", ");
		}
		System.out.println("}");
	}
}
