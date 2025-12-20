package Assignment1;

class Product
{
	int productId; 
	String productName;
	float price;
	
	Product()
	{
		System.out.println("Product Created");
	}
	
	Product(int a,String b,float c)
	{
		productId=a;
		productName=b;
		price=c;
		
	}
	
	void displayProduct()
	{
		System.out.println(productId + " " + productName+ " " + price+ " ");
	}
	
}

public class Question3 {

	public static void main(String[] args) {
		
		Product obj1=new Product();
		Product obj2=new Product(267,"nosepin",350.68f);
		obj2.displayProduct();

	}

}
