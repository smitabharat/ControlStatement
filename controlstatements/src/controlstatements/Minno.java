package controlstatements;
import java.util.Scanner;

public class Minno {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n1,n2;
		System.out.println("Enter the two numbers");
		n1=sc.nextInt();
		n2=sc.nextInt();
		
		if(n1>n2)
		{
			System.out.println("no is greater\t"+n1);
			System.out.println("no is minimum\t"+n2);
		}
		else
		{
			System.out.println("no is minimum\t"+n1);
			System.out.println("no is maximum\t"+n2);
		}
		
		

	}

}
