package Pattern;

public class ABDCDPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			char ch ='A';
			while(ch<'G')
			{
				System.out.print(ch);
				ch++;
			}
			while(ch>='A')
			{
				System.out.print(ch);
				ch--;
			}
			System.out.println();
			
			for (int i = 6; i >= 1; i--)
			{
				for(int j =1 ; j<=i; j++)
				{
					System.out.print((char)(64+j));
				}
				for (int k = 6; k >=i ; k--) 
				{
					System.out.print(" ");
				}
				for (int k = 5; k >=i ; k--) 
				{
					System.out.print(" ");
				}
				for (int l = i; l>=1; l--) 
				{
					System.out.print((char)(64+l));
				}
				System.out.println();
			}
	}

}
