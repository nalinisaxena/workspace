package iodemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class filewrite {

	

	public static void main(String[] args) throws IOException {

               File f=new File("four.txt");
               
               //FileOutputStream fos=new FileOutputStream(f);
               
               FileWriter fos=new FileWriter(f); 
               
               String s="i am the best";
               
               char ch[]=s.toCharArray();     //byte[] b=s.getBytes();
                
               fos.write(ch);                 //fos.write(b);
               
               System.out.println("File created successfully");
               
               fos.close();
	}

}
