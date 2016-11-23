package ThreadDemo;

public class ChangeThreadName extends Thread{

	

	public static void main(String[] args) {
		
		ChangeThreadName c1=new ChangeThreadName();
		ChangeThreadName c2=new ChangeThreadName();
		
		System.out.println("Name of t1 is:"+ c1.getName());
		
		System.out.println("Name of t2 is:"+c2.getName());
		
		System.out.println("id of t1 is:"+ c1.getId());
		
		
		System.out.println("id of t2 is:"+ c1.getId());
		
		c1.start();
		c2.start();
		c2.setName("Spark");
		
		System.out.println("After changing name of t1"+c1.getName());
		System.out.println("After changing name of t2"+c2.getName());

		
		
		
		

	}

}
