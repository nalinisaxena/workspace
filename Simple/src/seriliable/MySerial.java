package seriliable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MySerial {


	public static void main(String[] args) throws IOException, IOException {

          student s1=new student (1,"nalini");
          
          ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("sparkdb.txt"));
          
          out.writeObject(s1);
          
          out.flush();
          
          System.out.println("Success");
	}

}
