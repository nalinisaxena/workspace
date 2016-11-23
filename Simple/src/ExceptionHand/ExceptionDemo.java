package ExceptionHand;

public class ExceptionDemo {

	

	public static void main(String[] args) {
		
		
      try
      {
			int a=10,b=0;
			int c=a/b;
			System.out.println(c);
			
      }
      catch(ArithmeticException e)
      {
    	  System.out.println("divide by zero");
      }
      
      catch(Exception e)
      {
    	  System.out.println("not possible");
      }
      
      System.out.println("after catch");
			
			}

}
