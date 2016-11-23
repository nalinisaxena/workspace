package StringDemo;

public class Occur {


	public static void main(String[] args) {

        String input="Hello Hunney Bunney";
        
        int charcount=0;
        
        for(int i=0;i<input.length();i++)
        {
        	if(input.charAt(i)=='n')
        	{
        		charcount++;
        	}
         }
        
        System.out.println(charcount);
	}

}
