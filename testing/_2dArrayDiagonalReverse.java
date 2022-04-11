package testing;
import java.util.Scanner;
public class _2dArrayDiagonalReverse {
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
		obj.close();
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
			if(i+j==2)
			{
				sum=sum+arr[i][j];
			}
			}
		}
		System.out.print("sum of reverse diagonal numbers : "+sum);
	}
}