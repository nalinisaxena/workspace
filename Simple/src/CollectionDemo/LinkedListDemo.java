package CollectionDemo;

import java.util.LinkedList;

public class LinkedListDemo {

	

	public static void main(String[] args) {

             LinkedList<String> ls=new LinkedList<String>();
             
             ls.add("a");
             ls.add("b");
             ls.add("c");
             ls.add("c");
             
             System.out.println("peek up element is:"+ls.peek());
             
            // ls.add(3, "z");
             
            // ls.addFirst("f");
             
            // ls.addLast("w");
             
           //  ls.clear();
             
             for(String str:ls)
             {
            	 System.out.println(str);
             }
	}

}
