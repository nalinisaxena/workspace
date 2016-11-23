package StringHandDemo;

public class StringCom {

	

	public static void main(String[] args) {

            String s="Nalini";
            
            char[] ch=s.toCharArray();
            
            for(int i=0;i<s.length()-1;i++)
            {
            	for(int j=i+1;j<s.length()-1;j++)
            	{
            		if (ch[j-1].compareTo(ch[j])>0
            		{
            			char temp=ch[j-1];
            			ch[j-1]=ch[j];
            			ch[j]=temp;
            		}
            		 s=String.valueOf(ch);
                     System.out.println(s);
            	}
            }
           
	}

}
