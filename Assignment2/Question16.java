package Assignment2;

import java.util.Scanner;

public class Question16 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Even numbers are summed only when a negative number is entered!!");
		
		
	    int sum=0;
		int num;
		
		do
		{
			System.out.print("Enter a number:");
			num=sc.nextInt();
			if(num>=0 && num%2==0)
			{
				sum=sum+num;
			}
			
		}
		while(num>=0);
		System.out.println("The sum of the even numbers entered :"+sum);
		
		sc.close();
			
		
		
		

	}

}
