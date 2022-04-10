package database;
import java.sql.*;

public class Connect 
{
	public static Connection con()
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");//load driver
			String url="jdbc:mysql://localhost:3306/test";
			String username="root";
			String password="";
			Connection conn=DriverManager.getConnection(url,username,password);
			return conn;
		}
		catch(Exception e)
		{
			System.out.println("Table file error:"+e);
		}
		return null;
	}	
}