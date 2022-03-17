package testing;

public class prime {

	public static void main(String[] args) {
		int num=13;
		int i;
		for(i=2;i<num;i++)
		{
			if(num%i==0)
			{
				System.out.println("not prime");
				break;
			}
		}
			if(i==num)
			{
				System.out.println("prime");
			}
		}		

	}


