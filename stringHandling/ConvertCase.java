package stringHandling;

public class ConvertCase 
{
	static String inverse(String str)
	{
		String g  =  "";
		char ch;
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			if (ch>=65&&ch<=90) 
			{
				ch=(char) (ch+32);
			}
			else if (ch>=97&&ch<=123)
			{
				ch=(char) (ch-32);
			}
			g  =  g  + ch;
		}
		return g;
	}
	static String upper(String str)
	{
		String g  =  "";
		char ch;
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			if (ch>=97&&ch<=122) 
			{
				ch=(char) (ch-32);
			}
			g  =  g  + ch;
		}
		return g;
	}
	static String lower(String str)
	{
		String g  =  "";
		char ch;
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			if (ch>=65&&ch<=97) 
			{
				ch=(char) (ch+32);
			}
			g  =  g  + ch;
		}
		return g;
	}
}