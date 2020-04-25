package controlstatements;
import java.util.Scanner;

public class NegPos {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n1;
		System.out.println("Enter the number");
		n1=sc.nextInt();
		
		if(n1<0)
		{
		System.out.println("no is negative");
		}
		else
		{
			System.out.println("it is positive");
		}
		
		

	}

}
