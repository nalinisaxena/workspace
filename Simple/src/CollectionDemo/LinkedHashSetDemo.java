package CollectionDemo;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	

	public static void main(String[] args) {
		
		String remEle="C";


		LinkedHashSet<String> ls=new LinkedHashSet<String>();
		ls.add("A");
		ls.add("C");
		ls.add("B");
	    ls.add("A");
	    
	    System.out.println("Before remove");
	    System.out.println(ls);
	    
	    Iterator it=ls.iterator();
    
        while(it.hasNext())
       {
    	System.out.println(it.next());
    	
    	if(remEle.equals(it.next()))
    	{
    		it.remove();
    	}
      }
        System.out.println("After remove");
        System.out.println(it);
		
		
		

	}

}