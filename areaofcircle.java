package gtjune2023;

import java.util.Scanner;

public class areaofcircle 
{
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter the radius");
		double radius = scanner.nextDouble();
		double area = Math.PI * (radius * radius);
		System.out.println("the area of circle is: " + area);
		double circumference= Math.PI * 2*radius;
		System.out.println( "the circumference of the crcle is:"+circumference);
	}
	

}
