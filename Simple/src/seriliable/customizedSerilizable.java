package seriliable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Account implements Serializable
{
	String username="nalini";
	transient String Password="cmumbai";
}

public class customizedSerilizable {

	

	public static void main(String[] args) throws Exception {
		
		Account ac=new Account();
		System.out.println(ac.username+" "+ac.Password);
		
		FileOutputStream fos=new FileOutputStream("acc.txt");
		
		ObjectOutputStream os=new ObjectOutputStream(fos);
		
		os.writeObject(ac);
		
		FileInputStream fis=new FileInputStream("acc.txt");
		
		ObjectInputStream oi=new ObjectInputStream(fis);
		
		Account ac2=(Account)oi.readObject();
		
		
		System.out.println(ac2.username +" "+ac2.Password);

                 
	}

}
