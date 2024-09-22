package chapter6exercises;

public class LockerPuzzle {

	public static boolean[] initializeLockers(int numberLocker) {
		boolean[] lockers = new boolean[numberLocker];
		return lockers;
	}

	public static void toggleLockers(boolean[] lockers) {
		for (int student = 1; student <= lockers.length; student++) {
			for (int locker = student; locker <= lockers.length; locker += student) {
				lockers[locker - 1] = !lockers[locker - 1];
			}
		}
	}

	public static void displayOpenLockers(boolean[] lockers) {
		System.out.println("Các tủ mở:");
		for (int i = 0; i < lockers.length; i++) {
			if (lockers[i]) {
				System.out.print("Tủ " + (i + 1) + " \n");
			}
		}
	}

	public static void main(String[] args) {

		boolean[] lockers = new boolean[100];

		toggleLockers(lockers);
		
		displayOpenLockers(lockers);
	}

}
