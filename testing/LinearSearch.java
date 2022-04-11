package testing;
import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		try (Scanner obj = new Scanner(System.in)) {
			System.out.print("Enter size of array : ");
			int size=obj.nextInt();
			int i=0;
			int arr[]=new int[size];
			for(i=0;i<size;i++)
			{
				System.out.print("Enter element : ");
				arr[i]=obj.nextInt();
			}
			System.out.print("Enter Element you want to seach :");
			int item=obj.nextInt();
			
			System.out.println();
			for(i=0;i<size;i++)
			{
				if(arr[i]==item)
				{
					System.out.println("Element found at a["+i+"] = "+""+arr[i]);
					break;
				}
			}
			if(i==size)
			{
				System.out.println("Element not found");
			}
		}
	}
}