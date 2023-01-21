package week4;

import java.util.Scanner;

public class RealNestedScenario {

	public static void main(String[] args) {
			//compare the strings
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a String:");
		String s=sc.nextLine();
		
		if(s.equalsIgnoreCase("chrome"))
		{
			System.out.println("You have opened chrome browser");
		}
		else if(s.equalsIgnoreCase("Mozilla Firefox"))
		{
			System.out.println("You have opened Mozilla Firefox browser");
		}
		else if(s.equalsIgnoreCase("Microsoft edge"))
		{
			System.out.println("You have opened Microsoft edge browser");
		}
		else
		{
			System.out.println("You have entered wrong browser");
		}
		sc.close();
	}

}
