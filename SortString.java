package Exercise.com;

public class SortString {
public static void main(String[] args) {
	String s="geeksforgeeks";
	String s1=sort(s);
	System.out.println(s1);
}


public static String sort(String s)
{ char temp;
s=s.toLowerCase();
char[] ch=s.toCharArray();
	for(int i=0;i<ch.length;i++)
		for(int j=i+1;j<ch.length;j++)
		{
			if(ch[i]>ch[j])
			{
				temp =ch[i];
				ch[i]=ch[j];
				ch[j]=temp;
			}
		}
	return new String(ch);
}

}
