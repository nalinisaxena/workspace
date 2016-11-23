package StringTokendemo;

import java.util.StringTokenizer;

public class Simpledemo {

	

	
	public static void main(String[] args) {

       // StringTokenizer st=new StringTokenizer("nalini cmumbai janu");
		
		StringTokenizer st=new StringTokenizer("1,00,000",",");
        while(st.hasMoreElements())
        {
        	System.out.println(st.nextToken());
        }
		
	}

}
