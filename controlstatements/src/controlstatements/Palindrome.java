package controlstatements;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int no,sum=0;
System.out.println("enter the number");
no=sc.nextInt();
int ans,temp;
temp=no;
while(no>0)
{
	ans=no%10;
	sum=sum*10+ans;
	no=no/10;
}
if(temp==sum)
{
System.out.println("String is palindrome");
	}
else
{
	System.out.println("string is not palindrome");
}
	}
}
