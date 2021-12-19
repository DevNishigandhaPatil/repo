package Exercise.com;
import java.util.Arrays;

public class MobilePassword {
	public static void main(String[] args) {
		String l="7507900297";
		//System.out.println(mobi(l));
		System.out.println(starMobi(7507900297l));
	}

	public static String mobi(String l)
	{
//		l=l.replace(l.substring(0, 6), "******")	;
//		return l;
	//	
		char[] ch=l.toCharArray();
		char[] ch1=new char[ch.length];
		for(int i=0;i<ch.length;i++)

		{
			if(i<5)
			{
				ch1[i]='*';
			}
			else
			{
				ch1[i]=ch[i];
			}
		}
		return new String(ch1);
	}
	public static String starMobi(long l)
	{
		int[] num=new int[4];
		for(int i=num.length-1;i>0;i--)
		{
			int rem=(int) (l%10);
		     num[i]=rem;
		     l=l/10;
		     System.out.println(Arrays.toString(num));
		}
	    String ss=Arrays.toString(num);
		String s="******";
		ss=ss.replace(",", "").replace("[", "").replace("]", "").replace(" ", "");
//		ss=ss.replace("[", "");
//		ss=ss.replace("]", "");
//		ss=ss.replace(" ","");
		String s1=s.concat(ss);
		return s1;
	}
	}

