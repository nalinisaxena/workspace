package StringProgram;

public class splitmethoddemo {

	

	public static void main(String[] args) {


		String s="www.google.com";
		
		String[] s1=s.split("\\.");
		
		for(String s2:s1)
		{
			System.out.println(s2);
		}
	}

}
