package stringHandling;

public class Replace 
{
	public static void main(String[] args) 
	{
		String s="chandigarh university";
		String a="";
		for(int i=0;i<s.length();i++)
		{
			a=a+s.charAt(i);
		}
		System.out.println(a);
	}
}