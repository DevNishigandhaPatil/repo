package Exercise.com;
import java.util.Arrays;

public class SortNumber {
public static void main(String[] args) {
	int[] num= {5,2,3,4,1,0,6,8,10,9,7};
	int[] num1=sort(num);
	System.out.println(Arrays.toString(num1));
}

public static int[] sort(int[] num)
{int temp=0;
	for(int i=0;i<num.length;i++)
		for(int j=i+1;j<num.length;j++)
		{
			if(num[i]>num[j])
			{
				temp =num[i];
				num[i]=num[j];
				num[j]=temp;
			}
		}
	return num;
}
}
