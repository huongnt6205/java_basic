package chapter5exercises;

public class EstimatePI {
	
	public static double printPI(double i) {
		double pi =  0;
		
		for(int j = 1; j <= i; j ++) {
			double m = Math.pow((-1), (j + 1)) / (2 * j - 1);
			pi += m;
		}
		pi *= 4;
		
		return pi;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("i \t m(i)");
		System.out.println("-------------------");
		for(double i = 1; i <= 1000; i += 100) {
			double pi = printPI(i);
			
			System.out.printf("%.0f \t %.4f\n", i, pi);
		}
	}
}
