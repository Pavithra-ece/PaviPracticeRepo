package Assignment2;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int num=sc.nextInt();
		
		
		if(num%2==0 && num%3==0)
		{
			System.out.println("A");
		}
		else if (num%3==0 && num%2!=0)
		{
			System.out.println("B");
		}
		else if (num%2==0 && num%3!=0)
		{
			System.out.println("C");
		}
		else
		{
			System.out.println("D");
		}
		sc.close();
		

	}

}
