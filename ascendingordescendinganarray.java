package gtjune2023;

import java.util.Arrays;
import java.util.Scanner;

public class ascendingordescendinganarray {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of elements in the array: ");
	        int n = scanner.nextInt();

	        int[] arr = new int[n];

	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = scanner.nextInt();
	        }

	        System.out.print("Do you want to sort in ascending (A) or descending (D) order? Enter A/D: ");
	        String sortOrder = scanner.next().toLowerCase();

	        if (sortOrder.equals("a")) {
	            Arrays.sort(arr); // Ascending order
	        } else if (sortOrder.equals("d")) {
	            Arrays.sort(arr);
	            // Reverse the array to get descending order
	            for (int i = 0; i < n / 2; i++) {
	                int temp = arr[i];
	                arr[i] = arr[n - 1 - i];
	                arr[n - 1 - i] = temp;
	            }
	        } else {
	            System.out.println("Invalid input. Please enter 'A' or 'D'.");
	            return;
	        }

	        System.out.println("Sorted array in " + (sortOrder.equals("a") ? "ascending" : "descending") + " order:");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	    }
	}


