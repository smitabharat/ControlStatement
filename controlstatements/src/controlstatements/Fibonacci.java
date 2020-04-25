package controlstatements;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	int f=0,s=1,r,no,i=1;
System.out.println("Enter the number");
no=sc.nextInt();
System.out.println(+f +"\t" +s);
while(i<(no-2))
{   
r=f+s;
System.out.println(""+r);
f=s;
s=r;
i++;
	}
	}

}
