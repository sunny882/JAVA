package testing;
import java.util.Scanner;
import java.util.Scanner;

public class EvenOddArray {
	public static void main(String[] args) {
		Scanner obj =new Scanner(System.in);				//object creation
		System.out.print("Enter size of array : ");
		int size=obj.nextInt();
		int sum1=0,sum2=0;
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.print("Enter element : ");
			arr[i]=obj.nextInt();
		}
		System.out.println();
		for(int i=0;i<size;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println("This is Even : "+arr[i]);
				sum1=sum1+arr[i];
			}
			else
			{
				System.out.println("This is Odd : "+arr[i]);
				sum2=sum2+arr[i];
			}
		}
		System.out.println("Sum of Even numbers : "+sum1);
		System.out.println("Sum of Odd numbers : "+sum2);
	}
}