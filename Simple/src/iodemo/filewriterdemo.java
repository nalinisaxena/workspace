package iodemo;

import java.io.FileWriter;
import java.io.IOException;

public class filewriterdemo {

	

	public static void main(String[] args) throws IOException {

               FileWriter fw=new FileWriter("abc.txt",true);
               
               fw.write(100);
               
               fw.write("hello \n i am nalini");
               
               char[] ch={'a','b','c'};
               fw.write('\n');
               fw.write(ch);
               fw.write('\n');
               fw.flush();
               fw.close();
	}

}
