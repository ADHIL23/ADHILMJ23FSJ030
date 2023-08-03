package gtjune2023;
import java.util.Arrays;

public class reverseofanarray {
	public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        System.out.println("Original Array: " + Arrays.toString(originalArray));

        int[] reversedArray = reverseArray(originalArray);
        System.out.println("Reversed Array: " + Arrays.toString(reversedArray));
    }

    public static int[] reverseArray(int[] arr) {
        int[] reversed = new int[arr.length];
        int j = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {
            reversed[j] = arr[i];
            j--;
        }

        return reversed;
    }
}


