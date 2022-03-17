package testing;
import java.util.Scanner;

public class ArrayDeletionSearch {

	public static void main(String[] args) {
		Scanner obj =new Scanner(System.in);				//object creation
		System.out.print("Enter size of array : ");
		int size=obj.nextInt();
		int i=0,num,pos=0,x=0;
		int arr[]=new int[size];
		for(i=0;i<size;i++)
		{
			System.out.print("Enter element : ");
			arr[i]=obj.nextInt();
		}
		System.out.print("Enter Element you want to delete :");
		num=obj.nextInt();
		for(i=0;i<size;i++)
		{
			if(arr[i]==num)
			{
				pos=i;
				x++;
				break;
			}
		}
		if(i==size)
		{
			System.out.println("Element not found");
		}
		if(x>0)
		{
			System.out.println("after deletion");
			for(i=pos;i<size-1;i++)
			{
				arr[i]=arr[i+1];
			}
			for(i=0;i<size-1;i++)
			{
				System.out.print(arr[i]+" ");
			}	
		}
	}
}