package Exercise.com;
import java.util.Arrays;

public class NewString {
public static void main(String[] args) {
	String name="Nishigandha";
	int num=4;
	System.out.println(method(name,num));
	
}

public static String method(String s,int num)
{ int count=num;
	String[] sr=new String[s.length()-(num-1)];
	for(int i=0;i<s.length()-(num-1);i++) {
     String str=s.substring(i,count);
	sr[i]=str;

	System.out.println(str);
	count++;
	}
	Arrays.sort(sr);
	System.out.println(Arrays.toString(sr));
	String sp=sr[s.length()-(num)]; 
	return sp;
}
}
