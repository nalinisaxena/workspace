package StringProgram;

public class removewhitespace {


	public static void main(String[] args) {

           String str="i am the best  intelligent  good";
           
           String str1=str.replaceAll("\\s","");
           
           System.out.println(str1);
           
           
           //with out using replace all method
           
           char[] ch=str.toCharArray();
           
           StringBuffer sb=new StringBuffer();
           
           for(int i=0;i<ch.length;i++)
           {
        	   if((ch[i]!=' ')&& (ch[i]!='\t'))
        	   {
        		   sb.append(ch[i]);
        	   }
           }
           
           System.out.println(sb);
           
           
           
	}

}
