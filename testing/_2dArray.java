package testing;
import java.util.Scanner;
public class _2dArray {
	public static void main(String Args[]) {
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter number of rows : ");
		int r=obj.nextInt();
		System.out.print("Enter number of Columns : ");
		int c=obj.nextInt();
		int sum=0;
		int arr[][]=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print("enter value for array["+i+"]["+j+"] : ");arr[i][j]=obj.nextInt();
			}
		}
		System.out.print("Elements are");
		for(int i=0;i<r;i++)
		{
			System.out.println("");
			for(int j=0;j<c;j++)
			{
				System.out.print(arr[i][j]+"  ");
			}
		}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				if(i==j)
				{
					sum=sum+arr[i][j];
				}
			}
		}
		obj.close();
		System.out.println("\nsum of diagonal number : "+sum);
	}
}
