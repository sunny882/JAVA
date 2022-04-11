package testing;
import java.util.Scanner;
public class array {

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
		System.out.println();
		for(int i=0;i<size;i++)
		{
			System.out.println("Element at a["+i+"] = "+arr[i]);
		}
		obj.close();
	}
}