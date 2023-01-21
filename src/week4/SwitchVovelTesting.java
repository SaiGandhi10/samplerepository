package week4;

import java.util.Scanner;

public class SwitchVovelTesting {

	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter a charcter:");
			
			String s=sc.nextLine();
			char c=s.charAt(0);
			
			switch(c)
			{
			case 'a': case 'e': case 'i':case 'o':case 'u':
				System.out.println("It is vovel");
				break;
				
				default:
					System.out.println("It is not a vovel");
			
			}
			
			sc.close();
	}

}
