package iodemo;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class fileiosteram {

	

	public static void main(String[] args) throws IOException {

                //FileInputStream fis=new FileInputStream("four.txt");    //file reading by ByteStream
		
		        FileReader fr=new FileReader("four.txt");        //file reading by Character Stream
                
                
                
                int ch;
                ch=fr.read();
                
                while(ch!=-1)
                {
                	System.out.print(""+(char)ch);
                	ch=fr.read();
                }
                
                fr.close();
	}

}
