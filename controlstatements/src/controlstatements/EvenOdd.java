package controlstatements;
import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n1;
		
		System.out.println("Enter the  numbers");
		
		n1=sc.nextInt();
	
		
		if(n1%2==0)
		{
			System.out.println("no is even");
		}
		else
		{
			System.out.println("no is odd");
		}

	}

}
