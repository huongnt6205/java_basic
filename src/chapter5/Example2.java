package chapter5;

public class Example2 {

//	public static void printGrade(double corse) {
//		if (corse == 90.0) {
//			System.out.println('A');
//		} else if (corse >= 80.0) {
//			System.out.println('B');
//		} else if (corse >= 70.0) {
//			System.out.println('C');
//		} else if (corse >= 60.0) {
//			System.out.println('D');
//		} else {
//			System.out.println('F');
//		}
//	}
//	
//	public static void main(String[] args) {
//		System.out.print("Điểm loại: ");
//		printGrade(78.5);
//		
//		System.out.println();
//		
//		System.out.print("Điểm loại: ");
//		printGrade(59.5);
//	}
	
	public static char printGrade(double corse) {
		if (corse == 90.0) {
			return 'A';
		} else if (corse >= 80.0) {
			return 'B';
		} else if (corse >= 70.0) {
			return 'C';
		} else if (corse >= 60.0) {
			return 'D';
		} else {
			return 'F';
		}
	}
	
	public static void swap(int n1, int n2, int max) {
		if(n1 > n2 ) {
			max = n1;
		} else {
			max = n2;
		}
	}
	public static void main(String[] args) {
		System.out.print("Điểm loại: " + printGrade(78.5));
		
		System.out.println();
		
		System.out.print("Điểm loại: " + printGrade(59.5));
		
		
		
		int max = 0;
		System.out.println("Max trước khi được trả về: " + max);
		swap(1, 2, max);
		System.out.println("Max sau khi được trả về: " + max);
	}
}
