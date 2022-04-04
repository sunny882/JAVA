package oops;
class time
{
	private int hr,min,sec,mil;
	void value(int h, int m, int s,int ms) 
	{
		hr=h;
		min=m;
		sec=s;
		mil=ms;
	}
	void show() 
	{
		System.out.println(hr+":"+min+":"+sec+":"+mil);
	}
	time sum(time t)
	{
		time obj=new time();
		obj.mil=(mil+t.mil)%1000;
		int seci=(mil+t.mil)/1000;
		obj.sec=(sec+t.sec+seci)%60;
		int mini=(sec+t.sec+seci)/60;
		obj.min=(min+t.min+mini)%60;
		int hri=(min+t.min+mini)/60;
		obj.hr=(hr+t.hr+hri);
		return obj;
	}
}
public class timeOops 
{
	public static void main(String[] args) 
	{
		time t1= new time();
		time t2= new time();
		t1.value(1,30,30,500);
		t2.value(1,29,29,500);
		t2=t2.sum(t1);
		t2.show();
	}
}