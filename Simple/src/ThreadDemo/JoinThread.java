package ThreadDemo;

public class JoinThread extends Thread
  {
	public void run()
	{
		System.out.println("r1");
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			
			System.out.println("r2");
			

		}
	}
	

	

	public static void main(String[] args)throws InterruptedException {
		
		JoinThread t=new JoinThread();
		JoinThread t1=new JoinThread();
		t.start();
		t.join();
		t1.start();
		


	}

}
