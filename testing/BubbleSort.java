package testing;
import java.util.Scanner;
public class BubbleSort {

	public static void main(String[] args) {
		Scanner obj =new Scanner(System.in);
		System.out.print("Enter size of array : ");
		int size=obj.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.print("Enter element : ");
			arr[i]=obj.nextInt();
		}
		int t=0;
		for(int i=0;i<size-1;i++)
		{
			for(int j=0;j<size-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					t=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=t;
				}
			}
		}
		System.out.println();
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}