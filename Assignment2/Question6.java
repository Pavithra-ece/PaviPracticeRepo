package Assignment2;
import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
			
          Scanner sc=new Scanner(System.in);
          
          System.out.println("Enter the Maths marks: ");
          int math=sc.nextInt();
          System.out.println("Enter the Physics marks: ");
          int phy=sc.nextInt();
          System.out.println("Enter the Chemistry marks: ");
          int chem=sc.nextInt();
          
          int total= math+phy+chem;
          int ave=math+phy;
          
          if(math>=60 && phy>=50 && chem>=40)
          {
        	  System.out.println("The Student is Eligible!");
          }
          else if(total>=180)
          {
        	  System.out.println("The Student is Eligible!");
          }
          else if(ave>=120)
          {
        	  System.out.println("The Student is Eligible!");
          }
          else
          {
        	  System.out.println("The Student is not Eligible!!");
          }
          sc.close(); 
          }

}
