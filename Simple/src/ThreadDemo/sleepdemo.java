package ThreadDemo;

public class sleepdemo extends Thread{
	
	public void run() {
		
              int i;
              for(i=1;i<5;i++)
              {
            	  
                try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					

				}
            		
                System.out.println(i);
            	  
              }
	}

	

	public static void main(String[] args) {

                  sleepdemo sd=new sleepdemo();
                  sd.run();
	}

}
