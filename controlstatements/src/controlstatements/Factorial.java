package controlstatements;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a;
		System.out.println("enter number");
        a=sc.nextInt();
        int factorial=1,i=1;
        while(i<=a)
        {
        	factorial=factorial*i;
        	i++;
        }
        System.out.println("factorial is\t"+factorial);
	}

}
