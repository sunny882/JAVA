package testing;
public class arrayOperation 
{
	public static void main(String[] args) 
	{
		int arr[]={1,2,3,4,5};
		int t=0,sum;
		for(int i=0;i<arr.length;i++)
		{
			sum=0;
			t=arr[i];
			for (int j=0;j<arr.length;j++)
			{
				sum=sum+arr[j];
			}
			sum=sum-t;
			t=t*sum;
			System.out.print(t+" ");
		}
	}
}