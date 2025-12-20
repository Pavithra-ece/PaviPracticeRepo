package Assignment1;

interface Payment
{
	void makePayment();
}

class UPI implements Payment
{
	public void makePayment()
	{
		System.out.println("Payment transaction is done thorugh UPI");
	}
}

class CreditCard implements Payment
{
	public void makePayment()
	{
		System.out.println("Payment transaction is done thorugh Credit Card");
	}
}

public class Question6 {

	public static void main(String[] args) {
		
		Payment ref1=new UPI();
		ref1.makePayment();
		
		Payment ref2=new CreditCard();
		ref2.makePayment();
		

	}

}
