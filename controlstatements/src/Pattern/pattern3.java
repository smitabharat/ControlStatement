package Pattern;

public class pattern3 {

	public static void main(String[] args)
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
			if(i==j)	
				System.out.print(i);
			else
				System.out.print("0");
			}
			System.out.println();
		}

	}

}
