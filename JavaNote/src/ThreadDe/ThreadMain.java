package ThreadDe;

class MyThread extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("child thread");
		}
		
	}
}

public class ThreadMain {

	
           
	public static void main(String[] args) {
		
		MyThread t=new MyThread();
		t.start();
		
		for(int i=0;i<=3;i++)
		{
			System.out.println("main thread");
		}
		

	}

}
