package RegularExpressionDemo;


import java.util.regex.Pattern;

public class splitmethod {

	

	public static void main(String[] args) {


		Pattern p=Pattern.compile("\\s");
		
		String s[]=p.split("Nalini is the best");
		
		for(String s1:s)
		{
			System.out.println(s1);
		}

	}

}
