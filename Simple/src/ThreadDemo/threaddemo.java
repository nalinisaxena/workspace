package ThreadDemo;

public class threaddemo extends Thread{
	
	public void run() 
	{
		System.out.println("thread is running");


	          }

	public static void main(String[] args) {
		
		
		threaddemo t=new threaddemo();
		t.start();

               
	}

}
