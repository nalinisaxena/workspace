package CollectionDemo;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	

	public static void main(String[] args) {
		
		HashMap< String,Integer> hm=new HashMap<String,Integer>();
		
		hm.put( "Android ",100);
		hm.put( "iphone ",200);
		hm.put("testing ",30);
		
		

		
		
		for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getKey()+""+m.getValue());
		}
		
		

                   
	}

}
