package testing;
import java.util.Scanner;
public class ArrayDivideEvenOdd 
{
	public static void main(String[] args) 
	{	
		Scanner obj =new Scanner(System.in);				//object creation
		System.out.print("Enter size of array : ");
		int size=obj.nextInt();
		int e=0,v=0;
		int arr[]=new int[size];
		int odd[]=new int[size];
		int even[]=new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.print("Enter element : ");
			arr[i]=obj.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			if(arr[i]%2==0)
			{
				even[e]=arr[i];
				e++;
			}
			else
			{
				odd[v]=arr[i];
				v++;
			}
		}
		obj.close();
		System.out.println("");
		for(int i=0;i<e;i++)
		{
			System.out.println("Element at even["+i+"] = "+even[i]);
			
		}
		System.out.println("");
		for(int i=0;i<v;i++)
		{
			System.out.println("Element at odd["+i+"] = "+odd[i]);
		}
		int merge[]=new int[e+v];
		int x=0,y=0;
		for (int i=0;i<v+e;i++)
		{
			if(i<e)
			{
				merge[i]=even[x];
				x++;
			}
			else
			{
				merge[i]=odd[y];
				y++;
			}
		}
		System.out.println("\nAfter merge ");
		for(int i=0;i<v+e;i++)
		{
			System.out.print(merge[i]+" ");
		}
	}
}
