package chapter6;

public class VarArgsDemo {
	
	public static void printMax(double ... numbers) {
		if(numbers.length == 0) {
			System.out.println("NO argument passed");
			return;
		}
		
		double result = numbers[0];
		
		for(int i = 1; i < numbers.length; i++) {
			if(numbers[i] > result) {
				result = numbers[i];
			}
		}
		System.out.println("The max value is: " + result);
	}
	
	public static void main(String[] args) {
		printMax(34, 3, 3, 2, 65.5);
		printMax(new double[] {1,2,3});
		
		printMax(1, 2, 2, 1, 4);
		printMax(new double[]{1, 2, 3});
		
		
	}
}
