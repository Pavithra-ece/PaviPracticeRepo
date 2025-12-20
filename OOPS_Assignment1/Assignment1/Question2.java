package Assignment1;

class Vehicle
{
	void fuelType()
	{
		System.out.println("Runs on fuel");
	}
}

class ElectricCar extends Vehicle
{
	void fuelType()
	{
		System.out.println("Runs on electricity");
	}
}


public class Question2 {

	public static void main(String[] args) {
		
		Vehicle obj1=new Vehicle();
		obj1.fuelType();
		
		ElectricCar obj2=new ElectricCar();
		obj2.fuelType();
		

	}

}

