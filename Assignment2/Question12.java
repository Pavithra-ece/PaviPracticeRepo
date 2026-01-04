package Assignment2;

import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {
		
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the number to be reversed :");
        
        int num=sc.nextInt();
		
		int rev=0;
   
		while(num!=0)
		{
			int d=num%10;
			if(d==0)
			{
				System.out.println("The Digit is Zero and reversing the number is stopped");
				break;
			}
			rev=rev*10+d;
			num=num/10;
			
			
		}
		
		System.out.println("The reversed number is: "+ rev);
		
		sc.close();

	}

}
