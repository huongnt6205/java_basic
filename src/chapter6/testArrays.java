	package chapter6;
	
	import java.util.Arrays;
	
	public class testArrays {
	
		public static void main(String[] args) {
			
			//sap xep mang tang dan
			double[] number = {6.0, 4.4, 1.9, 2.9, 3.4, 3.5};
			Arrays.sort(number);
			System.out.println(Arrays.toString(number));
			
			//doi vi tri cua 2 phan tu trong mang
			char[] chars = {'a', 'A', '4', 'F', 'D', 'P'};
			Arrays.sort(chars, 1,3);
			System.out.println(Arrays.toString(chars));
			
			//sap xep tang dan rồi tì vị trí cua 1 phần tử nào đó
			int[] arr = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
			System.out.println("(1) Index is: " + Arrays.binarySearch(arr, 11));
			System.out.println("(2) Index is: " + Arrays.binarySearch(arr, 12));
			
			//tương tự...
			char[] arrChars = {'a', 'c', 'g', 'x', 'y', 'z'};
			System.out.println("(3) Index is: " + Arrays.binarySearch(arrChars, 'a'));
			System.out.println("(4) Index is: " + Arrays.binarySearch(arrChars, 't'));
			
			
			//so sanh 2 mang
			int[] list1 = {2, 4, 7, 10};
			int[] list2 = {2, 4, 7, 10};
			int[] list3 = {4, 2, 7, 10};
			System.out.println(Arrays.equals(list1, list2));
			System.out.println(Arrays.equals(list1, list3));

			int[] list4 = {2, 4, 7, 10};
			int[] list5 = {2, 4, 7, 10};
			java.util.Arrays.fill(list4, 5);
			java.util.Arrays.fill(list5, 1, 3, 8);
			System.out.println(Arrays.toString(list4));
			System.out.println(Arrays.toString(list5));
		}
	}
