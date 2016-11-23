package CollectionDemo;

import java.util.Enumeration;

import java.util.Vector;

public class VectorDemo {


	public static void main(String[] args) {

              Vector v=new Vector();
              
              System.out.println("initial size:"+v.size());
              
              System.out.println("initial capacity:"+v.capacity());
              
              v.addElement(new Character('A'));
              v.addElement(new Integer(2));
              v.addElement(new Float(3.2));
              v.add(1);
              
              
              
              
              System.out.println("current capacity"+v.capacity());
              
              System.out.println("intitial size:"+v.size());
              
              v.addElement(new Double(6.08));
              
              System.out.println("current capacity"+v.capacity());
              
              
              v.addElement(new Double(7.56));
              v.addElement(new Integer(10));
              
              System.out.println("current capacity"+v.capacity());
              
              v.addElement(new Integer(11));
              v.addElement(new Integer(12));
              
              System.out.println("first element:"+v.firstElement());
              System.out.println("last element:"+v.lastElement());
              System.out.println("current capacity"+v.capacity());

              
              if(v.contains(new Integer(4)))
            	  System.out.println("vector contains"+v.get(0));
              
              Enumeration<Comparable> venum=v.elements();
              
              System.out.println("elements in vector:");
              
              while(venum.hasMoreElements())
              {
            	  System.out.print(venum.nextElement()+" ");
            	  System.out.println();
              }

        }

}
