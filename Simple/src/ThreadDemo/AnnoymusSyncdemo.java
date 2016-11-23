package ThreadDemo;

class Table1
{
	synchronized void printTable(int n)
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(n*i);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				
                System.out.println(e);
			}

		}
	}
}
public class AnnoymusSyncdemo {

	

	public static void main(String[] args) {
		
		final Table1 obj=new Table1();
		
		Thread t=new Thread()
		{
		
		public void run()
		{
			obj.printTable(5);
		}


	};
	
	 Thread t1=new Thread()
	 {
	 public void run()
	 {
		 obj.printTable(100);
	 }
	 };
	 
	 t.start();
	 t1.start();

}
}