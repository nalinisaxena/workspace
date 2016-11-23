package CollectionDemo;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListItratorDemo {

	

	public static void main(String[] args) {


		ArrayList<String> al=new ArrayList<String>();
		
		al.add("C");
		al.add("A");
		al.add("D");
		al.add("B");
		
		System.out.println(al);
		
		ListIterator li=al.listIterator();
		
		System.out.println("Element after forward dirction");
		
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		
		System.out.println("Element after beckword dirction");

	    while(li.hasPrevious())
	    {
	    	System.out.println(li.previous());
	    }
	
	}

}
