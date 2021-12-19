package Exercise.com;
import java.util.Arrays;
import java.util.List;

public class SubArray {
public static void main(String[] args) {
	int[] arr= {1,2,-5,3,-2};
	System.out.println(countOfSumArray(arr));
}

public static int countOfSumArray(int[] arr)
{int sum=0;int count=0;int j;
	for(int i=0;i<=arr.length-1;i++)
	{
		sum=arr[i];
		if(sum<0)
		{
			count++;
		}
	   for(j=i+1;j<=arr.length-1;j++)
	   {
		   sum=sum+arr[j];
		   if(sum<0)
		   {
			   count++;
		   }
	   }   
	  
	}
	return count;
}
}
