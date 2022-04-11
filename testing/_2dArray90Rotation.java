package testing;
public class _2dArray90Rotation {
	public static void main(String Args[]) {
		int[][] arr={	{1,2,3},
						{4,5,6},
						{7,8,9}
					};
		int[][] rre=new int[3][3]; 
		int x=0,y=0;
		System.out.print("Elements are");
		for(int i=2;i>=0;i--)
		{
			y=0;
			for(int j=0;j<3;j++)
			{
				rre[j][i]=arr[x][y];
				y++;
			}
			x++;
		}
		for(int i=0;i<3;i++)
		{
			System.out.println("");
			for(int j=0;j<3;j++)
			{
				System.out.print(rre[i][j]+"  ");
			}
		}
	}
}
