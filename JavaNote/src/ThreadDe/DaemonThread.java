package ThreadDe;

class MyThread8 extends Thread
{
	public void run()
	{
		for(int i=0;i<=6;i++)
		{
			System.out.println("lazy thread");
		}
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {

			
		}
		
	}
}

public class DaemonThread {

	public static void main(String[] args) {
		
		MyThread8 t1=new MyThread8();
		
		
		System.out.println("end of main");
		
		t1.setDaemon(true);
		t1.start();
		

        
	}

}
