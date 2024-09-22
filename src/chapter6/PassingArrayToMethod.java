package chapter6;

public class PassingArrayToMethod {

	public static void swap(int n1, int n2) {
		int temp = n1;
		n1 = n2;
		n2 = temp;
	}
	
	public static void swapFirstTwoInArray(int[] myArray) {
		
		int temp = myArray[0];
		myArray[0] = myArray[1];
		myArray[1] = temp;
	}
	
	public static void main(String[] args) {
		
		int[] a = {1, 2};
		
		System.out.println("Before invoking swap");
		System.out.println("a[] = {" + a[0] + ", " + a[1] + "}");
		
		swap(a[0], a[1]);

		System.out.println("After invoking swap");
		System.out.println("a[] = {" + a[0] + ", " + a[1] + "}");
		
		System.out.println("Before invoking swapFirstTwoInArray");
		System.out.println("a[] = {" + a[0] + ", " + a[1] + "}");
		
		swapFirstTwoInArray(a);
		
		System.out.println("After invoking swapFirstTwoInArray");
		System.out.println("a[] = {" + a[0] + ", " + a[1] + "}");
	}
}
