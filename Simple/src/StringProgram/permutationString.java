package StringProgram;

public class permutationString {



	public static void main(String[] args) {

          permuteString(" ","ABC");
          
	}
	
	public static void permuteString(String beggingString,String endString)
	{
		if(endString.length() <=1)
		{
			System.out.println(beggingString+endString);
		}
		else
		{
			for(int i=0;i<endString.length();i++)
			{
				String newString=endString.substring(0,i)+endString.substring(i+1);
				permuteString(beggingString+endString.charAt(i),newString);
							
			}
		}
	}

}
