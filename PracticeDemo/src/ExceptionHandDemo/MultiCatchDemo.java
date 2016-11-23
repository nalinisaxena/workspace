package ExceptionHandDemo;

public class MultiCatchDemo {
	
	public static void main(String args[])
	{
		try
		{
			int a=10,b=0;
			int c=a/b;
			
			System.out.println("Hello");
			
		}
		
		catch(Exception e)
		{
			System.out.println("Array exception");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Exception is handled");
		}
			
		
		
		
		
	}

}
