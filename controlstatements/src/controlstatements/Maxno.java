package controlstatements;
import java.util.Scanner;
public class Maxno {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int max,ans,a,b,c;
		System.out.println("enter the 3 numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		if(a>b)
		{
			System.out.println(a);
		}
		else
		{
			if(b>c)
			{
				System.out.println(b);
			}
		
		else
		{
			System.out.println(c);
		}
		}
		

	}

}
