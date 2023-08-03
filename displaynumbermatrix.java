package gtjune2023;

public class displaynumbermatrix {
	 public static void main(String[] args) {
	        int rows = 4; // Change this value to adjust the number of rows in the matrix
	        int[][] matrix = new int[rows][];

	        int currentNumber = 1;
	        for (int i = 0; i < rows; i++) {
	            matrix[i] = new int[i + 1];
	            for (int j = 0; j <= i; j++) {
	                matrix[i][j] = currentNumber++;
	            }
	        }

	        displayMatrix(matrix);
	    }

	    public static void displayMatrix(int[][] matrix) {
	        for (int[] row : matrix) {
	            for (int num : row) {
	                System.out.print(num + " ");
	            }
	            System.out.println();
	        }
	    }
	







}
