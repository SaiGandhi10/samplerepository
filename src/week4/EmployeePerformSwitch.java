package week4;

import java.util.Scanner;

public class EmployeePerformSwitch {

	public static void main(String[] args)
	{
		System.out.print("Enter Performance id:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		switch(num)
		{
		case(1):
			System.out.println("Poor Performance");
		break;
		
		case(2):
			System.out.println("Need to Improve");
		break;
		
		case(3):
			System.out.println("Good Performance");
		break;
		
		case(4):
			System.out.println("Excellent Performance");
		break;
		
		case(5):
			System.out.println("Employee of the year");
		break;
		
		default:
			System.out.println("Enter correct Id");
		
		}
		
		
		sc.close();
		
	}

}
