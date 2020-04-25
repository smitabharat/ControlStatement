package controlstatements;
import java.util.Scanner;
public class Countdigit {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int no;
		System.out.println("Enter any number");
		no=sc.nextInt();
		int count=0;
		while(no!=0)
		{
			no/=10;
			++count;
		}
System.out.println("digit is\t"+count);
	}

}
