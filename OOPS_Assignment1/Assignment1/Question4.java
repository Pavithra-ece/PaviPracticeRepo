package Assignment1;

class Calculator
{
	int add(int a, int b)
	{
		return a+b;
	}
	double add(double a, double b)
	{
		return a+b;
	}


}

public class Question4 {

	public static void main(String[] args) {
		
		Calculator obj1=new Calculator();
		System.out.println(obj1.add(234, 8)); 
		System.out.println(obj1.add(67.34990d,8.9990d)); 

	}

}
