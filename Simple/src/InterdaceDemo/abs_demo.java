package InterdaceDemo;

abstract  class Shape
{
	abstract void drow();
	
	void display()
	{
		System.out.println("this is display");
	}
	
}

class Rectangle extends Shape
{
	void drow()
	{
		System.out.println("this is rectangle");
	}
}

class Circle extends Shape
{
	void drow()
	{
		System.out.println("this is circle ");
	}
}
public class abs_demo {

	 public static void main(String[] args) {
		 
		 Shape s1=new Rectangle();
		 Shape s2=new Circle();
		 
		 s1.drow();
		 s1.display();
		 s2.drow();
		

	}

}
