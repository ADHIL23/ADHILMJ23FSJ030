package gtjune2023;

import java.util.Scanner;

public class averageofnnumbers {
	 public static double calculateAverage(int[] numbers) {
	        int sum = 0;
	        for (int num : numbers) {
	            sum += num;
	        }
	        return (double) sum / numbers.length;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of elements: ");
	        int n = scanner.nextInt();

	        int[] numbers = new int[n];

	        System.out.println("Enter " + n + " numbers:");
	        for (int i = 0; i < n; i++) {
	            numbers[i] = scanner.nextInt();
	        }

	        double average = calculateAverage(numbers);
	        System.out.println("The average is: " + average);

	        scanner.close();
	    }
	}


