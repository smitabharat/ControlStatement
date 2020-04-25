package controlstatements;

public class RhombusNumber {

	public static void main(String[] args) 
	{
		for(int i=1;i<=4;i++)
		{ 
			for(int j=1;j<4-1;j++)
			{
				System.out.print(" ");
			}for(int k=i;k>=1;k--)
			{
			System.out.print(k);
		}
			for(int l=2;l<=i;l++)
			{
				System.out.print(l);
			}
			System.out.println();

	}

}
}
