package testing;

public class strongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int numb=145;
int num=numb;
int f=1;
int sum=0;
int r=0;
	while(num>0)
		{
		r=num%10;
		f=1;
		for(int i=r;i>0;i--)
		{
			f=i*f;
		}
		sum=sum+f;
		num=num/10;
		}
	System.out.print(sum);
	if(numb==sum)
	{
		System.out.println(" is strong number");
	}
	else
	{
		System.out.println(" is not strong number");
	}
}
}