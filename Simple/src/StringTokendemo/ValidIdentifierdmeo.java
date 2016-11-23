package StringTokendemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidIdentifierdmeo {

	

	public static void main(String[] args) {


		Pattern pt=Pattern.compile("az29394az");
		Matcher m=pt.matcher(args[0]);
		
		if(m.find()&&m.group().equals(args[0]))
		{
			System.out.println("valid Identifier");
		}
		else
		{
			System.out.println("Invalid identifier");
		}
	}

}
