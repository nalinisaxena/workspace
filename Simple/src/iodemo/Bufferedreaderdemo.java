package iodemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bufferedreaderdemo {

	

	public static void main(String[] args) throws IOException {


		   InputStreamReader is=new InputStreamReader(System.in);
		   
		   BufferedReader br=new BufferedReader(is);
		   
		   System.out.println("Enter the string");
		   
		   String str=br.readLine();
		   
		   System.out.println(str);
		   
		   System.out.println("Enter the rwo number a and b");
		   
		   int a=Integer.parseInt(br.readLine());
		   int b=Integer.parseInt(br.readLine());
		   
		   System.out.println(a+b);
	}

}
