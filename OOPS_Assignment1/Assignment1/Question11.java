package Assignment1;

class Library
{
	String libraryName;
	
	Library()
	{
		System.out.println("Welcome to the Library!");
	}
	
	void showLocation()
	{
		System.out.println("This library is located in Mumbai");
	}
	
}

public class Question11 {

	public static void main(String[] args) {
		
		Library obj1=new Library();
		obj1.showLocation();

	}

}
