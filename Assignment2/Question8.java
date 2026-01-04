package Assignment2;
import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your age :");
	    int age=sc.nextInt();
	    
	    System.out.println("Enter your Salary :");
		 int sal=sc.nextInt();	
		 
		 if(age>=25) 
			{
				if(age>=30)
				{
					if (sal>=50000)
					{
						System.out.println("Eligible for loan B");
					}
					else
					{
						System.out.println("Not Eligible for loan B");
					}
				}
				else
				{
					if(sal<30000)
					{
						System.out.println("Eligible for loan A");
					}
					else
					{
						System.out.println("Not Eligible for loan A");
					}
				}
			}	
			else
			{
				System.out.println("Not eligible for Loan A and Loan B");
			}
		 sc.close();
		}
	}


