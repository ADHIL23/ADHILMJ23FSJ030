package gtjune2023;

public class commentdocumentation {
	public static int calculateFactorial(int n) throws IllegalArgumentException {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }

    /**
     * Main method to demonstrate the factorial calculation.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        int number = 5;
        System.out.println("Factorial of " + number + " is: " + calculateFactorial(number));
    }
}


