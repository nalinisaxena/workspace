package CollectionDemo;

import java.util.Hashtable;
import java.util.Enumeration;

public class HashTableDemo {

	

	public static void main(String[] args) {
		
		Hashtable ht=new Hashtable();
		Hashtable htclone=new Hashtable();
		
		ht.put(4, 10);
		ht.put(2, 30);
		ht.put(5,50);

	    


		
		System.out.println("hash table content:"+ht);
		
		htclone=(Hashtable)ht.clone();
		
		System.out.println("clone table content"+htclone);
		
		//boolean b=ht.contains("C");
		
		//System.out.println("hash table contains 'C':"+b);
		
		System.out.println("values at key 2 is"+ht.get(2));
		
		Enumeration e=ht.elements();
		
		System.out.println("display result:");
		
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}

              
	}

}
