package inheritance;
class my{
	int x;
	my()
	{
		x=2;
	}
	my(int num)
	{
		x=3*num;
	}
	void fun()
	{
		System.out.println(x);
	}
}
public class Contstructor 
{
	public static void main(String[] args) 
	{
		int num=5;
		my obj=new my();
		obj.fun();
		my obj1=new my(num);
		obj1.fun();
	}
}