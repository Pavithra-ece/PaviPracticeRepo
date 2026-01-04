package Assignment2;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Number: ");
	    int a=sc.nextInt();
		
		//int a=123;
	    
	    if(a>=50 && a<=200 && a%3==0 && a%5!=0) 
	    {
	    	System.out.println("Number is Valid");
	    }
	    else
	    {
	    	System.out.println("Number is Invalid");
	    }
	    
	    sc.close();
	    }
}


