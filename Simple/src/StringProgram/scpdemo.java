package StringProgram;

public class scpdemo {

	

	public static void main(String[] args) {

        String s1="java";
        
        String s2="java";
        
        System.out.println(s1==s2);
        
         s1=s1+"j2ee";
        
         System.out.println(s1==s2);
        
         String s3=new String("hello");
         
         s3.concat("hii");
         
         System.out.println(s3);
        
	}

}
