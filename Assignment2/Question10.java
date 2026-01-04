package Assignment2;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number:");
		
		int num=sc.nextInt();
		int sum=0;
		
		if(num>=100 && num<=999)
		{
			while(num!=0)
			{
				int temp=num%10;
				sum=sum+temp;
				num=num/10;
			}
			if(sum%2==0)
			{
				System.out.println("The sum of digits is EVEN");
			}
			else
			{
				System.out.println("The sum of digits is ODD");
			}
		}
		else
		{
			System.out.println("The entered number is not a 3 digit number");
		}
		sc.close();
		
		
		

	}

}
