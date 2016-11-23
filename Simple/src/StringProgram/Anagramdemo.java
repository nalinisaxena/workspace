package StringProgram;

import java.util.Arrays;

// Two strings are called anagrams if they contain same set of characters but in different order.
//For example, “Dormitory – Dirty Room”, “keep – peek”,  “School Master – The Classroom” are some anagrams.



public class Anagramdemo {

	public static void main(String[] args) {
		
		String s1="keep";
		String s2="peek";
		
		String s3=s1.replaceAll("\\s", "");
		String s4=s2.replaceAll("\\s", "");
		
		boolean status=true;
		
		if(s3.length() != s4.length())
		{
			System.out.println("s3 and s4 is not equals");
			status=false;
		}
		
		else
		{
			char[] ch1=s3.toLowerCase().toCharArray();
			char[] ch2=s4.toLowerCase().toCharArray();
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			status=Arrays.equals(ch1, ch2);
		}
			
		if(status)
		{
			System.out.println("s1 and s2 are anagrams");
		}
		
		else
		{
			System.out.println("s1 and s2 are not equals");
		}
		
		


		
	}

}
