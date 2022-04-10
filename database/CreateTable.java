package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable 
{
	public static void name(String S)
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
	public static void value(String S)
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
}
