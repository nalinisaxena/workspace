package CollectionDemo;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {


	public static void main(String[] args) {


		TreeMap<Integer,String> tm=new TreeMap<Integer,String>();
		
		tm.put(100, "Abc");
		tm.put(300, "cdf");
		tm.put(200, "hfjf");
		
		for(Map.Entry m:tm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
