package testing;

public class palindrom {

	public static void main(String[] args) {
		int numb=123232321;
		int num=numb;
		int sum=0;
		while (num>0)
		{
			int r=num%10;
			sum=sum*10+r; //number system formula
			num=num/10;
		}
		System.out.print(sum);
		
		if(numb==sum)
		{
			System.out.println(" is palindrom");
		}
		else
		{
			System.out.println(" is not palindrom");
		}
	}

}
