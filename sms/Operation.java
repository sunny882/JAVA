package sms;

import java.util.Scanner;

public class Operation 
{
	
	static void set(Student arr[])
	{
		Scanner in= new Scanner(System.in);
		for (int i = 0; i < 3; i++)
		{
			Student obj=new Student();
			System.out.print("Enter Roll No. : ");
			int roll=in.nextInt();
			System.out.print("Enter Name : ");
			String name=in.nextLine();
			name=in.nextLine();
			obj.setRoll(roll);
			obj.setName(name);
			arr[i]=obj;	
		}
		in.close();
	}
	static void display(Student arr[])
	{
		for (int i = 0; i < 3; i++)
		{
			Student obj=arr[i];
			System.out.println(obj.getRoll()+"\t"+obj.getName());
		} 
	}
}