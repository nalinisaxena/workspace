package ThreadDe;

class MyThread2 extends Thread
{
	public void run()
	{
		System.out.println("run()");
	}
	public void run(int i)
	{
		System.out.println("run(int i)");
	}
}

public class threadOverloading {


	public static void main(String[] args) {
		
		MyThread2 t=new MyThread2();
		t.start();
	

                  
	}
}
