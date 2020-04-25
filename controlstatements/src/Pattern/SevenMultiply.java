package Pattern;

public class SevenMultiply {

	public static void main(String[] args) {
		int n=7;
	for(int i=4;i>=1;i--)
	{
		System.out.print(" ");
		for(int j=i;j<=3;j++)
		{  
			System.out.print("   ");
		}
          for(int k=1;k<=i;k++) 
          {
        	  System.out.print(n+" ");
        	  n=n+7;
        	  
          }
          System.out.println();

	
}
	}

	}



