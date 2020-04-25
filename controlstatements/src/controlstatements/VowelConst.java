package controlstatements;
import java.util.Scanner;

public class VowelConst {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		char ch;
		
		
		System.out.println("enter the characters");
		ch=sc.next().charAt(0);
		
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			System.out.println("it is vowels"+ch);
		}
		else
		{
			System.out.println("it is constraint\t"+ch);
		}
	

	}

}
