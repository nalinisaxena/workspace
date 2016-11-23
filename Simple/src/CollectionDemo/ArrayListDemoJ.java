package CollectionDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemoJ {

	
	public void display()
	{
		final int MAX=3;
		int counter=0;
		
		List list=new ArrayList();
		
		for(int i=0;i<=MAX;i++)
		{
			list.add(i);
		}
		list.add("hello");
		list.add("hii");
		list.add("Welcome");
		list.add("Collection");
		
		Iterator i=list.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
			
		}
		System.out.println("..............");
		
        ListIterator li=list.listIterator();
        
        while(i.hasNext())
        {
        	System.out.println("previous Index="+li.previousIndex());
        	System.out.println("has previous="+li.hasPrevious());
        }
        
        System.out.println("Element["+counter+"]="+li.next());
        
        System.out.println("has next="+li.hasNext());
		
        System.out.println("has Index="+li.nextIndex());
        
        counter++;
        
        System.out.println("..............");
        
	
	
	int loc=list.indexOf("hello");
	
     System.out.println("index location of 'hello' is==="+loc);
     
     System.out.println("Is list is empty="+list.isEmpty());
     
     System.out.println("converting list to array");

     Object[] objArray=list.toArray();
     
     for(int j=0;j<objArray.length;j++)
     {
    	 System.out.println("Array element["+j+"]="+objArray[j]);
     }
	}

     
	public static void main(String[] args) {


		ArrayListDemoJ al=new ArrayListDemoJ();
		al.display();

	}

}
