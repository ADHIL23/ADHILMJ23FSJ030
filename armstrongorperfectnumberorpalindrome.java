package gtjune2023;
import java.util.Scanner;

public class armstrongorperfectnumberorpalindrome {
	public static boolean isArmstrongNumber(int number) {
        int originalNumber = number;
        int sum = 0;
        int power = String.valueOf(number).length();

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, power);
            number /= 10;
        }

        return sum == originalNumber;
    }

    // Function to check if the number is a perfect number
    public static boolean isPerfectNumber(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        return sum == number;
    }

    // Function to check if the number is a palindrome
    public static boolean isPalindrome(int number) {
        int reversedNumber = 0;
        int originalNumber = number;

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return originalNumber == reversedNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        boolean isArmstrong = isArmstrongNumber(number);
        boolean isPerfect = isPerfectNumber(number);
        boolean isPalindrome = isPalindrome(number);

        if (isArmstrong) {
            System.out.println(number + " is an Armstrong number.");
        } else if (isPerfect) {
            System.out.println(number + " is a perfect number.");
        } else if (isPalindrome) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is none of these.");
        }

        scanner.close();
    }
}


