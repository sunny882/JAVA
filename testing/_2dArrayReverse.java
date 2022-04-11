package testing;
import java.util.Scanner;
public class _2dArrayReverse {
	public static void main(String Args[]) {
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter number of rows : ");
		int r=obj.nextInt();
		System.out.print("Enter number of Columns : ");
		int c=obj.nextInt();
		int arr[][]=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print("enter value for array["+i+"]["+j+"] : ");arr[i][j]=obj.nextInt();
			}
		}
		obj.close();
		System.out.print("Elements after reverse");
		for(int i=0;i<r;i++)
		{
			System.out.println("");
			for(int j=c-1;j>=0;j--)
			{
				System.out.print(arr[i][j]+"  ");
			}
		}

	}
}