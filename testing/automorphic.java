package testing;

public class automorphic {

	public static void main(String[] args) {
		int numb=25;
		int t=numb;
		double sq=0;
		int count=0;
		while (t>0)
		{
			t=t/10;
			++count;
		}
		sq=Math.pow(numb, 2);
		double mod=Math.pow(10, count);
		if(numb==sq%mod){
			System.out.println("number is automorphic");
		}
		else{
			System.out.println("number is not automorphic");
		}
			
	}

}