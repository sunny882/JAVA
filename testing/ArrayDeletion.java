package testing;
import java.util.Scanner;
public class ArrayDeletion {

	public static void main(String[] args) {
		Scanner obj =new Scanner(System.in);				//object creation
		System.out.print("Enter size of array : ");
		int size=obj.nextInt();
		int pos;
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.print("Enter element : ");
			arr[i]=obj.nextInt();
		}
		System.out.print("enter position for deletion: ");
		pos=obj.nextInt();
		if(pos<size)
		{
			for(int i=pos;i<size-1;i++)
			{
				arr[i]=arr[i+1];
			}
			System.out.println("after deletion");
			for(int i=0;i<size-1;i++)
			{
				System.out.print(arr[i]+" ");
			}
		}
		else{
			System.out.println("out of bound");
		}
		obj.close();
	}
}
