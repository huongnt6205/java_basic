package chapter3andchapter4exercises;

public class ShowOutputForLoop {

	public static void main(String[] args) {
		
		System.out.println("ví dụ 1: ");
		for(int i = 1; i < 5; i++) {
			int j = 0;
			while (j < i) {
				System.out.print(j + " ");
				j++;
			}
		}
		/**
		 * giải thích: for (đk: i < 5) nên sẽ tạo ra 4 vòng lặp 
		 * while (đk: j < i) nên khi j >= i vòng lặp While sẽ kết thúc
		 * vd: i = 1 - j = 0: TMĐK => output= 0
		 * 			 - j = 1: Ko THĐK => vòng lặp while kết thúc.
		 * 			 - vậy kêt thúc for loop với i = 1 thì output la '0'.
		 * 	   i = 2 - j = 0: TMĐK => output= 0
		 * 			 - j = 1: TMĐK => output= 1
		 * 			 - j = 2: Ko THĐK => vòng lặp while kết thúc.
		 * 			 - vậy kêt thúc for loop với i = 2 thì output la '0 1'.
		 * 	   i = 3 ...
		 */
		
		System.out.println("\n\nví dụ 2: "); {
			int i = 0;
			while(i < 5) {
				for(int j = i; j > 1; j--) {
					System.out.print(j + " ");	
				}
				System.out.println("****");
				i++;
			}		
		}
		/**
		 *Giải thích: while (đk: i < 5) nên sẽ tạo ra 5 vòng lặp
		 *for (đk; j = i và j > 1) nên khi vòng lặp j-- mà j <= 1 vòng lặp ké kết thúc.
		 *vd: i = 0 - j = 0: Ko TMĐK vì j = 0 < 1;
		 *	  		- vòng lặp for kết thúc. output '****'.
		 *	  i = 1 - tương tự i = 0
		 *			- vòng lặp for kết thúc. output '****'.
		 *	  i = 2 - j = 2: TMĐK vì 2 > 1;
		 *			- j-- => j = 1 ko TMĐK
		 *			- vòng lặp for kết thúc. output '2 ****'.
		 *	  i = 3 - j = 3: TMĐK
		 *			- j-- => j = 2 TMĐK...
		 *			- vòng lặp for kết thúc. output '3 2 ****'.
		 *	  i = 4 ...
		 */		
		
		System.out.println("\n\nví dụ 3:"); {
		int i = 5;
		while (i >= 1) {
			int num = 1;
			for(int j = 1; j <= i; j++) {
				System.out.print(num + "xxx");
				num *= 2;
			}
			System.out.println();
				i--;
		}
 		}
		/**
		 * Giải thích: vòng lặp while(i >=1) và i-- nên tạo ra 5 vòng lặp 5 4 3 2 1
		 * for cho num = 1 và j = 1(đk j <= 1) đúng num sẽ = num * 2;
		 * vd: i = 5 - num = 1; j = 1 => TMĐK => 1xxx ; num = 1 * 2 = 2;
		 * 			 - num = 2; j = 2 => TMĐK => 2xxx ; num = 2 * 2 = 4;
		 * 			 - num = 4; j = 3 => TMĐK => 4xxx ; num = 4 * 2 = 8;
		 * 			 - num = 8; j = 4 => TMĐK => 8xxx ; num = 8 * 2 = 16;
		 * 			 - num = 16; j = 5 => TMĐK => 16xxx ; num = 16 * 2 = 32;
		 * 			 - num = 32; j = 6 => ko TMĐK => vòng lặp kết thúc. => output: 1xxx2xxx4xxx8xxx16xxx.
		 * 	   i = 4 - num = 1; j = 1 => TMĐK => 1xxx ; num = 1 * 2 = 2;
		 * 			 - num = 2; j = 2 => TMĐK => 2xxx ; num = 2 * 2 = 4;
		 * 			 - num = 4; j = 3 => TMĐK => 4xxx ; num = 4 * 2 = 8;
		 * 			 - num = 8; j = 4 => TMĐK => 8xxx ; num = 8 * 2 = 16;
		 * 			 - num = 16; j = 5 => ko TMĐK => vòng lặp kết thúc. => output: 1xxx2xxx4xxx8xxx.
		 *	   i = 3 - ...
		 */
		
		System.out.println("\n\nví dụ4:"); {
			int i = 1;
			do {
				int num = 1;
				for (int j = 1; j <= i; j++) {
					System.out.print(num + "G");
					num +=2;
				}
				System.out.println();
				i++;
			} while(i <= 5);
		}
		/**
		 * Giải thích: dowhile (đk: i <= 5) nên 5 vòng lặp
		 * for(đk: j <= i) đúng num = num +1.
		 * vd: i = 1 - num = 1, j = 1 TMĐK => output 1G num = 1 + 2 = 3;
		 * 			 - num = 3, j = 2 ko TMĐK => vòng lặp kết thúc. => output: 1G
		 *     i = 2 ...
		 *     i = 5 - num = 1, j = 1 TMĐK => output 1G num = 1 + 2 = 3;
		 *     		 - num = 3, j = 2 TMĐK => output 3G num = 3 + 2 = 5;
		 *     		 - num = 5, j = 3 TMĐK => output 5G num = 5 + 2 = 7;
		 *     		 - num = 7, j = 4 TMĐK => output 7G num = 7 + 2 = 9;
		 *      	 - num = 9, j = 5 TMĐK => output 9G num = 9 + 2 = 11;
		 *      	 - num = 11, j = 6 ko TMĐK => vòng lặp kết thúc. => output: 1G3G5G7G9G.
		 */
		
		System.out.println("\n\nVí dụ5: "); {
			float sum = 0;
			
			for(float i = 0.01f; i <= 1.0f; i = i + 0.01f) {
				sum += i;
			}
			System.out.println("Tổng là: " + sum);
		}
	}

}
