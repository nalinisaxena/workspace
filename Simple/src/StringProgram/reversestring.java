package StringProgram;

public class reversestring {

	

	public static void main(String[] args) {

    //using StringBuffer class
		
	String str="nalini";
		
	StringBuffer sb=new StringBuffer(str);
	System.out.println(sb.reverse());
	
	//using iterative method
	
	char[] ch=str.toCharArray();
	
	for(int i=ch.length-1;i>=0;i--)
	{
		System.out.print(ch[i]);
	}
	
	
	
	}
	
	

}