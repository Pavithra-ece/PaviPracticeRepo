package Assignment1;

interface Transport
{
	void booking();
}

class Bus implements Transport
{
	public void booking()
	{
		System.out.println("your bus ticket is booked");
	}
}

class Flight implements Transport
{
	public void booking()
	{
		System.out.println("your flight ticket is booked");
	}
}

public class Question18 {

	public static void main(String[] args) {
		
		Transport ref1=new Bus();
		ref1.booking();
		
		Transport ref2=new Flight();
		ref2.booking();
		
		
	}

}
