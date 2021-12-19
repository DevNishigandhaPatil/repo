package Exercise.com;
import java.util.Scanner;

public class NameAndNumber {
public static void main(String[] args) {
	String name="Nishigandha";
	int num=999;
	String s1="Madhuri";
	int n1=1;
	String s2="sonali";
	int n2=20;
	method(name,num);
	method(s1,n1); 
	method(s2,n2);
	
}
public static void method(String name,int num)
{
	System.out.print(name);
        for(int j=1;j<15-name.length();j++)
        {
        	System.out.print(" ");
        }
            
          if(num<100 && num>10) {
        	System.out.print("0"+num);}
        	else if(num<10){
          System.out.println("00"+num);}
          else
        	  System.out.println(num);
        	
	}
}



