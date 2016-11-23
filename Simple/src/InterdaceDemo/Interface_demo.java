package InterdaceDemo;

interface demo
{
	int i=10;
    void print();
    void run();
}
public class Interface_demo implements demo{

	public void print()
	{
		System.out.println("hello");
	}
	
	public void run()
	{
		System.out.println("hiii");
	}
	public void show()
	{
		System.out.println("show method");
	}
    
	public static void main(String[] args) {
		
		Interface_demo id=new Interface_demo();
		System.out.println(i);
		id.print();
		id.run();
		id.show();
		}

}
