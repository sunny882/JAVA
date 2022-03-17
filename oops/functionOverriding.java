package oops;
class abc{
	void fun(){
	System.out.println("funtion in parent class");
	}
}
public class functionOverriding extends abc{
	void fun(){
		System.out.println("function in child class");
		super.fun(); //used to access parent class's properties
	}
	public static void main(String[] args) 
	{
		functionOverriding obj= new functionOverriding();
		obj.fun();
	}
}
