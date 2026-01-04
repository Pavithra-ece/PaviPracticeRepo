package Assignment2;

public class Question21 {

	
static boolean isPrime(int num) 
{
   if (num <= 1) 
	  {
	     return false;
	   }
	for (int i = 2; i <= Math.sqrt(num); i++)
	   {
	            if (num % i == 0) 
	            	{
	            	return false;
	                }
	   }
		
	return true;
}
	    

	    public static void main(String[] args) {
	        System.out.println("Numbers between 1 and 500 with exactly 3 divisors:");

	       
	        for (int i = 2; i <= 22; i++)   //22 square less than 500
	        {
	            if (isPrime(i)) 
	            {
	                int square = i * i;
	                if (square <= 500) 
	                {
	                    System.out.println(square);
	                    
	                }
	            }
	        }

		
}}


