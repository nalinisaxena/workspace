package CollectionDemo;

import java.util.Stack;

public class StackDemo {

	

	public static void main(String[] args) {

             Stack s=new Stack();
             
             s.push("ABC");
             s.push("xyz");
             s.push("pqr");
             s.push(3);
             
             System.out.println("element is stack: "+s);
             
             System.out.println("Top element of stack: "+s.peek());
             
             System.out.println("element after remove: "+ s.pop());
             
             System.out.println("Element after remove:"+s);
             
             System.out.println("searching code in stack: "+s.search("ABC"));
	}

}
