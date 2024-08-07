package chapter4;

public class FutureTuition {

	public static void main(String[] args) {
		double tuition = 10000;
		int year = 0;
		
		while (tuition < 20000) {
			tuition = tuition * 1.07;
			year++;
		}
		
		System.out.println("Hoc phi se tang gap doi trong: " + year + " year!");
		System.out.printf("Hoc phi se la $%.2f trong %1d nam ", tuition, year);

	}

}