package Assignment1;

class Account
{
	private String accountHolderName;
	private double balance;
	
	
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
		if(balance<0)
		{
			System.out.println("Negative values are not accepted");
		}
	}
	
}

public class Question12 {

	public static void main(String[] args) {
		
		Account obj1=new Account();
		obj1.setAccountHolderName("Pavithra");
		obj1.setBalance(-21);
		
		Account obj2=new Account();
		obj2.setAccountHolderName("Pavi");
		obj2.setBalance(21);
		
//		System.out.println(obj1.getAccountHolderName());
//		System.out.println(obj1.getBalance());
//		
//		System.out.println(obj2.getAccountHolderName());
//		System.out.println(obj2.getBalance());
		
		
		

	}

}
