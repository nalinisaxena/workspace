package StringDemo;

public class StringBf_Demo {

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("Hello");
		sb.append(" Java");
		System.out.println(sb);
		
		StringBuffer sb1=new StringBuffer("Hello");
		sb1.insert(5, " c++");
		System.out.println(sb1);
		
		StringBuffer sb2=new StringBuffer("Hello");
        sb2.replace(2,4,"java");
        System.out.println(sb2);
        
		StringBuffer sb3=new StringBuffer("Hello");
		sb3.delete(2, 4);
		System.out.println(sb3);
		
		StringBuffer sb4=new StringBuffer("Hello");
		sb4.reverse();
		System.out.println(sb4);
		
		StringBuffer sb5=new StringBuffer();
		System.out.println(sb5.capacity());
		sb5.append("java");
		System.out.println(sb5.capacity());
		sb5.append("it is javatpoint tutorial which is good");
		System.out.println(sb5.capacity());
        
	}

}
