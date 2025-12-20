package Assignment1;

class Device
{
	void start()
	{
       System.out.println("Device is started");
	}
}
	
class Mobile extends Device
{
	void calling()
	{
		System.out.println("Calling from Mobile");
	}

}
class SmartPhone extends Mobile
{
	
	void internet()
	{
		System.out.println("Internet acess using Smartphone");
	}

}
	

public class Question13 {

	public static void main(String[] args) {
		
		
		SmartPhone obj1=new SmartPhone();
		
		
		obj1.start();
		obj1.calling();
		obj1.internet();
		
		

	}
		

	}


