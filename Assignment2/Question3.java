package Assignment2;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a year to check whether Leap year or not :");
		
		int year=sc.nextInt();
		
		if((year%4==0)&& (year%100!=0))
		{
			System.out.println("The entered year is a Leap year!");
		}
		else
		{
			System.out.println("The entered year is not a Leap year!");
		}
		sc.close();
		
	}

}
