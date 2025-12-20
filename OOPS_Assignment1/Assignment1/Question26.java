package Assignment1;

class school1 
{
  String name;
  String address;
  int strength;
  
  school1(String name,String address)
  {
	  this.name=name;
	  this.address=address;
  }
  school1(String name,String address,int strength)
  {
	  this(name,address);
	  this.strength=strength;
  }
  
  void display()
  {
	  System.out.println("School details: " + name+ ",  "+address+" ,  "+strength);
  }
  
}

public class Question26 {

	public static void main(String[] args) {
		
		school1 obj=new school1("Premier Vidyaa Vikash","Uliyampalayam,Coimbatore");
		obj.display();
		
		school1 obj1=new school1("Cinmaya Vidyalaya","Navavoor Pirivu,Coimabtore",1200);
		obj1.display();
		

	}

}
