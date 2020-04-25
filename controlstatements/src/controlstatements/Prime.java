package controlstatements;
import java.util.Scanner;
public class Prime {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int i=2,no,a=0;
		System.out.println("enter the number");
		no=sc.nextInt();
	
			if(no%i==0)
			{
				a=a+1;
				}
		if(a==0)
				{
	System.out.println("prime no");
		}
				else
				{
					System.out.println("not prime");
	}
	}

}
