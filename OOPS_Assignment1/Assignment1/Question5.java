package Assignment1;

abstract class Animal
{
	abstract void sound();
		
}

class Dog extends Animal
{

	void sound() 
	{
	
		System.out.println("Bark Bark");
		
	}
	
}
class Cat extends Animal
{
	void sound()
	{
		System.out.println("Meow Meow");
	}
}

public class Question5 {


	public static void main(String[] args) {
		
		
		Dog obj1= new Dog();
		obj1.sound();
		
		Cat obj2=new Cat();
		obj2.sound();
			

	}

}
