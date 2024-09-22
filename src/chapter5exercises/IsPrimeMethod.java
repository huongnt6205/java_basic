package chapter5exercises;

public class IsPrimeMethod {

    public static void main(String[] args) {
        int count = 0;

        for (int i = 2; i <= 10000; i++) {
            if (isPrime(i)) {
                System.out.printf("%-4d ",i);
                count++;
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int j = 2; j * j <= number; j++) {
            if (number % j == 0) {
                return false;
            }
        }
        return true;
    }
}
