package Assignment2;

import java.util.Scanner;

public class Question17 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number:");
		
		int num=sc.nextInt();
		
		int div=1, d;
			
       int temp = num;  
		while(temp>10)
		{
			temp=temp/10;  
			div=div*10;     
		}	
		do
		{
			d=num/div;      
			System.out.print(d+" ");
			num=num%div;
			div=div/10;
		}
         while(div>0);
		
		sc.close();
		}
}


