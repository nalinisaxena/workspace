package StringHandDemo;

public class StringMethod {


	public static void main(String[] args) {

                   String s="Nalini";
                   
                   
                   System.out.println(s.length());
                   
                   System.out.println(s.charAt(3));
                   
                   System.out.println(s.codePointAt(3));
                   
                   System.out.println(s.isEmpty());
                   
                   System.out.println(s.codePointBefore(4));
                   
                   System.out.println(s.codePointCount(2, 5));
                   
                   System.out.println(s.offsetByCodePoints(3, 3));
                   
                   char[] ch=new char[30];
                   s.getChars(2, 4, ch, 0);
                   System.out.println(ch);
                   
                   byte[] br=s.getBytes();
                   for(int i=0;i<br.length;i++)
                   {
                	   System.out.println(br[i]);
                   }
                   
                   String s1="abcdeF";
                   System.out.println(s.equals(s1));
                   
                   
                   StringBuffer sb=new StringBuffer("neha");
                   System.out.println(s.contentEquals(sb));
                   
                   System.out.println(s.contentEquals(s1));
                   
                   System.out.println(s.equalsIgnoreCase(s1));
                   
                   System.out.println(s.compareTo(s1));
                   
                   System.out.println(s.compareToIgnoreCase(s1));
                   
                   System.out.println(s.regionMatches(4, s1, 4, 2));
                   
                   System.out.println(s.regionMatches(false, 4, s1, 4, 2));
                   
                   String s2="Hello i am android developer";
                   
                   System.out.println(s2.startsWith("Hello"));
                   
                   System.out.println(s2.startsWith("Hello", 0));
                   
                   System.out.println(s2.endsWith("developer"));
                   
                   System.out.println(s1.hashCode());
                   
                   System.out.println(s.indexOf(97));
                   
                   System.out.println(s.indexOf(97, 0));
                   
                   System.out.println(s.lastIndexOf(105));
                   
                   System.out.println(s.lastIndexOf(97, 4));
                   
                   System.out.println(s.substring(2));
                   
                   System.out.println(s.substring(2, 4));
                   
                   System.out.println(s.concat(s2));
                   
                   System.out.println(s.replace('i','c'));
                   
                   System.out.println(s2.matches("Hello.*"));
                   
                   System.out.println(s.contains("N"));
                   
                  String[] s3=s2.split("\\s");
                  
                  for(String w:s3)
                  {
                   System.out.println(w);
                  }
                  
                  
                  String str=new String("Hello");
                  String str1="Hello";
                  
                  String str2=str.intern();
                  
                  System.out.println(str==str1);
                  System.out.println(str1==str2);
                  
                  char ch2='m';
                  
                  int i=10;
                  
               
                 System.out.println(str.valueOf(false));
                  
                  System.out.println(str.valueOf(ch2));
                  
                 System.out.println(str.valueOf(i));
                 
               
                 
                   
              }

}
