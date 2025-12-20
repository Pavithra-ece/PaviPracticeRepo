package Assignment1;

class Hospital
{
	void emergencyService()
	{
		System.out.println("For emergency Dial 108");
	}
}

class CityHospital extends Hospital
{
	void emergencyService()
	{
		super.emergencyService();
		System.out.println("Apollo City Hospital");
	}

}

public class Question16 {

	public static void main(String[] args) {
		
		CityHospital obj=new CityHospital();
		obj.emergencyService();
	}

}
