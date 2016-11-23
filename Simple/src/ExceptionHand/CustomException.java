package ExceptionHand;



class InvalidException extends Exception
{
	

	private static final long serialVersionUID = 1L;

	InvalidException(String s)
	{
		super(s);
	}
}
public class CustomException {
 
	void display(int a)throws InvalidException
	{
		if(a<10)
		{
			throw new InvalidException("not valid");
		}
		else
		{
			System.out.println("no is greater than 10");
		}
	}
	public static void main(String[] args) {
		
		
        CustomException ce=new CustomException();
        
        try
        {
        	ce.display(20);
        }
		catch(Exception e)
		{
			System.out.println("Exception is"+e);
		}
		
	}

}
 