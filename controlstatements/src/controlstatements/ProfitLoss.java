package controlstatements;
import java.util.Scanner;
public class ProfitLoss {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		double sp,cp,profit,loss;
 System.out.println("enter the selling price & cost price");
 sp=sc.nextDouble();
 cp=sc.nextDouble();
 
 if(sp>cp)
 {
	profit=((sp-cp)/cp)*100;
	System.out.print("profit is=\t"+profit);
 }
 else
 {
	 loss=((cp-sp)/cp)*100;
	 System.out.print("loss is=\t"+loss);
 }
 
 
	}

}
