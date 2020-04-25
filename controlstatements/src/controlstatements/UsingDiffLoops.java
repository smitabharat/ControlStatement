package controlstatements;

public class UsingDiffLoops {

	public static void main(String[] args) {
		for(int i=1;i<=100;i++)
		{
			System.out.println("using for loop\t"+i);
		}

		int i=1;
		while(i<=100)
		{
			System.out.println("using while loop\t"+i);
			i++;
		}
	int j=1;	
	do
	{
		System.out.println("using do while\t"+j);
	j++;
	}while(j<=100);
	
	int no=1;
	if(no<=100)
	{
		
		System.out.println("using if statement\t"+no);
		no++;
	}
	}

}
