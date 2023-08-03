package gtjune2023;
import java.util.Arrays;

public class resizeofanarray {
	public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        int newSize = 8;
        
        int[] resizedArray = resizeArray(originalArray, newSize);
        
        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Resized Array: " + Arrays.toString(resizedArray));
    }
    
    public static int[] resizeArray(int[] array, int newSize) {
        int[] resizedArray = new int[newSize];
        
        // Copy elements from the original array to the resized array
        int elementsToCopy = Math.min(array.length, newSize);
        System.arraycopy(array, 0, resizedArray, 0, elementsToCopy);
        
        return resizedArray;
    }
}


