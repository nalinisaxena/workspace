package ExceptionHand;

class TooYoungException extends RuntimeException
{
	private static final long serialVersionUID = 1L;

	public TooYoungException(String s) {
                 super(s);
 	}
}

public class CustomException2 {

	public static void main(String[] args) {

                int age=20;
                
                if(age>60)
                {
                	throw new TooYoungException("plz wait some more time");
                }
                else if(age<18)
                {
                	throw new TooYoungException("ur age is aiready crossed");
                }
                else
                {
                	System.out.println("you are not matched");
                }
	}

}
