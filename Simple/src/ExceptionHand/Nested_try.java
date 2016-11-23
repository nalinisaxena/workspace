package ExceptionHand;

public class Nested_try {

   
	public static void main(String[] args) {

                 try
                 {
                	 try
                	 {
                		 int a=10,b=0;
                		int  c=a/b;
                		 System.out.println(c);
                	 }
                	 catch(ArithmeticException e)
                	 {
                		 System.out.println("divide by zero");
                	 }
                	 try
                	 {
                		 int arr[]=new int[5];
                		 arr[8]=44;
                	 }
                	 catch(ArrayIndexOutOfBoundsException a)
                	 {
                		 System.out.println("out of bound");
                	 }
                	 
                	 String s=null;
                	 System.out.println(s.length());
                	 
                	 
                 }
                 catch(Exception e)
                 {
                	 System.out.println("Exception "+e);
                 }
                 
                 System.out.println("last line");
	}
	

}
