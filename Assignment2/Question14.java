package Assignment2;

public class Question14 {

	public static void main(String[] args) {
		
		int n1=0;
		int n2=1;
		int N=100;
		
		System.out.println("The Fibonacci Series is ");
		
	    for(int i=2;i<N;i++)
		    {
		    	int n3=n1+n2;
		    	n1=n2; 
		    	n2=n3;
		    	if(n3>=500)
		    	{
		    		break;
		    	}
		    	System.out.print(" "+n3);
		    
		    }
	    }

}
