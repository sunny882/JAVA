package testing;

public class palindrom10to100 {
	public static void main(String[] args){
	int numb;
	for (numb=10;numb<=100;numb++){
	int num=numb;
	int sum=0;
	while (num>0)
	{
		int r=num%10;
		sum=sum*10+r; //number system formula
		num=num/10;
	}
		
	if(numb==sum)
	{
		System.out.println(numb+" is palindrom");
	}
}
}
}