package ExceptionHandDemo;

public class throwDemo {
	
	static void avg()
	{
		try{
			throw new ArithmeticException("demo");
		}
		
		catch(ArithmeticException ae)
		{
			System.out.println("Exception caught");
		}
	}

	

	public static void main(String[] args) {

                  avg();
	}

}
