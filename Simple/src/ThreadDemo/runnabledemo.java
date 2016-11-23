package ThreadDemo;

public class runnabledemo implements Runnable {
	
	public void run() {
		
        System.out.println("thread is running by interface");
		
	}

	

	public static void main(String[] args) {
		
		runnabledemo r=new runnabledemo();
		Thread t=new Thread(r);
		t.start();

                         
	}

}
