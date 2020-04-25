package controlstatements;
import java.util.Scanner;

public class CheckTriangle {

	public static void main(String[] args) 
	{
	 Scanner sc=new Scanner(System.in);
	 int t1,t2,t3;
	 System.out.println("Enter the triangle sides");
	 t1=sc.nextInt();
	 t2=sc.nextInt();
	 t3=sc.nextInt();
	 
	 if(t1==t2 && t2==t3 && t3==t1)
	 {
		 System.out.println("it is equilateral triangle");
	 }
	 else
	 {
		 if(t1==t2 && t2==t1)
		 {
			 System.out.println("isosceles triangle");
		 }
		 else
		 {
			 System.out.println("it is scalene triangle");
		 }
	 }
	 

	}

}
