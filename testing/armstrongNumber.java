package testing;

public class armstrongNumber {
public static void main(String[] args) {

int numb=1634
;
int num=numb;
int t=numb;
int count=0;
int sum=0;
	while (t>0)
	{
		t=t/10;
		++count;
	}
	while (num>0)
	{
		int r=num%10;
		sum=sum+(int)Math.pow(r,count);
		num=num/10;
	}
	System.out.print(numb);
	if(numb==sum)
	{
		System.out.println(" is armstrong");
	}
	else
	{
		System.out.println(" is not armstrong");
	}
}
}