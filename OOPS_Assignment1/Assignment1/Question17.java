package Assignment1;

abstract class Employee1
{
	
	
	abstract void calculateSalary();

	void employeeDetails()
	{
		System.out.println("The Salary of Employee is displayed");
	}

}

class FullTimeEmployee extends Employee1
{
	
	int Rate;
	float hours;
	FullTimeEmployee(String name,int Rate,float hours)
	{
		
		this.Rate=Rate;
		this.hours=hours;
	}
	void calculateSalary()
	{
		float FTE=Rate * hours;
		System.out.println("The salary of Full time Employee is " +FTE);
	}
}

class PartTimeEmployee extends Employee1
{
	String name;
	int Rate;
	float hours;
	int x=100;
	
	PartTimeEmployee(String name,int Rate,float hours)
	{
		
		this.Rate=Rate;
		this.hours=hours;
	}
	void calculateSalary()
	{
		float PTE=Rate * hours/x;
		System.out.println("The salary of Part time Employee is "+PTE);
	}
}


public class Question17 {

	public static void main(String[] args) {
		
		FullTimeEmployee obj1=new FullTimeEmployee("Pavithra",1500,8.5f);
		obj1.employeeDetails();
		obj1.calculateSalary();
		
		PartTimeEmployee obj2=new PartTimeEmployee("Pavi",1000,10.30f);
		obj2.calculateSalary();
		

	}

}
