package week4;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
				System.out.println("Enter no between 0-5:");
		int num=sc.nextInt();

		switch(num)
		{
			case 0:
				System.out.println("The number is Zero");
				break;
			case 1:
				System.out.println("The number is One");
				break;
			case 2:
				System.out.println("The number is Two");
				break;
			case 3:
				System.out.println("The number is Three");
				break;
			case 4:
				System.out.println("The number is Four");
				break;
			case 5:
				System.out.println("The number is Five");
				break;
			default:
				System.out.println("Enter a valid number");
			
			
			
		}
		sc.close();
		
		}
	

}
