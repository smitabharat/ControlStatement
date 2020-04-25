package controlstatements;
import java.util.Scanner;
public class CheckDigitSpch {

	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	char ch;
	System.out.println("Enter any character");
 ch=sc.next().charAt(0);
 
   if(ch>=48 && ch<=57)
   {
	   System.out.println("character is digit");
   }
   else
   {
	   if(ch>=65 && ch<=122)
	   {
		   System.out.println("character is character");
	   }
	   else
	   {
		   System.out.println("character is special character");
	   }
   }
	}

}
