package gtjune2023;
import java.util.Scanner;

public class areaofsquare {
	public static void main (String[] args)
	{
		System.out.println("enter side of a square:");
		Scanner scanner = new Scanner(System.in);
				double side = scanner.nextDouble();
		double area = side*side;
		System.out.println("area of a square is: "+area);
	}
	
	
	

}
