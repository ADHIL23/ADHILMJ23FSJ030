package gtjune2023;

public class primenumberfrom1to100 {
	public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 100:");
        generatePrimeList(1, 100);
    }

    public static void generatePrimeList(int start, int end) {
        for (int num = start; num <= end; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        // Check for divisibility from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}


