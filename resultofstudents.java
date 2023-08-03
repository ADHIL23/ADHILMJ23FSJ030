package gtjune2023;
import java.util.Scanner;

public class resultofstudents {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of students and subjects
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        // Create a two-dimensional array to store the marks
        int[][] marks = new int[numStudents][numSubjects];

        // Input the marks for each student and subject
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");
            for (int j = 0; j < numSubjects; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                marks[i][j] = scanner.nextInt();
            }
        }

        // Calculate the total and average marks for each student
        int[] totalMarks = new int[numStudents];
        double[] averageMarks = new double[numStudents];

        for (int i = 0; i < numStudents; i++) {
            int total = 0;
            for (int j = 0; j < numSubjects; j++) {
                total += marks[i][j];
            }
            totalMarks[i] = total;
            averageMarks[i] = (double) total / numSubjects;
        }

        // Display the results
        System.out.println("\nResults of Students:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student " + (i + 1) + " - Total Marks: " + totalMarks[i] + ", Average Marks: " + averageMarks[i]);
        }

        scanner.close();
    }
}


