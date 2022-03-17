package testing;
import java.util.Scanner;
public class _2dArrayOpposite {
	public static void main(String Args[]) {
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter number of rows : ");
		int r=obj.nextInt();
		System.out.print("Enter number of Columns : ");
		int c=obj.nextInt();
		int arr[][]=new int[r][c];
		int rre[][]=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print("enter value for array["+i+"]["+j+"] : ");arr[i][j]=obj.nextInt();
			}
		}
		
		System.out.print("Elements after reverse");
		for(int i=r-1;i>=0;i--)
		{
			System.out.println("");
			for(int j=0;j<c;j++)
			{
				System.out.print(arr[i][j]+"  ");
			}
		}

	}
}