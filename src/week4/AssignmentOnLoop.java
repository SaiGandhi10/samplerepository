package week4;

import java.util.Scanner;

public class AssignmentOnLoop {

	public static void main(String[] args) 
	{
		//Print first 10natural numbers
		for (int i=0;i<=10;i++)
		{
			
			System.out.println(i);
		}
		
		
		//Addition of First 100 natural numbers
		
		int num=0;
		for(int i=1;i<=100;i++)
		{
			num=num+i;
			
		}
		System.out.println("Addition is: "+num);
		
		//Find Factorial
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter anumber to find the factorial:");
		int no=sc.nextInt();
		
		int fact=1;
		for(int i=1;i<=no;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial is: "+fact);
		
		
	
		
	}
	

}
