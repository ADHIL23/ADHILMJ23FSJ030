package gtjune2023;
import java.util.Scanner;

public class locationofarray {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Create the array of size 'n'
        int[] array = new int[n];

        // Input array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the element to find its location: ");
        int elementToFind = scanner.nextInt();

        int location = findElementLocation(array, elementToFind);

        if (location != -1) {
            System.out.println("The element " + elementToFind + " is located at index: " + location);
        } else {
            System.out.println("The element " + elementToFind + " is not found in the array.");
        }

        scanner.close();
    }

    // Method to find the location of the element in the array
    public static int findElementLocation(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1; // If the element is not found, return -1
    }
}


