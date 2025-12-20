package Assignment1;

class GovernmentRules 
{
	 final int MAX_WORKING_HOURS = 8;
	 void display()
	 {
		 System.out.println(MAX_WORKING_HOURS);
	 }
}

public class Question22 {

	public static void main(String[] args) {
		
		GovernmentRules obj=new GovernmentRules();
		obj.display();
		
		obj.MAX_WORKING_HOURS=12;
		
}

}
