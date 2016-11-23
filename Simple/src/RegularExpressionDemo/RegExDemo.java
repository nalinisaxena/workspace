package RegularExpressionDemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;





public class RegExDemo {

	

	public static void main(String[] args) {

               Pattern p=Pattern.compile("ab");
               Matcher m=p.matcher("aabbbababbbb");
               
               while(m.find())
               {
            	   System.out.println(m.start()+ " "+m.end()+" " +m.group() );
               }
               
               
	}

}
