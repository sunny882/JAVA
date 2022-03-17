package testing;

public class counting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=4545;
		int t=num;
		int count=0;
		while (t>0)
		{
			t=t/10;
			++count;
		}
		System.out.print(count);
	}

}
