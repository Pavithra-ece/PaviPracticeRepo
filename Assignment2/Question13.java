package Assignment2;

import java.util.Scanner;

public class Question13 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number :");
		
		int num=sc.nextInt();
		
		int count=0;
		   
		while(num!=0)
		{
			int d=num%10;
			if (d==2 || d==3 || d==5 || d==7)
	        {
	          count=count+1;
	         }
	        num=num/10;
	       }
		System.out.println("The total count of prime digits in the entered number is " +count); 
		
		sc.close();
		
		}
		
	}
		
		
		
		
		

	


