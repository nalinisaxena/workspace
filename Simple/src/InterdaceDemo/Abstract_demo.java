package InterdaceDemo;


abstract class Vehicle
{
	abstract void engine();
	
	void display()
	{
		System.out.println("this is display");
	}
}
public class Abstract_demo extends Vehicle {

	public void engine()
	{
		System.out.println("car engine");
	}
	public static void main(String[] args) {

		Vehicle v=new Abstract_demo();
		
		v.display();
		v.engine();
	}

	}


