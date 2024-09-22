package chapter5;

public class ConversionsBetweenCelsiusAndFahrenheit {

	 public static double celsiusToFahrenheit(double celsius) {
	        return (9.0 / 5) * celsius + 32;
	    }
	 
	 public static double fahrenheitToCelsius(double fahrenheit) {
	        return (5.0 / 9) * (fahrenheit - 32);
	    }
	
	public static void main(String[] args) {

		System.out.println("Celsius \t Fahrenheit \t | \t Fahrenheit \t Celsius");
		System.out.println("--------------------------------------------------------------");

		double celsius = 40.0;
		double fahrenheit = 120.0;

		for (int i = 0; i <= 9; i++) {
			double cToF = celsiusToFahrenheit(celsius - i);
			double fToC = fahrenheitToCelsius(fahrenheit - i * 10);
			System.out.printf("%.1f \t\t %.1f \t\t | \t %.1f \t\t %.2f\n", (celsius - i), cToF, (fahrenheit - i * 10), fToC);
		}
	}
}
