package testing;
public class Frequency 
{
	public static void main(String[] args) 
	{
		int arr[]={1,2,2,4,4,4,5,5};
		int fre[]={-1,-1,-1,-1,-1,-1,-1,-1};
		int count;
		for(int i=0;i<arr.length;i++)
		{
			count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					fre[j]=0;
				}
				if(fre[i]!=0)
				{
					fre[i]=count;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(fre[i]>=1)
			{
				System.out.println(arr[i]+" comes "+fre[i]+" times ");
			}
		}
	}
}