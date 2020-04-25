package controlstatements;
import java.util.Scanner;

public class kaprekar
{
	public static void main(String[] args) 
	{
int n,div,rem,sq,org,p=1;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
n=sc.nextInt();


org=n;
sq=n*n;

while(n>0)
{
	p=p*10;
	n=n/10;
}

div=sq/p;
rem=sq%p;
System.out.println(div);
System.out.println(rem);


if(div+rem==org)
{
	System.out.println("it is kaprekar"+org);
}
else
{

	System.out.println("not kaprekar"+org);
}


	}

}
