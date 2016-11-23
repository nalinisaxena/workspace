package StringProgram;

import java.util.HashMap;
import java.util.Set;

public class DuplicateWordsCount {


	public static void main(String[] args) {
		
		String str="Hello hii hello hii";
		String []words=str.split(" ");


		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		
		for(String word:words)
		{
			if(hm.containsKey(word.toLowerCase()))
			{
				hm.put(word.toLowerCase(),hm.get(word.toLowerCase())+1);
			}
			else
			{
				hm.put(word.toLowerCase(), 1);
			}
		}
		
		Set<String> wordinstring =hm.keySet();
		
		for(String word:wordinstring)
		{
			if(hm.get(word)>1)
			{
                System.out.println(word+" : "+hm.get(word));

			}
		}
		
		
		
		
	}

}
