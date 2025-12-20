package Assignment1;

class Shape
{
	void area()
	{
		System.out.println("Area of the shapes");
	}
	
}

class Rectangle extends Shape
{
	void area()
	{
		System.out.println("Area of the Rectangle is L*B");
	}
}

class circle extends Shape
{
	void area()
	{
		System.out.println("Area of the circle is pi*r*r");
	}
}
public class Question8 {

	public static void main(String[] args) {
	
		Shape ref1=new Rectangle();
		ref1.area();
		
		Shape ref2=new circle();
		ref2.area();
		
		

	}

}
