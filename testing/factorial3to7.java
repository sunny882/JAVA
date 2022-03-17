package testing;

public class factorial3to7 {
	public static void main(String[] args) {
int num;
for (num=3;num<8;num++)
{
int f=1;
for (int i=num;i>0;i--)
{
	f=f*i;
}
	System.out.println(f);
}
}
}