package testing;
import java.util.Scanner;
public class ArrayIncrement {

	public static void main(String[] args) {
		Scanner obj =new Scanner(System.in);				//object creation
		System.out.print("Enter size of array : ");
		int size=obj.nextInt();
		int num,pos;
		int arr[]=new int[size+1];
		for(int i=0;i<size;i++)
		{
			System.out.print("Enter element : ");
			arr[i]=obj.nextInt();
		}
		System.out.print("enter element you want to add : ");
		num=obj.nextInt();
		System.out.print("enter position you want to add : ");
		pos=obj.nextInt();
		obj.close();
		for(int i=size-1;i>=pos;i--)
		{
			arr[i+1]=arr[i];
		}
		arr[pos]=num;
		System.out.println();
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}