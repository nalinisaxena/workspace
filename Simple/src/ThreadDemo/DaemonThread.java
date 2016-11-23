package ThreadDemo;

public class DaemonThread extends Thread{
	
	public void run()
	{
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("Daemon thread work");
		}
		else
		{
			System.out.println("user thread work");
		}
	}

	

	public static void main(String[] args) {
		
		DaemonThread t1=new DaemonThread();
		DaemonThread t2=new DaemonThread();
		
        t2.setDaemon(true);
		
		t2.start();
		
		t1.start();
		
		
		

                    
	}

}
