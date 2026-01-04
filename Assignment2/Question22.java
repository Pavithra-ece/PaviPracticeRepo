package Assignment2;



public class Question22 {

	public static void main(String[] args) {
		
		int largest =0;
		for(int i=100;i<=999;i++)
		{
			int num =i;
			int rev = 0;
			for(int temp = num; temp>0;temp=temp/10)
			{
				int d = temp %10;
				rev = rev *10 + d;
			}
			if(num == rev)
			{
				largest = num;
			}
		}
		System.out.println("Largest palindrome number between 100 and 1000 is : " + largest);


	}

}
