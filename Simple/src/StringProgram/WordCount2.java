package StringProgram;

import java.util.Scanner;

public class WordCount2 {

	

	public static void main(String[] args) {


	   System.out.println("Enter the string");
		
		Scanner sc=new Scanner(System.in);
		
		String str=sc.nextLine();
		
		

		
		int count=1;
		
		for(int i=0;i<str.length();i++)
		{
			if((str.charAt(i)==' ') && (str.charAt(i+1)!=' '))
			{
				count++;
			}
			
			
		} 
		System.out.println("Number of words in a String is:"+count);
		
	}

}
