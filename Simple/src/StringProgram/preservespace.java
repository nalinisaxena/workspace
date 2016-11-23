package StringProgram;

public class preservespace {

	

	public static void main(String[] args) {

          String str="nalini is the best";
          
          char[] ch=str.toCharArray();
          
          char[] resultArray=new char[ch.length];
          
          for(int i=0;i<ch.length;i++)
          {
        	  if(ch[i]==' ')
        	  {
        		  resultArray[i]=' ';
        	  }
          }
          
		int j=resultArray.length-1;
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=' ')
			{
				if(resultArray[j]==' ')
				{
				  j--;	
				}
				
				resultArray[j]=ch[i];
				j--;
			}
		}
		System.out.println(String.valueOf(resultArray));
	}

}
