package StringProgram;

import java.util.LinkedHashMap;

public class longestsubstringdemo {

	public static void main(String[] args) {

            String input="javaconceptoftheday";
            
            char ch[]=input.toCharArray();
            
            String longestsubstring=null;
            
            int longestsubstringlen=0;
            
            LinkedHashMap<Character, Integer> lh=new LinkedHashMap<Character, Integer>();
            
            for(int i=0;i<ch.length;i++)
            {
            	char chr=ch[i];
            	
            	if(!lh.containsKey(chr))
            	{
            	   lh.put(chr, i);
            	}
            	
            	else
            	{
            		i=lh.get(chr);
            		lh.clear();
            	}
            	
            	if(lh.size()>longestsubstringlen)
            	{
            		longestsubstringlen=lh.size();
            		
            		longestsubstring=lh.keySet().toString();
            		
            	}
            }
            
            System.out.println("Input string:"+input);
            
            System.out.println("longest sub string:"+longestsubstring);
            
		    System.out.println("length of string:"+longestsubstringlen);
	}

}
