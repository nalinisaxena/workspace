package InterdaceDemo;

interface demo1
{
	void methodA();
}

class demo2 implements demo1
{
	public void methodA()
	{
		System.out.println("demo2");
	}
}

interface demo3 extends demo1
{
	void methodC();
	
}
public class hybrid_demo extends demo2 implements demo3{

     public void methodC()
     {
    	 System.out.println("this is c");
     }
     
     public void methodB()
     {
    	 System.out.println("this is B");
     }
	public static void main(String[] args) {
		
		hybrid_demo hd=new hybrid_demo();
		hd.methodA();
		hd.methodB();
	    hd.methodC();
	}

}
