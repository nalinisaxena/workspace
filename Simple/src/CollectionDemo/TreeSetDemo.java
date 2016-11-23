package CollectionDemo;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	

	public static void main(String[] args) {

              TreeSet<Integer> treeadd=new TreeSet<Integer>();
              
              treeadd.add(4);
              treeadd.add(12);
              
              System.out.println("tree="+treeadd.isEmpty());
              
              Iterator<Integer> iterator;
              iterator=treeadd.iterator();
              
              System.out.println("tree set data");
              
              while(iterator.hasNext())
              {
            	  System.out.println(iterator.next()+" ");
            	  
              }
	}

}
