package Pattern;

public class HW18Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			for (int i = 1; i <= 9 ; i=(i+2))
			{
				for (int j = 1; j <=i; j++) 
				{
					System.out.print("*");
				}
				System.out.println();
			}
			
			for (int i = 7; i >= 1 ; i=(i-2))
			{
				for (int j = 1; j <=i; j++) 
				{
					System.out.print("*");
				}
				System.out.println();
			}
	}

}
