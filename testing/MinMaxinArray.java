package testing;
import java.util.Scanner;

public class MinMaxinArray {
	public static void main(String[] args) {
		Scanner obj =new Scanner(System.in);				//object creation
		System.out.print("Enter size of array : ");
		int size=obj.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.print("Enter element : ");
			arr[i]=obj.nextInt();
		}
		int min=arr[0];
		int max=arr[0];
		for(int i=1;i<size;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
			if(min>arr[i])
			{
				min=arr[i];

			}
		}
		System.out.println("Minimum of array is : "+min);
		System.out.println("Maximum of array is : "+max);
	}
}