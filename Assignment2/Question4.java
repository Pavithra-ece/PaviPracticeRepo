package Assignment2;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter an integer: ");
		int num=sc.nextInt();
		
		if(num>0)
		{
			System.out.println("The number is Positive");
			if(num%4==0)
			{
				System.out.println("Divisile by 4!!");
			}
			else
			{
				System.out.println("Not Divisile by 4!!");
			}
		}
		else
		{
			System.out.println("The number is Negative");
			if(num%6==0)
			{
				System.out.println("Divisile by 6!!");
			}
			else
			{
				System.out.println("Not divisile by 6!!");
			}
		}
		sc.close();
		

	}

}
