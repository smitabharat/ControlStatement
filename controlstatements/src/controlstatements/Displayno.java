package controlstatements;
import java.util.Scanner;
public class Displayno {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int no;
		System.out.println("enter a number");
		no=sc.nextInt();
		int a=1;
		while(a<=100)
		{
			System.out.println("numbers are"+a);
		a++;
		}

	}

}
