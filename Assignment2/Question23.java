package Assignment2;

public class Question23 {

	public static void main(String[] args) {
		
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(j==3)
				{
					continue;
				}
				System.out.print(j);
				
			}
			System.out.println();
		}


	}

}
