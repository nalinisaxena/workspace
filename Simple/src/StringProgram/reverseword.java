package StringProgram;

public class reverseword {


	public static void main(String[] args) {

		         String input="my name is nalini";
                 String[] words=input.split(" ");
                 
                 String reverseString=" ";
                 
                 for(int i=0;i<words.length;i++)
                 {
                	String word=words[i];
                	String reverseword=" ";
                	
                	for(int j=word.length()-1;j>=0;j--)
                	{
                		reverseword=reverseword+word.charAt(j);
                	}
                	reverseString=reverseString+reverseword+" ";
                 }
                 System.out.println(input);
                 System.out.println(reverseString);
	}

}
