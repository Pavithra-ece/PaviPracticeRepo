package Assignment1;

class Employee
{
	private int empId; 
	private String empName;
	private float salary;
	
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	void displayDetails()
	{
		System.out.println(empId+ " " + empName + " " + salary+ " ");
	}

}

public class Question1 {

	public static void main(String[] args) {
		
		Employee obj=new Employee();
		obj.setEmpId(902152);
		obj.setEmpName("Pavithra");
		obj.setSalary(25000.56f);
		obj.displayDetails();

	}

}
