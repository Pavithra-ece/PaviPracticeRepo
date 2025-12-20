package Assignment1;

class LoanCalculator
{
	int calculateLoan(int amount)
	{
		return amount;
	}
	
	double calculateLoan(int amount, double interestRate)
	{
		return amount * (interestRate/100);
	}

}

public class Question15 {

	public static void main(String[] args) {
		
		LoanCalculator obj=new LoanCalculator();
		
		System.out.println("The amount is Rs." + obj.calculateLoan(9764));
		System.out.println("The interest amount of Loan is " +obj.calculateLoan(9764, 15.5789));
		

	}

}
