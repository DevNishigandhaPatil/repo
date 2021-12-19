package Exercise.com;

public class PrintStatement {
public static void main(String[] args) {
	number(10000000000l);
}

public static void number(long num)
{
  if(num>-128 && num<127)	
	  System.out.println("Number is Byte");
  if(num>-32768 && num<32768)
	  System.out.println("Number is Short");
  if(num>-2147483648 && num<2147483647)
	  System.out.println("Number is Int");
  if(num>-9223372036854775808l && num<922337203685477580l)
	  System.out.println("Number is Long");
	  
}
}
