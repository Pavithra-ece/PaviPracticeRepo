package Assignment1;

class Bank
{
	final int IFSC=1234567890;
	
	final void showIFSC()
	{
		System.out.println("The IFSC code is " +IFSC);
	}
}

//class HDFCBank extends Bank
//{
//	void showIFSC()
//	{
//		System.out.println("The IFSC code of HDFC Bank is " +IFSC);
//	}
//}





public class Question9 {

	public static void main(String[] args) {
		
//		HDFCBank obj1=new HDFCBank();
//		obj1.showIFSC();
		
		Bank obj2=new Bank();
		obj2.showIFSC();
		
		
	

	}

}
