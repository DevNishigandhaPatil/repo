package Exercise.com;
import java.util.Arrays;

public class CharCount {
  public static void count(String s)
  {
    String s1=s.toLowerCase();
    char[] c=s1.toCharArray();
    System.out.println("Character Array of given String:"+Arrays.toString(c));
    int ch=1;
    for(int i=0;i<c.length;i++)
    {
      if(c[i]=='*')
    	  continue;
      else
      {
    	for(int j=i+1;j<c.length;j++)
    	{
    		if(c[j]==c[i])
    		{
    		  ch++;
    		  c[j]='*';
    		}
    		
    	}
    	System.out.println(c[i]+":"+ch);
    	ch=1;  
      }
    	
    }
	  
  }
	public static void main(String[] args) {
	count("Nishigandha");
}
}
