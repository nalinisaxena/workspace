package CollectionDemo;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	

	public static void main(String[] args) {

               LinkedHashMap<Integer,String> lh=new LinkedHashMap<Integer, String>();
               
               lh.put(100,"Iphone");
               lh.put(200, "Testing");
               lh.put(50, "java");
               
               
               System.out.println(lh);
               
               for(Map.Entry m:lh.entrySet())
               {
            	   System.out.println(m.getKey()+" "+m.getValue());
               }
	}

}
