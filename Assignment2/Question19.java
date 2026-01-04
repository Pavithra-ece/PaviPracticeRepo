package Assignment2;

import java.util.Scanner;

public class Question19 {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		int ch;
		
		do
		{
			System.out.print("Enter your choice(1,2,3):");
		    ch=sc.nextInt();
			
		    System.out.print("Enter number 1:");
	        int num1=sc.nextInt();
			
			System.out.print("Enter number 2:");
			int num2=sc.nextInt();
			
		    switch(ch)
		    {
		    case 1:
		    {
			  int num3=num1+num2;
			  System.out.println("Addition of two numbers is :"+num3);
			  break;
			}
		    case 2:
		    {
			  int num3=num1-num2;
			  System.out.println("Subtraction of two numbers is :"+num3);
			  break;
		     }
		    case 3:
		    {
			int num3=num1*num2;
			System.out.println("Multiplication of two numbers is :"+num3);
			break;
		    }
		    default:
		    {
			System.out.println("Exit");
			break;
		    }
		    }
		
		
		}while(ch!=0);
		sc.close();
	}
}


