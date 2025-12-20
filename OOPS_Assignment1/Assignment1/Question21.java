package Assignment1;

class University
{

	static String country = "India";
    String universityName;
    
    University(String universityName)
    {
    	this.universityName=universityName;
    	System.out.println(country + " "+ universityName);
    }
    
}


public class Question21 {

	public static void main(String[] args) {
		
		University u1=new University("Anna University");
		University u2=new University("MGR University");
		University u3=new University("Bharathiyar University");
		
		

	}

}
