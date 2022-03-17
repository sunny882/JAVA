package oops;

public class _funOverloading {
void fun()
{
	System.out.println("function 1");
}
void fun(int x)
{
	System.out.println("funtion 2");
}
	public static void main(String[] args) {

		_funOverloading obj=new _funOverloading();
		obj.fun();
		obj.fun(1);
	}
}
