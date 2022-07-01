package com.myprj.ProductJDBC.dbconnect;
import java.sql.*;
public class DataConnect {
	
	private static Connection con;
	private DataConnect()
	{
		con=DataConnect.getConnect();
	}
	public static Connection getConnect()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			//com.mysql.cj.jdbc.Driver
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/map_demo2","root","Chemistry@101");
			System.out.println("Connection established");
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			
		}
		return con;
		
	}

	
	
}
