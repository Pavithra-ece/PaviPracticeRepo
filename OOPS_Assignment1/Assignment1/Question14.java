package Assignment1;

class Course
{
	void courseInfo()
	{
		System.out.println(" The available courses are Science,Commerce and Art");
	}
}

class Science extends Course
{
	void display()
	{
		System.out.println("The selected course is Science");
	}
}
class Commerce extends Course
{
	void display1()
	{
		System.out.println("The selected course is Commerce");
	}
}
class Arts extends Course
{
	void display2()
	{
		System.out.println("The selected course is Arts");
	}
}

public class Question14 {

	public static void main(String[] args) {
		
		Arts obj1=new Arts();
		obj1.courseInfo();
		obj1.display2();
		
		Commerce obj2=new Commerce();
		obj2.display1();
		
		Science obj3=new Science();
		obj3.display();
		
				
		

	}

}
