package oops;
class fact{
	int f(int x)
	{
		int ans=1;
		for(int i=x;i>0;i--)
		{
			ans=ans*i;
		}
		return(ans);
	}
	int sq(int a,int b)
	{
		int ans=1;
		for(int i=1;i<=b;i++)
		{
			ans=ans*a;
		}
		return(ans);	
	}
	void sqseries(int x) {
		int ans=0;
		int num=x;
		for(int i=num;i>=1;i--)
		{
			ans=ans+sq(i,i);
		}
		for(int i=num;i>0;i--) {
			System.out.print(i+"^"+i);
			if(i>1)
			{
				System.out.print("+");
			}
			else{
				System.out.print("=");
			}

		}
		System.out.print(ans);
		System.out.println("");
	}

}
public class _CallByVallue {

	public static void main(String[] args) {
		fact obj=new fact();
		obj.sqseries(7);
		System.out.println(obj.sq(2, 3));
	}
}
