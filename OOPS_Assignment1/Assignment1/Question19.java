package Assignment1;

class Camera
{
	void capture()
	{
		System.out.println("The Photo is captured in Mobile Camera");
	}
}

class DSLCamera extends Camera
{
	void capture()
	{
		System.out.println("The Photo is captured in DSLCamera");
	}
}


	
public class Question19 {

	public static void main(String[] args) {
		
		
		Camera obj1=new Camera();
		obj1.capture();
		
		DSLCamera obj2=new DSLCamera();
		obj2.capture();

	}


}
