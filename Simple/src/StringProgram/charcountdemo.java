package StringProgram;

import java.util.HashMap;

public class charcountdemo {

	

	public static void main(String[] args) {

       HashMap<Character, Integer> hm=new HashMap<Character,Integer>();
       
       String str="nalini";
       
       char[] ch=str.toCharArray();
       
       for(char c:ch)
       {
    	   if(hm.containsKey(c))
    	   {
    		   hm.put(c,hm.get(c)+1);
    	   }
    	   else
    	   {
    		   hm.put(c, 1);
    	   }
       }
       
       System.out.println(hm);
       
		
	}

}
