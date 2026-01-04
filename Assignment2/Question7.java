package Assignment2;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the four numbers :");
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		

		if(a>b && a>c && a>d)
		{
			System.out.println(a+" is the maximum number");
		}
		else if(b>a && b>c && b>d)
		{
			System.out.println(b+" is the maximum number");
		}
		else if(c>a && c>b && c>d)
		{
			System.out.println(c+" is the maximum number");
		}
		else
		{
			System.out.println(d+" is the maximum number");
		}
		sc.close();

	}

}








