package StringTokendemo;

import java.util.regex.Pattern;

public class Mobilenovalidation {

	

	public static void main(String[] args) {


		System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "7896435485"));
	}

}
