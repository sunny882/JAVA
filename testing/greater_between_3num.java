package testing;

public class greater_between_3num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=15, b=66, c=344;
		if(a>b)
		{
			if(a>c)
			{
				System.out.println(a+" is greater than "+b+" and "+c);
			}
			else
			{
				System.out.println(c+" is greater than "+a+" and "+b);
			}
			
		}
		else 
		{
			if(b > c)
			{
				System.out.println(b+" is greater than "+a+" and "+c);
			}
			else
			{
				System.out.println(c+" is greater than "+a+" and "+b);
			}
		}
		}
	

}
