package testing;

public class reverseNumber {

	public static void main(String[] args) 
	{
		int num=1234;
		int sum=0;
		while (num>0)
		{
			int r=num%10;
			sum=sum*10+r; //number system formula
			num=num/10;
		}
		System.out.print(sum);
		
	}
}