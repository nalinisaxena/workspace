package ThreadDemo;

public class PriorityThread extends Thread {
	
	public void run()
	{
		System.out.println("running thread name is:"+Thread.currentThread().getName());
		
		System.out.println("running thread is priority is:"+Thread.currentThread().getPriority());
		
		System.out.println("thread is alive:"+Thread.currentThread().isAlive());
	}
	
	

	

	public static void main(String[] args) {
		
		PriorityThread t=new PriorityThread();
		
		t.setPriority(Thread.NORM_PRIORITY+2);
		t.start();

              
	}

}
