package iodemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class filereaddemo {

	

	public static void main(String[] args) throws IOException {
		
                File f=new File("abc.txt");
                
                FileReader fr=new FileReader(f);
                
                System.out.println(fr.read());
                
                char[] ch=new char[(int)(f.length())];
                
                fr.read(ch);
                
                for(char c1:ch)
                {
                	System.out.println(c1);
                }
                
                System.out.println("**********......");
                
                FileReader fr1=new FileReader(f);
                
                int i=fr1.read();
                
                while(i!=-1)
                {
                	System.out.println((char)i);
                	i=fr1.read();
                }
                
                
	}

}
