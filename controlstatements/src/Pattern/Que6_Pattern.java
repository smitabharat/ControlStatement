package Pattern;

public class Que6_Pattern 

/*ABCDEFGFEDCBA
ABCDEF FEDCBA
ABCDE   EDCBA
ABCD     DCBA
ABC       CBA
AB         BA
A           A
*/
{
	public static void main(String[] args) {
		char ch='A';
		int n=6,s=1, i, j, k, l;
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
		for(i=1; i<=6; i++)
		{
			ch='A';
			for(j=i; j<=n; j++)
			{
				System.out.print(ch);
				ch++;
			}
			for(k=1; k<=s; k++)
			{
				System.out.print(" ");
			}
			for(l=i; l<=n; l++)
			{
				ch--;
				System.out.print(ch);
			}
			s=s+2;
		System.out.println();	
		}
	}

}
