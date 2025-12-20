package Assignment1;

class Student1
{
	static String collegeName="Hindusthan";
	String name; 
	int rollNo;
	
	Student1(String name, int rollNo)
	{
		
		this.name=name;
		this.rollNo=rollNo;
	}
	
	void display()
	{
		System.out.println(collegeName+ " "+ name + " " + rollNo);
	}

}

public class Question10 {

	public static void main(String[] args) {
		
		Student1 obj=new Student1("Pavithra",12345);
		obj.display();
		Student1 obj1=new Student1("Suresh",12346);
		obj1.display();
		Student1 obj2=new Student1("Ramesh",12347);
		obj2.display();
		
		

	}

}
