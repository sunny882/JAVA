package database;

import java.sql.Connection;
import java.sql.Statement;

public class Insert {
	public static void Col (String S)
	{
		try 
		{
			Statement st=Connect.con().createStatement();
			String str="ALTER TABLE `"+S+"` ADD `id` INT(10) NOT NULL AFTER `sr no`, ADD `name` VARCHAR(255) NOT NULL AFTER `id`;";
			int x=st.executeUpdate(str);
			if (x==0) 
			{
				System.out.println("ok");
			}
			else 
			{
				System.out.println("not ok");
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void vale(String S, int id,String name)
	{
		try 
		{
			Statement st=Connect.con().createStatement();
			String str="INSERT INTO `"+S+"` (`sr no`, `id`, `name`) VALUES (NULL, '"+id+"', '"+name+"');";
			int x=st.executeUpdate(str);
			if (x==0) 
			{
				System.out.println("not ok");
			}
			else {
				System.out.println("ok");
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
