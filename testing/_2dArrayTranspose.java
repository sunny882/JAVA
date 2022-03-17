package testing;
import java.util.Scanner;
public class _2dArrayTranspose {
	public static void main(String Args[]) {
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter number of rows : ");
		int r=obj.nextInt();
		System.out.print("Enter number of Columns : ");
		int c=obj.nextInt();
		int sum=0,t=0;
		int arr[][]=new int[r][c];
		int rre[][]=new int[c][r];

		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print("enter value for array["+i+"]["+j+"] : ");arr[i][j]=obj.nextInt();
			}
		}
		for(int i=0;i<c;i++)
		{
			for(int j=0;j<r;j++)
			{
				rre[i][j]=arr[j][i];
			}
		}


		System.out.print("Elements after transpose");
		for(int i=0;i<c;i++)
		{
			System.out.println("");
			for(int j=0;j<r;j++)
			{
				System.out.print(rre[i][j]+"  ");
			}
		}
	}
}