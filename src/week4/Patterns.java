package week4;

public class Patterns {

	public static void main(String[] args) {

		//Patern 1
		for(int i=1;i<=4;i++)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print("@");
			}
			System.out.println();
		}
		
		System.out.println("**************************************************");
		
		//Pattern 2
		for(int i=1;i<=9;i++)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		
		System.out.println("**************************************************");

		//Pattern3
		for(int i=5;i>=1;i--)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print("$");
			}
			System.out.println();
		}

		System.out.println("**************************************************");

		//Pattern3
		for(int i=1;i<=4;i++)
		{
			for (int j=1;j<=4;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println("**************************************************");

		
		//Pattern4
				for(int i=1;i<=4;i++)
				{
					for (int j=1;j<=4;j++)
					{
						System.out.print(j);
					}
					System.out.println();
				}
				System.out.println("**************************************************");

		
		//Pattern 5
				for(int i=1;i<=9;i++)
				{
					for (int j=1;j<=i;j++)
					{
						System.out.print(j);
					}
					System.out.println();
				}
				
				System.out.println("**************************************************");

				
		//Pattern 6
							
				for(int i=0;i<=9;i++)
				{
					
					
					if(i<5)
					{
						System.out.println(i);
					}
					else
					{
						System.out.print(" "+i);
					}
				}
				System.out.println();
				System.out.println("**************************************************");
				
				
		//Pattern 7
				int k=1;
				for(int i=1;i<=4;i++)
				{
					for (int j=1;j<=i;j++)
					{
						System.out.print(k+++"\t");
					}
					System.out.println();
				}
				
				System.out.println("**************************************************");

				

	}

}
