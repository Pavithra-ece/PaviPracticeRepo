package Assignment1;

class Person
{
	Person()
	{
		System.out.println("Person Created");
	}
}

class Student extends Person
{
	Student()
	{
		super();
		System.out.println("Student Created");
	}
	
}

public class Question7 {

	public static void main(String[] args) {
		
		Student obj1=new Student();

	}

}
