package Assignment2;

import java.util.Scanner;

public class Question20 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number:");
		
		int num=sc.nextInt();
        
        int num1=num;
		
		int rev=0;
		
		do
		{
			int d=num%10;
			rev=rev*10+d;
			num=num/10;
			
		}while(num!=0);
		
		
		
		if(num1==rev)
		{
			System.out.println("Palindrome Number");
		}
		else
		{
			System.out.println("Not a Palindrome number");
		}
		
		sc.close();
		

	}

}
