package Assignment2;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Character : ");
		
		char ch=sc.next().charAt(0);
		
		if(ch>= 'A' && ch<='Z')
		{
			if (ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' )
			{
				System.out.println("The Entered character is a Uppercase Vowel");
			}
			else
			{
				System.out.println("The Entered character is a Uppercase Constant");
			}
		}
		else 
		{
			if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			{
				System.out.println("The Entered character is a Lowercase Vowel");
			}
			else
			{
				System.out.println("The Entered character is a Lowercase Constant");
			}
		}
		sc.close();
		
		
		
	}

}
