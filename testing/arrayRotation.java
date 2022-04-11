package testing;

import java.util.Scanner;

public class arrayRotation {
	public static void main(String[] args) {
		Scanner obj =new Scanner(System.in);				//object creation
		System.out.print("Enter size of array : ");
		int size=obj.nextInt();
		int t=0;
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.print("Enter element : ");
			arr[i]=obj.nextInt();
		}
		System.out.print("Enter number of rotation : ");
		int n=obj.nextInt();
		for(int j=0;j<n;j++){
			t=arr[0];
			for(int i=1;i<size;i++)
			{
				arr[i-1]=arr[i];		
			}
			arr[size-1]=t;
		}
		obj.close();
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}
}