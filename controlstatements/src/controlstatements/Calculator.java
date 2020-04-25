package controlstatements;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a,ch,b;
		int c;
		System.out.println("Enter  two number");
		a=sc.nextInt();
		b=sc.nextInt();
		do
		{
		System.out.println(" choice operation 1 Addition\n 2 Subtraction\n 3 Multiplication\n 4 Division");
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:System.out.println(a+b);
		break;
		case 2:System.out.println(a-b);
		break;
		case 3:System.out.println(a*b);
		break;
		case 4:double d=(double)a/b;
		System.out.println(d);
		break;
		default:System.out.println("invalid");
		}
		System.out.println("if u want to continue then press 1");
		c=sc.nextInt();
		}while(c!=0);
	}

}
