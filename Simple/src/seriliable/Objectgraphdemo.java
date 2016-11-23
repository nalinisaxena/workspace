package seriliable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog implements Serializable
{
	Cat c=new Cat();
}

class Cat implements Serializable
{
	Rat r=new Rat();
}

class Rat implements Serializable
{
	int j=20;
}

public class Objectgraphdemo {

	

	public static void main(String[] args) throws Exception, IOException {
		
		Dog d=new Dog();
		
		FileOutputStream fos=new FileOutputStream("dog.txt");
		
		ObjectOutputStream os=new ObjectOutputStream(fos);
		
		os.writeObject(d);
		
		FileInputStream fis=new FileInputStream("dog.txt");
		
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		Dog d1=(Dog)ois.readObject();
		
		System.out.println(d1.c.r.j);

             
	}

}
