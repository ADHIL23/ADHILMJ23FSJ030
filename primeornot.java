package gtjune2023;
import java.util.Scanner;

public class primeornot {
	public static void main(String args[])
	{
		int temp;
		boolean isPrime=true;
		Scanner scan= new Scanner(System.in);
		System.out.println("enter any number:");
		int num=scan.nextInt();
		scan.close();
		for(int i=2;i<=num/2;i++)
		{
			temp=num%i;
			if(temp==0)
			{
				isPrime=false;
				break;
				
			}
		}
		if(isPrime)
			System.out.println(num + " is a Prime number");
		else
			System.out.println(num + " is not a prime number");
		
		
		
	
	}
	

}
