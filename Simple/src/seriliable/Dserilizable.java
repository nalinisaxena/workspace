package seriliable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Dserilizable {

	

	public static void main(String[] args) throws  Exception {

             ObjectInputStream in=new ObjectInputStream(new FileInputStream("sparkdb.txt"));
             
             student s1=(student)in.readObject();
             
             System.out.println(s1.id+" "+s1.name);
             
	}

}
