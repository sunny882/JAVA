package testing;

public class primeBetween50to100 {

	public static void main(String[] args)
	{
		int c=0;
		for(int num=1;    ;num++)
		{
			int i;
			for(i=2;i<num;i++)
				{
				if (num%i==0)
					{
						break;
					}
				}
		if (i==num)
		{
			System.out.println(num+" is prime");
			++c;
			
		}
		if (c==10)
		{
			break;
		}
		}
	}
}