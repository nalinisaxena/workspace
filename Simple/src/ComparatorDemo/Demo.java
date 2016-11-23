package ComparatorDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Demo {

	
public static void main(String[] args) {
	
	ArrayList al=new ArrayList();
	
	al.add(new Student(1001,"Ipone",15000));
	al.add(new Student(101,"Android",18000));
	al.add(new Student(200,"Testing",20000));
	
	System.out.println("Sorting by name...");
	
	Collections.sort(al,new NameComapre());
	
	Iterator itr=al.iterator();
	
	while(itr.hasNext())
	{
		Student st=(Student)itr.next();
		System.out.println(st.id+" "+st.name+" "+st.fees);
	}
	
System.out.println("Sorting by id...");
	
	Collections.sort(al,new idCompare());
	
	Iterator itr1=al.iterator();
	
	while(itr1.hasNext())
	{
		Student st1=(Student)itr1.next();
		System.out.println(st1.id+" "+st1.name+" "+st1.fees);
	}
	

               
	}

}
