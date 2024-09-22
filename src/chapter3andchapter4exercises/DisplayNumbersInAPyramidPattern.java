package chapter3andchapter4exercises;

import java.util.Scanner;

public class DisplayNumbersInAPyramidPattern {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Nhập một số nguyên: ");
		int number = input.nextInt();
		
		for(int i = 1; i <= number; i++) {
			
			for(int j = 1; j <= number - i; j++ ) {
				System.out.print("    ");
//				System.out.print(j + "  ");
			}
			
			/**
			 * for(int i = 1; i <= number; i++)
			 * cho number = 8
			 * => i = 1, 2, 3, 4, 5, 6, 7, 8 vì i <= 8;
			 * 
			 * for(int j = 1; j <= number - i; j++ )
			 * j = 1; j <= 8 - 1 ; j++ => 	j = 1 2 3 4 5 6 7 
			 * j = 1; j <= 8 - 2; j++ => 	j = 1 2 3 4 5 6
			 * j = 1; j <= 8 - 3; j++ => 	j = 1 2 3 4 5
			 * ...
			 * j = 1; j <= 8 - 7; j++; => 	j = 1
			 * j = 1; j > 8 - 8; j++; +> vòng lặp dừng hoạt động.
			 */
			
			int n = 1;
			for(int j = 1; j <= i; j++) {
				 System.out.printf("%3d ", n);
				n *= 2;
			}
			
		/**
		 * cho num = 1;
		 * for(int i = 1; i <= number; i++)
		 * cho number = 8
		 * => i = 1, 2, 3, 4, 5, 6, 7, 8 vì i <= 8;
		 * 
		 * for(int j = 1; j <= i; j++)
		 * 
		 * i = 1 => j = 1 (TMDK) 						=> output: ADCT(n *= 2) n = 1
		 * i = 2 => j = 1 và j = 2 (TMDK) 				=> output  n = 1; n = 2;
		 * i = 3 => j = 1, j = 2, j = 3 (TMDK)			=> output  n = 1; n = 2; n = 4;
		 * ...	
		 * i = 7 => j = 1, j = 2, ... j = 7;(TMDK) 		=> output j: n = 1; n = 2; n = 4 ; n = 8; n = 16; n = 32; n = 64. 
		 * i = 8 => j = 1, j = 2, ... j = 8;(TMDK)	 	=> output j: n = 1; n = 2; n = 4 ; n = 8; n = 16; n = 32; n = 64; n = 128,...	
		 *	
		 * Kết thúc vòng lặp in ra 		   	 1
		 * 							    1    2
		 * 						    1   2    4
		 *					   1	2	4	 8 	
		 * ...
		 *		  1	  2   4    8   16  32   64
		 *    1	  2   4   8   16   32  64  128
		 */
			
			
			n /= 2;
			for(int j = 1; j < i; j++) {
				n /= 2;
				 System.out.printf("%3d ", n);
			}
			
		/**
		 * for(int i = 1; i <= number; i++)
		 * cho number = 8
		 * => i = 1, 2, 3, 4, 5, 6, 7, 8 vì i <= 8;
		 * 
		 * for(int j = 1; j < i; j++)
		 * i = 1 	j = 1 (ko TMDK) 		=> output: rỗng.
		 * i = 2 	j = 1 (TMDK)			=> output: (n ở vòng lặp 2 là 2 dòng 49) n = n / 2 = 2 / 2 = 1.
		 * 			j = 2 (ko TMDK)	 		=> output: rỗng.
		 * i = 3	j = 1 (TMDK)			=> output: (n ở vòng lặp 2 là 4 dòng 50) n = n / 2 = 4 / 2 = 2.
		 * 			j = 2 (TMDK)			=> output: (n hiện tại là 2) n = n / 2 = 2 / 2 = 1.
		 * 			j = 3 (ko TMDK)			=> output: rỗng.
		 * 	Output 2	1.
		 * i = 4...
		 * 
		 * i = 7 	j = 1 (TMDK)			=> output: (n ở vòng lặp 2 là 64 dòng 50) n = 64 / 2 =  32.
		 * 			j = 2 (TMDK) 			=> output: (n hiện tại là 320) n = 32 / 2 = 16.
		 * 			j = 3 (TMDK)...
		 * 			j = 7 (ko TMDK) 1		 => output: rỗng.
		 * 	Output 32 	16	8	4	2	1.
		 * i = 8  ...
		 * 	Output 64	32	16	8	4	2	1.
		 */
			System.out.println();
		}
		input.close();
	}

}

