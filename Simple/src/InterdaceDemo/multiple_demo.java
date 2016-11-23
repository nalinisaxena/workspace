package InterdaceDemo;

interface A1
{
	void show();
}

class B1
{
	void show()
	{
		System.out.println("normal method");
	}
}

public class multiple_demo extends B1 implements A1

{
	public void show()
	{
		super.show();
		System.out.println("welcome");
	}
	
	 public static void main(String[] args) {
		 
		 multiple_demo md=new multiple_demo();
		 md.show();
		 
		}

}
