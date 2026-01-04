package Assignment2;

public class Question2 {

	public static void main(String[] args) {
		
		int a=17;
		int b=19;
		int c=18;
		
		if ((a>b &&  a<c) || (a<b && a>c))

		{
			System.out.println("The second largest number is "+a);
		}
		else if ((b>a && b<c) || (b<a && b>c))
		{
			System.out.println("The second largest number is "+b);
		}
		else
		{
			System.out.println("The second largest number is "+c);
		}
			
			
}}
