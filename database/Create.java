package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Create 
{
	public static void Table(String S)
	{
		try 
		{
			Connection conn=Connect.con();
			Statement st=conn.createStatement();
			String str="CREATE TABLE `"+S+"` ( `sr no` INT NULL DEFAULT NULL AUTO_INCREMENT , PRIMARY KEY (`sr no`))";
			int x=st.executeUpdate(str);
			if (x==0) 
			{
				System.out.println("ok");
			}
			else {
				System.out.println("not ok");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void colums(String S)
	{
		try 
		{
			String nm="";
			int ty,check,ln,x,l = 0;
			String type = null;
			String str;
			for(int i=1;   ;i++) 
			{
				Connection conn=Connect.con();
				Statement st=conn.createStatement();
				Scanner s=new Scanner(System.in);
				System.out.println("enter name of column");
				nm=s.next();
				System.out.println("enter type of column");
				System.out.println("1=Text");
				System.out.println("2=integer");
				ty=s.nextInt();
				if(ty==1)
				{
					type="varchar";
				}
				else if(ty==2)
				{
					type="int";
				}
				else
				{
					System.out.println("error");
					break;
				}
				System.out.println("Enter length");
				ln=s.nextInt();
				str="ALTER TABLE `"+S+"` ADD `"+nm+"` INT("+ln+");";
				x=st.executeUpdate(str);
				if (x==0) 	
				{
					System.out.println("ok");
				}
				else 
				{
					System.out.println("not ok");
				}
				System.out.println("add another column?");
				System.out.println("1=Yes");
				System.out.println("2=No");
				l=s.nextInt();
				if (l==1) {
					
				}
				else
				{
					break;
				}
			}
					}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
