package testing;
import java.util.Scanner;
public class swap2firstandlast 
{
	public static void main(String[] args) 
	{
		Scanner obj =new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num=obj.nextInt();
		int t=num;
		int count=0;
		while (t>0)	{
			t=t/10;
			++count;
		}
		int mod=(int) Math.pow(10, count-1);
		int last=num%10;
		int first=num/mod;
		num=num/10*10+first;
		num=num%mod;
		last=last*mod+num;
		System.out.println("After Swapping : "+last);
	}
}