package StringProgram;

public class stringrotation {

	

	public static void main(String[] args) {


		String s1="javaandroid";
		String s2="javaiphone";
		
		
		
		if(s1.length()!=s2.length())
		{
			System.out.println("S2 is not rotated version of s1");
		}
		else
		{
			
			String s3=s1+s2;
			
		//	System.out.println(s3);
			if(s3.contains(s2))
			{
				System.out.println("s2 is roted version of s1");
			}
			else
			{
				System.out.println("s2 is not roted version of s1");
			}
		}
	}

}