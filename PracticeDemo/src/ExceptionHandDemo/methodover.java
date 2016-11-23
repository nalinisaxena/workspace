package ExceptionHandDemo;

import java.io.IOException;

class Super
{
	void show()
	{
		System.out.println("Parent class");
	}
}

public class methodover extends Super{
	
	void show() throws ArrayIndexOutOfBoundsException
	{
		System.out.println("Child class");
	}

	

	public static void main(String[] args) {

             Super s=new methodover();
             s.show();
	}

}
