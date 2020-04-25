package controlstatements;
import java.util.Scanner;
public class UppLowCase {

	public static void main(String[] args)
	{
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any character");
		ch=sc.next().charAt(0);
		
		if(ch>=65 && ch<=97)
		{
			System.out.println("Character is Uppercase");
		}
		else
		{
			if(ch>=98 && ch<=122)
			{
				System.out.println("Character  is lower case ");
			}
			else
			{
				System.out.println("Invalid character");
			}
		}
		
		

	}

}
